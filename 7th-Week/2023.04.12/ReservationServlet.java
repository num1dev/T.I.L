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

@WebServlet(name = "reservation", urlPatterns = { "/reservation" })
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");

		String guestName = request.getParameter("guestName");
		String guestPassWord = request.getParameter("guestPassWord");
		String room = request.getParameter("room");
		String optional[] = request.getParameterValues("optional");
		String date =request.getParameter("tripDate");
		
		String year = date.substring(0, 4);
		String month = date.substring(5,7);
		String day = date.substring(8,10);

		
		out.print("<h1>" + guestName + "님의 예약내용</h1>");
		out.print("<hr>");
		
		out.print("<ul>");
		out.print("<li> 룸 : " + room + "</li>");
		out.print("<li> 추가 요청 사항 :");
		if (optional != null && optional.length != 0) {
			
			for (int i= 0; i < optional.length; i++) {
				out.print( 0 <i ? "," : " ") ;
				out.print(optional[i]);
				}
		} else {
			out.print("없음");
		}
		out.print("</li>");
		out.print("<li> 예약날짜 : "+ year + "년 " + month + "월 " + day +  "일 ");
		out.print("</ul>");

		
		
		if (guestName.isEmpty() || guestName == null) {
			request.getRequestDispatcher("/first.html").forward(request, response);
		}
		
		if (guestPassWord.isEmpty() || guestPassWord == null) {
			response.sendRedirect("https://www.daum.net/");
		}

		out.print("<br>");
		out.print("<a href='" + request.getHeader("referer") + "'>예약 입력화면으로 </a>");
		out.close();
	}

}

