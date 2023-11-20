package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import svc.BoardModifyProService;
import svc.BoardReplyProService;
import svc.BoardWriteProService;
import vo.ActionForward;
import vo.BoardBean;

public class BoardReplyProAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BoardReplyProAction");
		ActionForward forward = null;
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
		BoardBean board = new BoardBean();
		board.setBoard_num(Integer.parseInt(request.getParameter("board_num")));
		board.setBoard_subject(request.getParameter("board_subject"));
		board.setBoard_content(request.getParameter("board_content"));
		board.setBoard_name(id);
		
		board.setBoard_re_ref(Integer.parseInt(request.getParameter("board_re_ref")));
		board.setBoard_re_lev(Integer.parseInt(request.getParameter("board_re_lev")));
		board.setBoard_re_seq(Integer.parseInt(request.getParameter("board_re_seq")));
		board.setWriter_ip(request.getRemoteAddr());//ip주소
		
		System.out.println(board);
		
		BoardReplyProService service = new BoardReplyProService();
		boolean isWriteSuccess = service.registReplyBoard(board);

		if(!isWriteSuccess) { // 실패
			try {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('글쓰기 실패입니다!');");
				out.println("history.back();");
				out.println("</script>");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else { // 성공
			
			// 페이지번호 없을 경우 기본값 처리
			String pageNum = request.getParameter("pageNum");
			// 만약, 페이지번호가 null 또는 널스트링 일 경우 기본값 "1" 설정
			if(pageNum == null || pageNum.equals("")) {
				pageNum = "1";
			}
			
			forward = new ActionForward();
			forward.setPath("BoardList.bo&pageNum=" + pageNum); // 글목록 이동시 페이지번호로 이동
			forward.setRedirect(true); // Redirect
		}
		
		
		return forward;
	}

}
