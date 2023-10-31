import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {

//    A similar process is followed for POST requests, but with the doPost method, instead of doGet.
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //String name = request.getParameter("cohort");
//        System.out.println("the parameter" + cohort);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");

//        out.println("<h1>Hello, + " + name + "!</h1>");
        if (name == null) {
            name = "Java";
        }
            out.println("<h1>Hello, " + name + "!</h1>" );
    }

}
