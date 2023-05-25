//	Servlet:
//a.) Servlet Context interface.
//b.) get Parameter Values () of Servlet Request.
//
//2.	Write a Servlet page to display current date of the server.
//3.	Write a Servlet page to which include the two other Servlet page through of include directives feature provided in Servlet.
//4.	Write a Servlet page to create a simple calculator.


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
