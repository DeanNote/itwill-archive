package jsp11_jdbc_dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DaoInsertPro")
public class DaoInsertProServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DaoInsertPro");
		
		
		// insert_form.jsp 페이지로부터 전달받은 폼 파라미터 가져와서 변수에 저장
		// => 한글 파라미터에 대한 인코딩 처리
		request.setCharacterEncoding("UTF-8");
		int idx = Integer.parseInt(request.getParameter("idx"));
		String name = request.getParameter("name");
//		System.out.println("번호 : " + idx);
//		System.out.println("이름 : " + name);
		
		StudentDAO dao = new StudentDAO();
		// insert 메서드 호출 하여 insert 작업 요청
		// 파라미터 번호(idx), 이름(name)  리턴타입 : int(insertCount)
//		int insertCount = dao.insert(idx, name);
		
		// 1. StudentDTO 클래스 인스턴스 생성
		StudentDTO student = new StudentDTO();
		
		// 2. StudentDAO 인스턴스에 데이터 저장 => Setter 메서드 활용
		student.setIdx(idx);
		student.setName(name);
		// StudentDTO 객체에 저장된 데이터 확인
//		System.out.println(student.getIdx() + ", " + student.getName());
		int insertCount = dao.insert(student);
		
		// INSERT 작업 결과 판별하여 후속 처리
		// => 성공 시 "INSERT 성공!" 출력, 실패 시 "INSERT 실패!" 출력
		if(insertCount > 0) {
			System.out.println("INSERT 성공!");
			//가입 결과 확인(=학생 목록 조회) 위해 "DaoSelect" 서블릿 요청(리다이렉트)
//			response.sendRedirect("DaoSelect");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");			
			out.println("alert('학생 정보 등록 성공');");			
			out.println("location.href = 'DaoSelect';");			
			out.println("</script>");			
			
			
		}else {
//			System.out.println("INSERT 실패!");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");			
			out.println("alert('학생 정보 등록 실패');");			
			out.println("history.back();");			
			out.println("</script>");			
		}
		
		
	}//doPost end

}//HttpServlet end












