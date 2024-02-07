package com.itwillbs.mvc_board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.itwillbs.mvc_board.vo.ChatRoomVO;

@Mapper
public interface ChatMapper {
	
	// 채팅방 1개 정보 추가
	void insertChatRoom(List<ChatRoomVO> chatRoom);

	// 채팅방 목록 조회
	List<ChatRoomVO> selectChatRoomList(String sender_id);

}
