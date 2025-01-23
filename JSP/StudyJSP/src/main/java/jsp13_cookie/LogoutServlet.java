package jsp13_cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/jsp13_cookie/Logout")
public class LogoutServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LogoutServlet");
		
		// 세션 초기화
		HttpSession session = request.getSession();
		session.invalidate();
		
		// 메인페이지로 리다이렉트
		response.sendRedirect("test2_main.jsp");
	}

}














