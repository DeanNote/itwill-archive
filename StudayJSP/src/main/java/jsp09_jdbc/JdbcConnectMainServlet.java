package jsp09_jdbc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.parser.RecoveredRequiresStatement;

@WebServlet("/JdbcConnectMain")
public class JdbcConnectMainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("JdbcConnectMainservlet");
		
		//1) 리다이렉트 주소표시줄에 경로 표시
//		response.sendRedirect("jsp09_jdbc/jdbc_main.jsp");
		
		//2) 디스패치 포워딩시 주소표시줄에 경로 표시 없음
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp09_jdbc/jdbc_main.jsp");
		dispatcher.forward(request, response);
		
		
		
		
	}


}
