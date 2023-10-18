package jsp09_jdbc;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JdbcConnect3_DELETE") // http://localhost:8080/StudyJSP/JdbcConnect3_DELETE
public class JdbcConnect3Delete extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("JdbcConnect3Delete");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로드 성공!");
			
			DriverManager.getConnection("jdbc:mysql://localhost:3306/study_jsp5", "root", "1234");
			System.out.println("DB 연결 성공!");
			
			String sql = "INSERT INTO jsp09_student VALUES (?, ?)";
			
			pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, idx); 
//			pstmt.setString(2, name);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}












