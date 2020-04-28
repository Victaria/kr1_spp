import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/DemoServlet")

public class DemoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        int count1 = 0, count2 = 0, count3 = 0;

        String str1 = request.getParameter("str1");
        String str2 = request.getParameter("str2");
        String str3 = request.getParameter("str3");

        if (!str1.isEmpty()){
            for (int i = 0; i< str1.length(); i++){
                if (i > 0)
                if ((str1.charAt(i) == ' ' &&  str1.charAt(i-1) != ' ') || (i == str1.length()-1 && str1.charAt(i-1) != ' '))
                    count1++;
            }
        }
        if (!str2.isEmpty()){
            for (int i = 0; i< str2.length(); i++){
                if (i > 0)
                    if ((str2.charAt(i) == ' ' &&  str2.charAt(i-1) != ' ') || (i == str2.length()-1 && str2.charAt(i-1) != ' '))
                        count2++;
            }
        }
        if (!str3.isEmpty()) {
            for (int i = 0; i < str3.length(); i++) {
                if (i > 0)
                if ((str3.charAt(i) == ' ' &&  str3.charAt(i-1) != ' ') || (i == str2.length()-1 && str2.charAt(i-1) != ' '))
                    count3++;
            }
        }

        request.setAttribute("count1", count1);
        request.setAttribute("count2", count2);
        request.setAttribute("count3", count3);

        this.doGet(request, response);
    }
}
