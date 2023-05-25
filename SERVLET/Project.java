import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
public class Project extends HttpServlet{
public void service(HttpServletRequest request, HttpServletResponse response)
 throws IOException, ServletException
{

PrintWriter out = response.getWriter();
out.println("This is the program to find the data and time of your server");
out.println("Welcome to the server: "+ new Date());
out.close();
}
}