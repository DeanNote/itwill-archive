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

@WebServlet("/JdbcConnect3_INSERT")
public class JdbcConnect3Insert extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/JdbcConnect3_INSERT");
		
		try {
			//0단계. JDBC 연결에 필요한 문자열을 각각의 변수에 저장
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/study_jsp5";
			String user = "root";
			String password = "1234";
			
			//1단계
			Class.forName(driver);
			System.out.println("드라이버 로드 성공!");
			
			//2단계
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 성공!");
			
			/*
			 ----------------------------------------------------------------------------------------
			 2단계 까지는 DB제품 별 정보가 달라짐
			 3단계 부터는 공통 작업
			 -----------------------------------------------------------------------------------------
			 <테스트를 위한 테이블 생성>
			 테이블명 study_jsp5.jsp09_student
			 컬럼 : 번호 (idx, 정수), 이름(name, 문자 16자)
			 CREATE TABLE jsp09_student(
			 	idx INT,
			 	name VARCHAR(16)
			 );
			 
			 INSERT INTO jsp09_student VALUES(23, 'hongbaksa');
			 //----------------------------------------------------------------------------------------
			  3단계. SQL 구문 작성 및 전달
			  -jsp09_student 테이블에 번호 이름 작성 insert 작성
			  임의의 데이터 번호 23, 이름 hongbaksa
			 */
			
//			String sql = "INSERT INTO jsp09_student VALUES(23, 'hongbaksa')";
			// 커넥션 객체 con 의 prepareStatement() 메서드 호출해서 sql 구문 전달
			// 파라미터 sql 구문 문자열 
//			PreparedStatement pstmt = con.prepareStatement(sql);
			// 리턴받은  PreparedStatement 객체는 SQL 문장 관리 객체
			//----------------------------------------------------------------------------
			// 추가 레코드 데이터 외부 입력 변수 저장 가정
			int idx = 3;
			String name = "강감찬";
			
			//[SQL 구문 작성 시 변수값을 SQL 구문에 포함시키는 방법 2가지]'
			//1) 개불편한 "" ''
//			String sql = "INSERT INTO jsp09_student VALUES("+ idx + ",'" + name + "')";
//			PreparedStatement pstmt = con.prepareStatement(sql);
			
			//2) 만능문자(wildcard) ?
			String sql = "INSERT INTO jsp09_student VALUES(?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);

			
			
			
			
			
			
			
			
			//----------------------------------------------------------------------------
			// 만약, 실행될 문장 확인 시 
			//----------------------------------------------------------------------------
			System.out.println(pstmt);
			
			//4단계. SQL 구문 실행 및 결과 처리
			//- INSERT 구문이므로 PPreparedStatement 객체의 executeUpdate()메서드 호출
			int insertCount = pstmt.executeUpdate();
			System.out.println("회원추가(insert)성공 - " + insertCount);
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 연결 실패! 또는 SQL 구문 오류 발생!");
			e.printStackTrace();
		}
		
	}
		
}
