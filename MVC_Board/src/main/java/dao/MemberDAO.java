package dao;

import java.sql.Connection;

//실제 비즈니스 로직을 수행하는 MemberDAO 클래스 정의
public class MemberDAO {
	
	private MemberDAO() {}
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance() {
		return instance;
	}
	
	
//	//--------싱글톤 디자인 패턴 활용 MemberDAO 인스턴스 생성 작업--------------
//	// 1. 외부 인스턴스 생성 불가능하도록 생성자 private 접근제한자로 선언
//	private MemberDAO() {}
//	// 2. 자신의 클래스 내에서 직접 인스턴스 생성하여 멤버변수에 저장
//	private static MemberDAO instance = new MemberDAO();
//	// 3. 생성된 인스턴스를 외부로 리턴하는 Getter 메서드 강의
//	public static MemberDAO getInstance() {
//		return instance;
//	}
	
	
	//--------------------------------------------------------------------------
	//DB 접근에 사용될 Connection 객체를 Service로부터 전달받기 휘한
	//Connection 타입 멤버변수 선언 및 Setter 메서드 정의
	private Connection con;
	







	public void setConnection(Connection con) {
		this.con = con;
	}
	//----------------------------------------------------------------------------
	
}
