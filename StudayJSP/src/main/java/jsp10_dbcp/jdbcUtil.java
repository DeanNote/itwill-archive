package jsp10_dbcp;

import java.sql.Connection;

// 데이터베이스 작업 준비 및 해제(= 자원 반환) 작업을 공통으로 수행할
// 공통 메서드를 갖는 JdbcUtil 클래스 정의
public class JdbcUtil {
	// 1. 데이터베이스 접근을 통해 Connection 객체를 생성 및 외부로 리턴하는
	//    getConnection() 메서드 정의(DB 작업 1단계 & 2단계에 해당)
	// => 파라미터 : 없음   리턴타입 : java.sql.Connection
	// => 단, JdbcUtil 클래스의 인스턴스 생성 없이도 메서드 호출이 가능하도록
	//    static 메서드로 정의
	public Connection getConnection() {
		
	}
	
}
