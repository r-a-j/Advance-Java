import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddServlet extends HttpServlet 
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String str1 = request.getParameter("num1");
        String str2 = request.getParameter("num2");
        
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        
        int c = a+b;
        
        out.print("<h1>Additiion is : </h1>"+c);
    }
}
