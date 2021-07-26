package dubbo.demo;

import lombok.SneakyThrows;

import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xutong
 */
public class XtyRpcFramework {
    public static void export(Object service, int port) throws Exception {
        ServerSocket serverSocket = new ServerSocket(port);
        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(new Runnable() {
                @SneakyThrows
                @Override
                public void run() {
                    ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
                    String methodName = String.valueOf(input.read());
                    Class<?>[] parameterTypes = (Class<?>[]) input.readObject();
                    Object[] arguments = (Object[]) input.readObject();
                    Method method = service.getClass().getMethod(methodName, parameterTypes);
                    Object result = method.invoke(service, arguments);
                    ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                    outputStream.writeObject(result);
                }
            }).start();
        }
    }

    public static <T> T refer(Class<T> interfaceClass, String host, int port) {
        return (T) Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class<?>[]{interfaceClass}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });
    }
}
