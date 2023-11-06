package svc;

import java.sql.Connection;

import dao.MemberDAO;
import db.JdbcUtil;
import vo.MemberBean;

public class MemberModifyProService {

	public boolean modifyMember(MemberBean member) {
		System.out.println("MemberModifyProService");
		
		boolean isModifySuccess = false;
		
		Connection con = JdbcUtil.getConnection();
		MemberDAO dao = MemberDAO.getInstance();
		dao.setConnection(con);
		
		int updateCount = dao.updateMember(member);
		
		if(updateCount>0) {
			JdbcUtil.commit(con);
			isModifySuccess = true;
			
		}else {
			JdbcUtil.rollback(con);
		}
		
		JdbcUtil.close(con);
		
		return isModifySuccess;
	}

}
