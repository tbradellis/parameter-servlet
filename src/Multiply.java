import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Multiply", urlPatterns = "/multiply")
public class Multiply extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int a = Integer.parseInt(request.getParameter("number3"));
        int b = Integer.parseInt(request.getParameter("number4"));
        PrintWriter out = response.getWriter();
        out.println("result: " + (a * b));

        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies){

            out.println(cookie.getName() + " " + cookie.getValue());
            out.println(cookie.getComment());
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int c = Integer.parseInt(request.getParameter("number1"));
        int d = Integer.parseInt(request.getParameter("number2"));
        PrintWriter out = response.getWriter();
        out.println("result: " + (c * d));

        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies){
            out.println(cookie.getName() + " " + cookie.getValue());
            out.println(cookie.getComment());
            response.addCookie(cookie);

        }
    }
}
