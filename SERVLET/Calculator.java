//	Servlet:
//a.) Servlet Context interface.
//b.) get Parameter Values () of Servlet Request.
//
//2.	Write a Servlet page to display current date of the server.
//3.	Write a Servlet page to which include the two other Servlet page through of include directives feature provided in Servlet.
//4.	Write a Servlet page to create a simple calculator.

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Calculator extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException { 
response.setContentType("text/html;charset=UTF-8"); 
PrintWriter out = response.getWriter();



double n1 = Double.parseDouble(request.getParameter("txtN1"));
double n2 = Double.parseDouble(request.getParameter("txtN2"));
double result =0;
String opr=request.getParameter("opr");



if(opr.equals("+")) 
result=n1+n2;
if(opr.equals("*")) 
result=n1*n2;
out.println("<h1> Result = "+result);
if(opr.equals("-")) 
result=n1-n2;
if(opr.equals("/")) 
result=n1/n2;
//out.println("</body></html>");
}  }
