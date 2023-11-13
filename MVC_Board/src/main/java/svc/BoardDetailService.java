package svc;

import java.sql.Connection;
import java.util.List;

import dao.BoardDAO;
import db.JdbcUtil;
import vo.BoardBean;

public class BoardDetailService {
	public BoardBean getBoard(int board_num) {
		System.out.println("BoardDetailService");
		BoardBean boardBean = null;
		
		Connection con = JdbcUtil.getConnection();
		BoardDAO dao = BoardDAO.getInstance();
		dao.setConnection(con);
		
		boardBean = dao.selectBoard(board_num);
		
		return boardBean;
	}

}
