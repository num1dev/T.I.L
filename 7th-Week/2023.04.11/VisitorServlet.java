package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "visitor", urlPatterns = { "/visitor" })
public class VisitorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		
		String userName = request.getParameter("stname");
		String userMemo = request.getParameter("memo");
		LocalDate date = LocalDate.now();
		int year = date.getYear();// 연

		Month monthInstance = date.getMonth();// 월
		int month = monthInstance.getValue();

		int day = date.getDayOfMonth();// 일

		if (userName.isEmpty() || userName == null) {
			out.print("<h2>Guest님이 " + year + " 년 " + month + " 월 " + day + "일에 남긴 글입니다</h2>");
		}

		else {
			out.print("<h2>" + userName + "님이" + year + " 년 " + month + " 월 " + day + "일에 남긴 글입니다</h2>");
		}
		out.print("<p>" + userMemo + "</p>");

		out.print("<a href='" + request.getHeader("referer") + "'>입력화면으로 </a>");
		out.close();
	}

}
