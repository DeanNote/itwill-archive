package svc;

import java.sql.Connection;

import db.JdbcUtil;
import vo.MemberBean;

public class MemberJoinProService {

//Action 클래스로부터 작업 요청 받아 DAO 클래스와 상호 작용을 통해 DB작업을 수행 요청하는  클래스	
	
	public Boolean registMember(MemberBean mb) {
		System.out.println("MemberJoinProService - registMember");
		// 1. 작업 요청 처리 결과 저장할 변수 선언
		boolean isJoinSuccess = false;
		
		// 2. db.JdbcUtill 클래스로부터 커넥션 풀에 저장된 커넥션 객체 가져오기
		// => 트랜잭션 관리를 DAO 대신 서비스 객체가 수행해야 하므로 Service 객체가 Connection 객체를 관리해야함.
		Connection con = JdbcUtil.getConnection();
		
		
		//작업 요청 처리 결과 리턴
		return isJoinSuccess;
	}

}
