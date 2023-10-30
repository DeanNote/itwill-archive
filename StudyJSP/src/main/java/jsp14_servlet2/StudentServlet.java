package jsp14_servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.st")
public class StudentServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// => 단, POST 방식 요청일 경우 한글 파라미터에 대한 인코딩 방식 변경
		request.setCharacterEncoding("UTF-8");
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("StudentServlet - doProcess() 메서드 호출됨!");
		
		String command = request.getServletPath();
		System.out.println("command : " + command);
		
		if(command.equals("/jsp14_servlet2/StudentInsertForm.st")){
			System.out.println("학생 정보 등록 폼!");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp14_servlet2/student_insert_form.jsp");
			dispatcher.forward(request, response);
			
			
		}else if(command.equals("/jsp14_servlet2/StudentInsertPro.st")){
			System.out.println("학생 등록 작업!");
			
			int idx = Integer.parseInt(request.getParameter("idx"));
			String name = request.getParameter("name");
			
			StudentDTO  student = new StudentDTO();
			student.setIdx(idx);
			student.setName(name);
			
//			System.out.println("번호 : " + student.getIdx());
//			System.out.println("이름 : " + student.getName());
			System.out.println(student);
			
			StudentDAO dao = new StudentDAO();
			int insertCount = dao.insert(student);
				if(insertCount > 0) {
					response.setContentType("text/html; charset=UTF-8");
					PrintWriter out = response.getWriter();
					out.println("<script>");
					out.println("alert('학생 정보 등록 성공!');");
					out.println("location.href = 'DaoSelect';");
					out.println("</script>");
				} else {
					response.setContentType("text/html; charset=UTF-8");
					PrintWriter out = response.getWriter();
					out.println("<script>");
					out.println("alert('학생 정보 등록 실패!');");
					out.println("history.back();");
					out.println("</script>");
				}
			

		}else if(command.equals("/jsp14_servlet2/StudentList.st")){
			System.out.println("학생 목록 폼!");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp14_servlet2/student_list.jsp");
			dispatcher.forward(request, response);
			
		}
	
		
	}

}
















