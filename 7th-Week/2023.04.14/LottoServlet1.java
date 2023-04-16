package controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.domain.TimeVO;


@WebServlet("/lotto1")
public class LottoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String lottoNum = request.getParameter("num");
		int num = Integer.parseInt(lottoNum);
		int randNum = ((int)Math.random()*6)+1;
		System.out.printf("전달된 값 : %d, 추출된 값 : %d", num , randNum);
		
		
		
		LocalDateTime currentTime = LocalDateTime.now();
		int hour = currentTime.getHour();
		int minute = currentTime.getMinute();
		
		TimeVO timeVO = new TimeVO(hour, minute);
	
		request.setAttribute("timeVO", timeVO);
		
		
		if (num == randNum) {
			request.getRequestDispatcher("/jspexam/success.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("/jspexam/fail.jsp").forward(request, response);

		}
	}



}










