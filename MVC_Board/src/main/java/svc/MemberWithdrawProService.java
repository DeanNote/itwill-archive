package svc;

import java.sql.Connection;

import dao.MemberDAO;
import db.JdbcUtil;
import vo.MemberStatus;

public class MemberWithdrawProService {

	public boolean withdrawMember(String id) {
		
		boolean isWithdrawSucess = true;
				
		Connection con = JdbcUtil.getConnection();
		MemberDAO dao = MemberDAO.getInstance();
		dao.setConnection(con);
		
		//MemberDAO - updateMemberStatus()메서드 호출 / 회원상태수정요청
		//파라미터 : 아이디 ,            리턴타입 : int updateCount
		int updateCount = dao.updateMemberStatus(id, MemberStatus.WITHDRAW);
		
		//탈퇴 처리 결과 판별
		if(updateCount>0) {
			JdbcUtil.commit(con);
			isWithdrawSucess = true;
		}else {
			JdbcUtil.rollback(con);
		}
		
		JdbcUtil.close(con);
		
		return isWithdrawSucess;
	}

}
