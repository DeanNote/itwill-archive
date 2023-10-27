package jsp13_cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp13_cookie/DeleteCookie")
public class DeleteCookieServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie = new Cookie("cookieName", null);
		cookie.setMaxAge(0);//쿠키를 삭제한다는 의미
		response.addCookie(cookie);
		response.sendRedirect("ShowCookie");
	}

}
