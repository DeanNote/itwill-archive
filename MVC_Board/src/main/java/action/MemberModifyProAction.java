package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import svc.MemberModifyProService;
import vo.ActionForward;
import vo.MemberBean;

public class MemberModifyProAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("MemberModifyProAction");
		ActionForward forward = null;
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("sId");
		
		if(id == null) {
			try {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('잘못된 접근입니다!');");
				out.println("location.href = './';");
				out.println("</script>");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		// 세션 아이디가 있을 경우
		MemberBean member = new MemberBean();
		member.setName(request.getParameter("name"));
		member.setId(id);
		// 보안을 위해 세션아이디 줌
		member.setPasswd(request.getParameter("passwd"));
		member.setAddress(request.getParameter("address"));
		member.setEmail(request.getParameter("email"));
//		member.setJob(request.getParameter("job"));
		// 복수개의 파라미터가 존재하는 데이터는 문자열 결합 필요
		member.setJumin(request.getParameter("jumin1") + "-" + request.getParameter("jumin2"));
		member.setAddress(request.getParameter("postCode") + "/" + request.getParameter("address1") + "/" + request.getParameter("address2"));
		member.setEmail(request.getParameter("email1") + "@" + request.getParameter("email2"));
		
		// 단, 취미(hobby)는 동일한 이름의 파라미터가 복수개 존재하므로 배열 관리 필요
		// => request.getParameter() 대신 request.getParameterValues() 메서드 사용 필요
		// 단, 반복문 수행 전 MemberBean 객체의 hobby 멤버변수값을 널스트링("")으로 초기화
		member.setHobby("");
		
		
		String[] hobbies = request.getParameterValues("hobby");
		if(hobbies != null) {
			for(String hobby : hobbies) {
				member.setHobby(member.getHobby() + hobby + "/");
			}
		}
		
		member.setJob(request.getParameter("job"));
		member.setGender(request.getParameter("gender"));
		member.setMotivation(request.getParameter("motivation"));
		
//		System.out.println(member); // toString() 생략
		
		//MemberModifyProService - modifyMember() 메서드 호출하여 회원 정보 수정 요청
		// => 파라미터 : MemberBean 객체 리턴타입 : boolean(isModifySuccess)
		MemberModifyProService service = new MemberModifyProService();
		boolean isModifySuccess = service.modifyMember(member);
		//회원 정보 수정 요청 결과 판별
		//실패시 자바스크리브 사용 실패 메세지 출력 후 이전페이지 돌아가기
		//성공 시 MemberInfo.me 서블릿 요청
		if(!isModifySuccess) {
			try {
				// 자바스크립트를 사용하여 "정보수정실패!" 출력 및 이전페이지로 돌아가기
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('정보수정실패!');");
				out.println("history.back();");
				out.println("</script>");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			forward = new ActionForward();
			forward.setPath("MemberInfo.me");
			forward.setRedirect(true);
			
		}
		
		return forward;
	}

}
