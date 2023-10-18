package jsp09_jdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JdbcConnect1") // http://localhost:8080/StudyJSP/JdbcConnect1
public class JdbcConnect1Servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("JdbcConnect1Servlet");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로드 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패!");
			e.printStackTrace();
		}

		
	}

}


















