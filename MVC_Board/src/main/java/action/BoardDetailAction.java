package action;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import svc.BoardDetailService;
import svc.BoardListService;
import vo.ActionForward;
import vo.BoardBean;

public class BoardDetailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BoardDetailAction");
		ActionForward forward = null;
		
		int board_num = Integer.parseInt(request.getParameter("board_num"));
		
		BoardDetailService service = new BoardDetailService();
		BoardBean boardBean = service.getBoard(board_num);
		System.out.println(boardBean);
		
		request.setAttribute("boardBean", boardBean);
		
		forward = new ActionForward();
		forward.setPath("board/board_view.jsp");
		forward.setRedirect(false);
		return forward;
	}

}
