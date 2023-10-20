package jsp09_jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// 0단계. JDBC 연결에 필요한 문자열을 각각의 변수에 저장
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/study_jsp5";
			String user = "root";
			String password = "1234";
			
			// 1단계. JDBC 드라이버 로드
			Class.forName(driver);
			System.out.println("드라이버 로드 성공!");
			
			// 2단계. DB 연결
			// => DB 연결 성공 시 java.sql.Connection 타입 객체 리턴됨
			// => Connection 객체는 DB 접속 정보를 관리하는 객체
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 성공!");
			
			
			int idx = 3; // int idx = Integer.parseInt(request.getParameter("idx"));
			String name = "강감찬"; // String name = request.getParameter("name");
			
			String sql = "DELETE FROM jsp09_student WHERE idx = ? AND name = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.setString(2, name);
			
		
			System.out.println(pstmt);
			// --------------------
			// 4단계. SQL 구문 실행 및 결과 처리
			// - INSERT 구문이므로 PreparedStatement 객체의 executeUpdate() 메서드 호출
			//   => 파라미터 : 없음   리턴타입 : int
			int deleteCount = pstmt.executeUpdate();
			
			// 주의! 3단계 과정에서 SQL 구문을 메서드 파라미터로 전달한 것과 상관없이
			// 4단계 메서드 호출 시 SQL 구문을 다시 전달할 경우
			// setXXX() 메서드를 활용한 데이터 치환이 수행되지 않은 문장이 실행되므로 오류!
//			int insertCount = pstmt.executeUpdate(sql);
			
			System.out.println("회원 삭제(DELETE) 성공 - " + deleteCount);
			
			
		} catch (ClassNotFoundException e) {
			// 1단계 - 드라이버 로드 작업 실패 시 실행되는 코드들...
			System.out.println("드라이버 로드 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			// 2단계 - DB 연결 작업 실패 시 실행되는 코드들...
			// 3단계, 4단계 - SQL 구문 작업 실패 시에도 실행되는 코드들...
			System.out.println("DB 연결 실패! 또는 SQL 구문 오류 발생!");
			e.printStackTrace();
		} finally {
			try {
				pstmt.close(); // PreparedStatemente 객체 반납
				con.close(); // Connection 객체 반납(닫기 = 자원 해제)
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}












