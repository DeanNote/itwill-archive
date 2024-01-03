package com.itwillbs.mvc_board.vo;

import lombok.Data;

/*
 spring_mvc_board5.tiny_reply_board 테이블 정의
 ----------------------------------------------
 글번호(reply_num) - 정수, PK
 원본글번호(board_num) - 정수, FK(board - board_num, 삭제 옵션 추가), NN
 작성자(reply_name) - 문자(16), NN
 내용(reply_content) - 문자(200), NN
 참조글번호(reply_re_ref) - 정수, NN
 들여쓰기레벨(reply_re_lev) - 정수, NN
 순서번호(reply_re_seq) - 정수, NN
 작성일시(reply_date) - 날짜 및 시각, NN
*/

// 게시물 내의 댓글 1개 정보를 관리하는 TinyReplyBoardVO 클래스 정의
@Data
public class TinyReplyBoardVO {
	private int reply_num;
	private int board_num;
	private String reply_name;
	private String reply_content;
	private int reply_re_ref;
	private int reply_re_lev;
	private int reply_re_seq;
	private String reply_date;
}
