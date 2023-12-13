package com.itwillbs.mvc_board.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.itwillbs.mvc_board.vo.MemberVO;

@Mapper
public interface MemberMapper {

	// 회원 가입
	int insertMember(MemberVO member);

}
