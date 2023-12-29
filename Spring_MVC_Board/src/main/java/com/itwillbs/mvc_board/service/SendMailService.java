package com.itwillbs.mvc_board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwillbs.mvc_board.handler.GenerateRandomCode;
import com.itwillbs.mvc_board.handler.SendMailClient;
import com.itwillbs.mvc_board.vo.MemberVO;

@Service
public class SendMailService {
	@Autowired
	private SendMailClient mailClient;
	
	// 인증 메일 발송 요청을 위한 sendAuthMail() 메서드
	public String sendAuthMail(MemberVO member) {
		// 인증 메일에 포함시켜 전달할 난수 생성
		String auth_code = GenerateRandomCode.getRandomCode(50);
		System.out.println("생성된 난수 : " + auth_code);
		
		// ----------------------------------------------------
		// 인증 메일에 포함할 제목과 본문 생성
		String subject = "[아이티윌] 가입 인증 메일입니다.";
//		String content = "인증코드 : " + auth_code;
		// 이메일 본문에 인증에 사용될 주소 및 각종 정보를 포함하는 하이퍼링크 표시할 경우
		// => URL 파라미터로 아이디와 인증코드 전달
		String content = "<a href='http://localhost:8081/mvc_board/MemberEmailAuth?id=" + member.getId() + "&auth_code=" + auth_code + "'>"
							+ "이메일 인증을 수행하려면 이 링크를 클릭해 주세요!</a>";
		// ----------------------------------------------------
		// SendMailClient - sendMail() 메서드 호출하여 메일 발송 요청
		// => 파라미터 : 이메일, 제목, 본문
		mailClient.sendMail(member.getEmail(), subject, content);
		
		// 발송된 인증코드 리턴
		return auth_code;
	}

}











