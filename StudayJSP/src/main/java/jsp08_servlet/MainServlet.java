package jsp08_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletMain") //http://localhost:8080/StudayJSP/ServletMain
public class MainServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("MainServlet");
		

		// /jsp09_jdbc/jdbc_main.jps 페이지로 포워딩
		//http://localhost:8080/StudayJSP/jsp08_servlet/servlet1_main.jsp
		//----------------------------------------------------
		response.sendRedirect("jsp08_servlet/servlet1_main.jsp");
		
		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp08_servlet/servlet1_main.jsp");
//		dispatcher.forward(request, response);
//		http://localhost:8080/StudayJSP/ServletMain
		
		
	}

}
