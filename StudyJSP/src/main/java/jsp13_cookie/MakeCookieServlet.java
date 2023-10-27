package jsp13_cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp13_cookie/MakeCookie")
public class MakeCookieServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 쿠키(Cookie) 객체 생성
		Cookie cookie = new Cookie("cookieName", "cookieValue");
		
		//2. 생성된 쿠키 유효기간 설정
		cookie.setMaxAge(60);// 60초 = 1분간 쿠키 유지됨
		
		//3. 생성된 쿠키를 클라이언트로 전송
		response.addCookie(cookie);
		
		//(임시) 생성된 쿠키 정보 확인
		System.out.println("getName" + cookie.getName()); 
		System.out.println("getValue" + cookie.getValue()); 
		System.out.println("getMaxAge" + cookie.getMaxAge()); 
		// ------------------------------------------------------------
		// ShowCookie 서블릿 주소 리다이렉트
		response.sendRedirect("ShowCookie");
		// -> 응답 전송 후 웹브라우저 개발자도구에서 확인 가능(단, 60초 후 사라짐)
		
		
		
		
		
	}

}
