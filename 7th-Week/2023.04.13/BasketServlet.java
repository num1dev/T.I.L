package core;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;

@WebServlet(name = "basket", urlPatterns = { "/basket" })
public class BasketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");

		response.setContentType("application/json");
		
		HttpSession session = request.getSession();
		if(session.getAttribute("resultId") == null) {
			session.setAttribute("resultId", new int[10]);	
		}
		
		int itemCounts[] = (int[])session.getAttribute("resultId");
		
		String str = request.getParameter("id");
		
		JSONObject json = new JSONObject();
		
		if (str != null) {
			itemCounts[Integer.parseInt(str)-1] += 1;
			for (int i = 0; i < itemCounts.length; i ++) {
				if(itemCounts[i] > 0) {
					if(i==9)
						json.put("p010", itemCounts[i]);
					else {
						json.put("p00" + (i+1), itemCounts[i]);
					}
				}
				
			}
		}
		else {
			json.put("msg", "상품이 모두 삭제되었습니다.");
			session.removeAttribute("resultId");
		}
		
		
		response.getWriter().write(json.toString());
	}
}
