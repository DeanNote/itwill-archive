package jsp13_cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp13_cookie/ShowCookie")
public class ShowCookieServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String cookieHeader = request.getHeader("Cookie");
		if(cookieHeader != null) {
			Cookie[] cookie = request.getCookies();
		}
		
	}

}
