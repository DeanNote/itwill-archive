package jsp08_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dispatchServlet")
public class Servlet2DispatchServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet2 Dispatch Servlet2");
		
		String name = request.getParameter("name"); 
		String age = request.getParameter("age");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp08_servlet/servlet2_dispatch_result.jsp");
		dispatcher.forward(request, response);
	}

}
