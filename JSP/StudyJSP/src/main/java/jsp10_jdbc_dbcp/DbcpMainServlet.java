package jsp10_jdbc_dbcp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DbcpMain")
public class DbcpMainServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DbcpMainServlet");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp10_dbcp/dbcp_main.jsp");
		dispatcher.forward(request, response);
	}

}












