
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Calculator1 extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response)
{
    try{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.print("<head>");
        out.print("<body>");
        out.print("<form name='f1'>");
        out.print("<table bgcolor='yellow'>");
        out.print("<tr>");
        out.print("<td> enter  first no </td>");
        out.print("<td><input type='text' name='txtfno' value='' /> </td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td> enter second no </td>");
        out.print("<td><input type='text' name='txtsno' value='' /> </td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td><input type='submit' name='btnadd' value='ADD' /> </td>");
        out.print("<td><input type='submit' name='btnsub' value='SUB' /> </td>");
        out.print("</tr>");
        out.print("</form");
        out.print("</table>");
        out.print("</body");
        out.print("</head>");
        out.print("</html>");
        
        int a,b,rs=0;
        
        a=Integer.parseInt(request.getParameter("txtfno"));
         b=Integer.parseInt(request.getParameter("txtsno"));
         
         if(request.getParameter("btnadd")!=null)
         {

rs=a+b;
out.print("Result:"+rs);
     }
if(request.getParameter("btnsub")!=null)
         {

rs=a-b;
out.print("Result:"+rs);
     }
}
    catch(Exception ex)
    {
    ex.printStackTrace();
    }
}

public void doPost(HttpServletRequest request, HttpServletResponse response)
{
try{}
catch(Exception ex)
{ex.printStackTrace();}
}

public void destroy()
{}
}
  