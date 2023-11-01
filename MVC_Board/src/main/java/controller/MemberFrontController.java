package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.MemberJoinProAction;
import action.MemberLoginProAction;
import vo.ActionForward;

@WebServlet("*.me")
public class MemberFrontController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("MemberFrontController");
			
			//공통으로 사용할 변수
			ActionForward forward =  null;//포워딩 정보 관리
			Action action = null;
			
			
			String command = request.getServletPath();
			System.out.println("command : " +command );
			
			if(command.equals("/MemberLoginForm.me")) {
				forward =  new ActionForward();
				forward.setPath("member/member_login_form.jsp");
				forward.setRedirect(false);
	
			} else if(command.equals("/MemberJoinPro.me")) {
				// 회원가입 처리작업 위한 비지니스 로직 수행
				action = new MemberJoinProAction();
				forward = action.execute(request, response);
	
			} else if(command.equals("/MemberJoinForm.me")) {
				forward =  new ActionForward();
				forward.setPath("member/member_join_form.jsp");
				forward.setRedirect(false);
				
			} else if(command.equals("/MemberLoginPro.me")) {
				// 회원 로그인 처리작업 위한 비지니스 로직 수행
				action = new MemberLoginProAction();
				forward = action.execute(request, response);
	
			} 
			
			//---------------------------------------------------------------------------------------------------
			// 공통 포워딩 작업처리(Dispatch & Redirect)
			if(forward != null) {
				if(forward.isRedirect()) {
					response.sendRedirect(forward.getPath());
				}else {
					RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
					dispatcher.forward(request, response);
				}
			}
			
			
	
	}
}

