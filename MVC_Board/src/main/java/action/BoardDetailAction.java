package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import svc.BoardDetailService;
import vo.ActionForward;
import vo.BoardBean;

public class BoardDetailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BoardDetailAction");
		
		ActionForward forward = null;
		
		int board_num = Integer.parseInt(request.getParameter("board_num"));
//		System.out.println("글번호 : " + board_num);
		// 페이지번호는 현재 작업에서 실제로 활용될 데이터가 아니므로
		// 다음 페이지로 이동 시 전달하는 용도로만 사용하므로 파라미터 가져오기 불필요
		
		// BoardDetailService - getBoard() 메서드 호출하여 게시물 상세정보 조회 작업 요청
		// => 파라미터 : 글번호   리턴타입 : BoardBean(board)
		// => 글 수정, 답글 작성과 구분하여 조회수 증가도 함께 수행하기 위해
		//    boolean타입 값을 신호로 전달(true : 조회수 증가, false : 조회수 미 증가)
		BoardDetailService service = new BoardDetailService();
		BoardBean board = service.getBoard(board_num, true); // 조회수 증가 작업 수행
//		System.out.println(board);
		
		// request 객체에 BoardBean 객체 저장
		request.setAttribute("board", board);
		
		// --------------------------- 조회수 조작 방지를 위한 대책 ------------------------
		// 조회 성공한 게시물의 게시물의 글 번호를 세션 객체 내의 readedBoardList 속성에 저장
		// 단, 기존의 세션 객체 값이 존재하지 않을 경우 
		// 조회 성공한 게시물 번호 "xx/"를 세션에 저장하고
		// 아니면 기존의 게시물 번호"xx/" 뒤에 새 게시물 번호 추가 "yy/"
		HttpSession session = request.getSession();
		System.out.println("저장 전 : "+session.getAttribute("readedBoardList"));
		// 기존 세션값 판별
		if(session.getAttribute("readedBoardList") == null) {
			session.setAttribute("readedBoardList", board.getBoard_num() + "/");
		}else {
		}
		
		
		
		
		System.out.println("저장 후 : "+session.getAttribute("readedBoardList"));
		
		// ------------------------------------------------------------------------------------
		
		// ActionForward 객체를 사용하여 "board/board_view.jsp" 포워딩 정보 설정
		forward = new ActionForward();
		forward.setPath("board/board_view.jsp");
		forward.setRedirect(false);
		
		return forward;
	}

}









