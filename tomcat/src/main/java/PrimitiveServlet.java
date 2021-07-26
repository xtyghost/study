import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author xutong
 */
public class PrimitiveServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("from service");
        PrintWriter out = servletResponse.getWriter();
        String errorMessage = "HTTP/1.1 404 FIle Not Found\r\n" +
                "Constent-Type: text/html\r\n" +
                "Content-Length:23\r\n" +
                "\r\n" +
                "<h1>hello Rose are red </h1>";
        out.println(errorMessage);
//        out.print("Violets are blue");
    }




    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
