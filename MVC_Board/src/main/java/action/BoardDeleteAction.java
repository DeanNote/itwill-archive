package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import svc.BoardDeleteService;
import svc.BoardDetailService;
import vo.ActionForward;

public class BoardDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BoardDeleteAction");
		ActionForward forward = null;
		
		// 세션 아이디 존재하지 않을 경우 처리
			HttpSession session = request.getSession();
			String id = (String)session.getAttribute("sId");
			
			// 자바스크립트 사용하여 "잘못된 접근입니다!" 출력 후 메인페이지로 이동
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
				
				// 세션 아이디 없음 처리 정보 설정 후 메서드 수행 종료 후 복귀하려면 null 값 리턴
				return null;
			}
		
		int board_num = Integer.parseInt(request.getParameter("board_num"));
		
		String pageNum = request.getParameter("pageNum");
		// 만약, 페이지 번호가 null or "" 일 경우 기본값 "1" 설정
		if(pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		// 파라미터 = 글번호, 세션아이디
		BoardDeleteService service = new BoardDeleteService();
		boolean isBoardWriter = service.isBoardWriter(board_num, id);
		System.out.println(isBoardWriter);
		
		if(isBoardWriter) {
//			삭제 작업 진행
		}
		
		return forward;
	}

}
