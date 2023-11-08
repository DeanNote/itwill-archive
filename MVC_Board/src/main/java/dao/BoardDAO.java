package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.JdbcUtil;
import vo.BoardBean;

public class BoardDAO {
	
	// ------------------- 싱글톤 디자인 패턴 활용한 인스턴스 관리 --------------------
	private static BoardDAO instance = new BoardDAO();
	
	private BoardDAO() {}

	public static BoardDAO getInstance() {
		return instance;
	}
	// --------------------------------------------------------------------------------
	// 외부로부터 Connection 타입 객체 전달받아 저장할 멤버변수 및 Setter 정의
	private Connection con;

	public void setConnection(Connection con) {
		this.con = con;
	}
	// --------------------------------------------------------------------------------
	// 글쓰기
	public int insertBoard(BoardBean board) {
		// 작업 처리 결과를 리턴받아 저장할 변수 선언
		int insertCount = 0;
		
		// DB 작업에 필요한 변수 선언
		PreparedStatement pstmt = null, pstmt2 = null;
		ResultSet rs = null;
		
		// 새 글 번호 계산(글번호 컬럼(board_num)이 자동증가 컬럼이 아니기 때문) - SELECT
		// board 테이블의 기존 게시물들의 글번호(board_num) 중 가장 큰 번호 조회
		// => MySQL 구문의 MAX() 함수 사용(SELECT MAX(컬럼명) FROM 테이블명)
		// => 조회 결과가 있을 경우 조회 결과 + 1 값을 새 글 번호로 지정
		//    (단, 조회 결과가 없을 경우 기본값 1로 지정)
		int board_num = 1; // 새 글 번호(기본값 1)
		
		try {
			String sql = "SELECT MAX(board_num) FROM board";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) { // 조회 결과가 있을 경우
				// 기존 게시물이 하나라도 존재할 경우 가장 큰 번호가 리턴되므로 + 1 값을 저장하고
				// 아니면(게시물이 하나도 없을 경우), 기본값 그대로 사용
				board_num = rs.getInt(1) + 1; // 첫번째 컬럼값 + 1
			}
//			System.out.println("새 글 번호 : " + board_num);
			// ------------------------------------------------------------------
			// 전달받은 데이터(BoardBean 객체) 사용하여 글쓰기 작업 수행 - INSERT
			// => 새 글 번호는 계산된 번호(board_num 값) 사용
			// => 참조글번호(board_re_ref)는 새 글 번호와 동일한 번호 사용
			// => 들여쓰기레벨(board_re_lev)과 순서번호(board_re_seq)는 0 지정
			// => 조회수(board_readcount) 0 지정
			// => 작성일자(board_date) 는 현재 서버 시각 활용(now() 함수 사용)
			sql = "INSERT INTO board VALUES (?, ?, ?, ?, ?, ?, ?, ?, now(), ?)";
			pstmt2 = con.prepareStatement(sql);
			pstmt2.setInt(1, board_num); // 글번호(계산된 새 글 번호 사용)
			pstmt2.setString(2, board.getBoard_name()); // 작성자(전달받은 값)
			pstmt2.setString(3, board.getBoard_subject()); // 제목(전달받은 값)
			pstmt2.setString(4, board.getBoard_content()); // 내용(전달받은 값)
			pstmt2.setInt(5, board_num); // 참조글번호(계산된 새 글 번호 사용)
			pstmt2.setInt(6, 0); // 들여쓰기레벨(기본값 0)
			pstmt2.setInt(7, 0); // 순서번호(기본값 0)
			pstmt2.setInt(8, 0); // 조회수(기본값 0)
			pstmt2.setString(9, board.getWriter_ip()); // 작성자 IP 주소(전달받은 값)
			
			System.out.println(pstmt2); // 작성된 구문 확인
			
			insertCount = pstmt2.executeUpdate(); 
		} catch (SQLException e) {
			System.out.println("SQL 구문 오류 발생 - insertBoard()");
			e.printStackTrace();
		} finally {
			// DB 자원 반환
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(pstmt2);
		}
		
		return insertCount;
	}
	
	
}











