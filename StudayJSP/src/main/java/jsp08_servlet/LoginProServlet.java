package jsp08_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// 요청 URL : http://localhost:8080 /StudyJSP /jsp08_servlet/LoginPro
//                                  ~~~~~~~~~ ~~~~~~~~~~~~~~~~~~~~~~~
//                               컨텍스트루트 매핑할 서블릿 주소
// => 컨텍스트 루트(= 프로젝트명) 뒤의 경로 및 서블릿 주소를 모두 매핑 주소로 지정해야함
//    ex) "/LoginPro" 가 아닌 "/jsp08_servlet/LoginPro" 주소 지정
@WebServlet("/jsp08_servlet/LoginPro")
public class LoginProServlet extends HttpServlet {
	// POST 방식 요청만 처리할 경우 doGet() 메서드 불필요
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginProServlet - doPost() 메서드 호출됨!");
		
		// 로그인 폼으로부터 입력받아 전달된 아이디, 패스워드 가져와서 저장 후 콘솔에 출력
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		System.out.println("아이디 : " + id);
		System.out.println("패스워드 : " + passwd);
		
		// 아이디가 "admin" 이고, 패스워드가 "1234" 이면 "로그인 성공!" 출력하고
		// 아니면, "로그인 실패" 출력
		if(id.equals("admin") && passwd.equals("1234")) { // 로그인 성공
//			System.out.println("로그인 성공!");
			
			// 세션 객체에 로그인 성공한 아이디 저장(속성명 "sId")
			// 단, 자바 클래스 내에서는 내장 객체가 존재하지 않으므로 session 변수가 없음
			// 따라서, request 객체로부터 session 객체를 얻어와서 사용해야한다!
			// => request 객체의 getSession() 메서드를 호출하여
			//    javax.servlet.http.HttpSession 타입 객체를 리턴받아 사용
			HttpSession session = request.getSession();
			// 속성명 "sId" 로 로그인에 성공한 아이디를 저장
			session.setAttribute("sId", id);
			// ----------------------------------------------------------------------
			// servlet1_main.jsp 페이지로 리다이렉트
			// 리다이렉트 과정에서 루트(/) 경로 지정 시 주소 및 포트번호 제외 나머지 경로 제거됨
//			response.sendRedirect("/servlet1_main.jsp"); // http://localhost:8080/servlet1_main.jsp
			// => 해당 경로상에 main.jsp 파일이 존재하지 않으므로 404 에러 발생함
			
			// 현재 LoginPro 서블릿 주소의 경로가 http://localhost:8080/StudyJSP/jsp08_servlet/LoginPro 이고
			// 요청할 파일(페이지)이 webapp/jsp08_servlet/servlet1_main.jsp 파일일 때
			// 컨텍스트루트(StudyJSP)가 webapp 디렉토리를 가리키기 때문에
			// 컨텍스트루트 뒤에 디렉토리 구조(/jsp08_servlet)를 유지한 채 파일명만 지정하면 된다!
			// 따라서, 현재 위치에서 서블릿 주소만 교체하면 되므로 파일명만 지정 가능
			response.sendRedirect("servlet1_main.jsp");
			// => http://localhost:8080/StudyJSP/jsp08_servlet/servlet1_main.jsp 페이지로 리다이렉트
		} else { // 로그인 실패
			System.out.println("로그인 실패!");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			
			out.print("<script>");
			out.print("alert('로그인 실패');");
			out.print("history.back();");
			out.print("</script>");
		}
		
	}

}










