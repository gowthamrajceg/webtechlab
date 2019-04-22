import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hello extends HttpServlet
{
private String message;

public void init() throws ServletException
{
message="hello world";
}

public void doGet(HttpServletRequest request,HttpServletResponse response)
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("<h1>"+messag+"<h1>");

}
}
