package jsp13_cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp13_cookie/Test3CookieServlet")

public class Test3CookieServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String lang = request.getParameter("lang");
		
		Cookie cookie = new Cookie("land", lang);
		cookie.setMaxAge(60*60*24*30);
		response.addCookie(cookie);
		
		response.sendRedirect("test3.jsp");
		
		
		
		
	}
	

}
