package jsp11_jdbc_dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
		
		//학생 목록 조회 요청을 위한 StudentDAO - selectStudentList() 메서드 호출
		// => 파리미터 x 리턴 void
		StudentDAO dao = new StudentDAO();
		// => 파리미터 x 리턴 StudentDTO(student)
		List<StudentDTO> studentList = dao.selectStudentList();
//		for(int i = 0; i<studentList.size(); i++){
//			StudentDTO student = studentList.get(i);//1개 레코드 (StudentDTO 객체) 꺼내기
//			System.out.println("번호 : " + student.getIdx() + "이름 : " + student.getName());
//		}
		
//		for(StudentDTO student : studentList) {
//			System.out.println("번호 : " + student.getIdx() + "이름 : " + student.getName());
//		}
		//============================================================================================================
		// 뷰페이지(select.jsp)로 포워딩 시 
		// 전체 레코드가 저장된 List 객체를 함께 전달해야한다!
		request.setAttribute("studentList", studentList);
		
		
	}

}












