package practice2;

import org.apache.tomcat.util.scan.Constants;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandler;

/**
 * @author xutong
 */
public class ServletProcessor1 {
    public void process(Request request, Response response) {
        String uri = request.getUri();
        String servletName = uri.substring(uri.lastIndexOf("/") + 1);
        URLClassLoader loader = null;
        try {
            URL[] urls = new URL[1];
            URLStreamHandler streamHandler = null;
            File classPath = new File(Constants.WEB_INF_LIB);
            String repository = (new URL("file", null,
                    classPath.getCanonicalPath() + File.separator)).toString();
            urls[0] = new URL(null, repository, streamHandler);
            loader = new URLClassLoader(urls);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        Class myClass = null;
        try {
            myClass = loader.loadClass(servletName);
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
        Servlet servlet = null;
        try {
            servlet = (Servlet) myClass.getDeclaredConstructor().newInstance();
            servlet.service(request, response);
        } catch (IllegalAccessException | NoSuchMethodException | InstantiationException | InvocationTargetException | ServletException | IOException e) {
            System.out.println(e.toString());
        }
    }
}
