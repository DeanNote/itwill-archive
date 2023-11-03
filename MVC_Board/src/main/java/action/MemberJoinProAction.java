package action;

import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		
		
		
		
		MemberBean mb = new MemberBean();
		mb.setName(request.getParameter("name"));
		mb.setId(request.getParameter("id"));
		mb.setPasswd(request.getParameter("passwd"));
		
		mb.setJumin(request.getParameter("jumin1") 
				+ "-" + 
				request.getParameter("jumin2")
				);
		
		mb.setAddress(
				request.getParameter("postCode")
				+ "/" +
				request.getParameter("address1")
				+ "/" +
				request.getParameter("address2")
				);
		
		mb.setEmail(
				request.getParameter("email1")
				+ "@" +
				request.getParameter("email2")
				);
		
		mb.setHobby(request.getParameter("job"));
		mb.setGender(request.getParameter("gender"));
		
		String[] arrHobby = request.getParameterValues("hobby");
		for(String hobby : arrHobby) {
			mb.setHobby(hobby);
			}
		
		mb.setMotivation(request.getParameter("motivation"));
		
		
		//포워딩 정보가 저장된 ActionForward객체 리턴
		return forward;
	}
	
	
}
