package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import svc.MemberInfoService;
import svc.MemberWithdrawProService;
import vo.ActionForward;
import vo.MemberBean;

public class MemberWithdrawProAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("MemberWithdrawProAction");
		
		ActionForward forward = null;
		
		// 세션에 저장된 세션 아이디(속성명 : sId") 가져와서 변수에 저장
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("sId");
//		System.out.println(id); // 아이디 출력 또는 null 값 출력
		String passwd = request.getParameter("passwd");
		System.out.println(passwd);
		// 세션 아이디가 존재하지 않을 경우(null)
		// 자바스크립트 사용하여 "잘못된 접근입니다!" 출력 후 메인페이지로 이동
		if(id == null) {
			try {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('잘못된 접근입니다!');");
				out.println("history.back();");
				out.println("</script>");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			//MemberInfoService - getNumber() 메서드호출 회원 상세정보 요청
			MemberInfoService service = new MemberInfoService();
			MemberBean member = service.getMember(id);
//			System.out.println(member);
			
			//조회된 패스워드와 입력된 패스워드 비교
			if(!passwd.equals(member.getPasswd())) {
				try {
					response.setContentType("text/html; charset=UTF-8");
					PrintWriter out = response.getWriter();
					out.println("<script>");
					out.println("alert('패스워드 틀림!');");
					out.println("history.back();");
					out.println("</script>");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else {// 패스워드 일치
				//MemberWithdrawProService - withdrawMember() 메서드 호출하여 탈퇴 처리 요청
				MemberWithdrawProService service2 = new MemberWithdrawProService();
				boolean isWithdrawSucess = service2.withdrawMember(id);
				
				//탈퇴처리 성공 실패 여부
				if(!isWithdrawSucess) {
					try {
						response.setContentType("text/html; charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<script>");
						out.println("alert('회원 탈퇴 실패!');");
						out.println("history.back();");
						out.println("</script>");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}else { //탈퇴 성공
					//세션 초기화 후 메인페이지로 리다이렉트
//					HttpSession session = request.getSession(); 아까 씀
					session.invalidate();
					
//					forward = new ActionForward();
//					forward.setPath("./");
//					forward.setRedirect(true);
					
					//자바스크립트로 "탈퇴 처리가 완료되었습니다. 감사합니다." 출력 후
					//메인페이지로 이동
					try {
						response.setContentType("text/html; charset=UTF-8");
						PrintWriter out = response.getWriter();
						out.println("<script>");
						out.println("alert('탈퇴처리가 완료되었습니다 감사합니다.!');");
						out.println("location.href = './';");
						out.println("</script>");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
			}
			
		}
		
		
		return forward;
	}

}











