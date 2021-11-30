package servlet;

import practice2.ServletProcessor1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author xutong
 */
public class HttpProcessor {
    public void processs(Socket socket) {
//        SocketInputStream input = null;
//        OutputStream outputStream = null;
//        try {
//            input = new SocketInputStream(socket.getInputStream(), 2048);
//            outputStream = socket.getOutputStream();
//            request = new HttpRequest(input);
//            response = new HttpResponse(outputStream);
//            response.setRequest(request);
//            response.setHeader("Server", "Pyrmont Servlet Container");
//
//            parseRequest(input, outputStream);
//            parseHeaders(input);
//            if (request.getRequestURI().startsWith("/servlet/")) {
//                ServletProcessor1 processor1 = new ServletProcessor1();
//                processor1.process(request, response);
//            }
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
