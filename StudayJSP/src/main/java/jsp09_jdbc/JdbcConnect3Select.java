package jsp09_jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JdbcConnect3_SELECT") // http://localhost:8080/StudyJSP/JdbcConnect3_SELECT
public class JdbcConnect3Select extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("JdbcConnect3Select");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // SELECT 결과를 관리할 객체 타입
		
		
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
			
			String sql = "SELECT * FROM jsp09_student";
			pstmt = con.prepareStatement(sql);
			
		
			System.out.println(pstmt);
			// --------------------
			// 4단계. SQL 구문 실행 및 결과 처리
			// -> SELECT 구문 실행을 위해 PreparedStatement 객체의 excuteQuery 메서드 호출
			// -> 조회 결과(테이블)가 java.sql.ResultSet 타입 객체로 리턴됨
			rs = pstmt.executeQuery();
			rs.next(); 
			System.out.println("컬럼인덱스로 접근 : " + rs.getInt(1)+", " +rs.getString(2));
			System.out.println("컬럼명으로 접근 : " + rs.getInt("idx")+", " +rs.getString("name"));
			// 주의! 3단계 과정에서 SQL 구문을 메서드 파라미터로 전달한 것과 상관없이
			// 4단계 메서드 호출 시 SQL 구문을 다시 전달할 경우
			// setXXX() 메서드를 활용한 데이터 치환이 수행되지 않은 문장이 실행되므로 오류!
//			int insertCount = pstmt.executeUpdate(sql);
			
//			System.out.println("회원 조회(select) 성공 - " + selectCount);
			
			
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
				rs.close();// resultSet 객체 반납
				pstmt.close(); // PreparedStatemente 객체 반납
				con.close(); // Connection 객체 반납(닫기 = 자원 해제)
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}












