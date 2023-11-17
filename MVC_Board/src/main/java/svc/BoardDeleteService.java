package svc;

import java.sql.Connection;

import dao.BoardDAO;
import db.JdbcUtil;
import vo.BoardBean;

public class BoardDeleteService {

	public boolean isBoardWriter(int board_num, String id) {
		boolean isBoardWriter = false;
		
		Connection con = JdbcUtil.getConnection();
		BoardDAO dao = BoardDAO.getInstance();
		dao.setConnection(con);
		
		isBoardWriter = dao.isBoardWriter(board_num, id);
		
		JdbcUtil.close(con);
		
		return isBoardWriter;
		
	}
	
}
