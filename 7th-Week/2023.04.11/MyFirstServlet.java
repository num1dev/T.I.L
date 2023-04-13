package core;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.DayOfWeek;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet( name = "myfirst", urlPatterns = { "/myfirst" } )
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		LocalDate date = LocalDate.now();
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		int dayOfWeekNumber = dayOfWeek.getValue();
		String day = "";
		switch(dayOfWeekNumber) {
		case 1:
			day = "월";
			break;
		case 2:
			day = "화";
			break;
		case 3:
			day = "수";
			break;
		case 4:
			day = "목";
			break;
		case 5:
			day = "금";
			break;
		case 6:
			day = "토";
			break;
		case 7:
			day = "일";
			break;
		}
		
		String userName = request.getParameter("guestName");
		if (userName == null) {
			out.print("<h2>Guest님 반가워요.. 오늘은 "+
	                  day +"요일입니다!</h2>");
		}
		
		else {
			out.print("<h2>"+userName+ "님 반가워요.. 오늘은 " + day +"요일입니다!</h2>");
		}
		
		out.close();
	}
}
