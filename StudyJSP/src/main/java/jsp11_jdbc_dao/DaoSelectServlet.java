package jsp11_jdbc_dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DaoSelect")
public class DaoSelectServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DaoSelectServlet");
		
		//학생 목록 조회 요청을 위한 StudentDAO - select() 메서드 호출
		// => 파리미터 x 리턴 void
		StudentDAO dao = new StudentDAO();
		// => 파리미터 x 리턴 StudentDTO(student)
		StudentDTO student = dao.select();
		System.out.println("번호 : " + student.getIdx());
		System.out.println("이름 : " + student.getName());
		
		
		
	}

}












