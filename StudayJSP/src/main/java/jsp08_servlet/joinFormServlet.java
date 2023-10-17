package jsp08_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp08_servlet/joinForm")
public class joinFormServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		System.out.println(name);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<script>");
		out.print("alert('회원 가입을 축하합니다!');");
		out.print("location.href='servlet1_main.jsp';");
		out.print("</script>");
		
//		메인페이지로 리다이렉트 자바스크립트 출력 같이 못함
//		response.sendRedirect("servlet1_main.jsp");
		
		
	
	}

}

