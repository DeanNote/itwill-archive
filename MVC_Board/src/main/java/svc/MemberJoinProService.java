package svc;

import java.sql.Connection;

import dao.MemberDAO;
import db.JdbcUtil;
import vo.MemberBean;

public class MemberJoinProService {

//Action 클래스로부터 작업 요청 받아 DAO 클래스와 상호 작용을 통해 DB작업을 수행 요청하는  클래스	
	
	public Boolean registMember(MemberBean mb) {
		System.out.println("MemberJoinProService - registMember");
		// 1. 작업 요청 처리 결과 저장할 변수 선언
		boolean isJoinSuccess = false;
		
		// 2. db.JdbcUtill 클래스로부터 커넥션 풀에 저장된 커넥션 객체 가져오기(공통)
		// => 트랜잭션 관리를 DAO 대신 서비스 객체가 수행해야 하므로 Service 객체가 Connection 객체를 관리해야함.
		Connection con = JdbcUtil.getConnection();
		
		// 3. MemberDAO(공통)
//		MemberDAO dao = new MemberDAO();
		MemberDAO dao = MemberDAO.getInstance();
		
		// 4. MemberDAO 객체의 setConnection() 메서드를 호출하여 Connection  객체 전달(공통)
		dao.setConnection(con);
		
		// 5. MemberDAO 객체의 xxx() 메서드 호출하여 xxx작업 수행 요청 및 결과 리턴 받기
		
		
		//작업 요청 처리 결과 리턴
		return isJoinSuccess;
	}

}
