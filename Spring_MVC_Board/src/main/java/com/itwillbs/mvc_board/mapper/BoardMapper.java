package com.itwillbs.mvc_board.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.itwillbs.mvc_board.vo.BoardVO;

@Mapper
public interface BoardMapper {

	int insertBoard(BoardVO board);

}
