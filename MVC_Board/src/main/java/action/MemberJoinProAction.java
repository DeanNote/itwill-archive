package action;

import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import svc.MemberJoinProService;
import vo.ActionForward;
import vo.MemberBean;

// FrontController 클래스와 연동하여 컨트롤러 역할 수행할 Action 클래스 정의
// Action 인터페이스를 상속받아 구현

public class MemberJoinProAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("MemberJoinProAction");
		
		//포워딩 정보를 저장할 ActionForward 타입 변수 (forward)선언
		ActionForward forward = null;
		
		//회원가입 받은 폼 파라미터 가져오기
		
		
		
		
		
		MemberBean member = new MemberBean();
		member.setName(request.getParameter("name"));
		member.setId(request.getParameter("id"));
		member.setPasswd(request.getParameter("passwd"));
		
		member.setJumin(request.getParameter("jumin1") 
				+ "-" + 
				request.getParameter("jumin2")
				);
		
		member.setAddress(
				request.getParameter("postCode")
				+ "/" +
				request.getParameter("address1")
				+ "/" +
				request.getParameter("address2")
				);
		
		member.setEmail(
				request.getParameter("email1")
				+ "@" +
				request.getParameter("email2")
				);
		
		member.setHobby(request.getParameter("job"));
		member.setGender(request.getParameter("gender"));
		
		member.setHobby("");
		if(request.getParameterValues("hobby") != null) {
			for(String hobby : request.getParameterValues("hobby")) {
				member.setHobby(member.getHobby() + hobby + "/");
			}
		}
		
		member.setMotivation(request.getParameter("motivation"));
		System.out.println(member);
		//------------------------------------------------------------
		// 회원 가입 비즈니스 로직(DB 작업) 요청 수행(XXXService 클래스 활용)
		MemberJoinProService service = new MemberJoinProService();
		service.registMember(member);
		
		//포워딩 정보가 저장된 ActionForward객체 리턴
		return forward;
	}
	
	
}
