package com.itwillbs.mvc_board.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itwillbs.mvc_board.service.MemberService;
import com.itwillbs.mvc_board.vo.MemberVO;

@Controller
public class MemberController {
	// MemberService 객체 자동 주입
	@Autowired
	private MemberService service;
	
	// [ 회원 가입 ]
	// "MemberJoinForm" 요청 joinForm() 메서드 정의(GET)
	// => "member/member_join_form.jsp" 페이지 포워딩
	@GetMapping("MemberJoinForm")
	public String joinForm() {
		return "member/member_join_form";
	}
	
	// "MemberJoinPro" 요청에 대한 비즈니스 로직 처리 수행할 joinPro() 메서드 정의(POST)
	// => 폼 파라미터를 통해 전달받은 회원정보를 MemberVO 타입으로 전달받기
	// => 데이터 공유 객체 Model 타입 파라미터 추가
	@PostMapping("MemberJoinPro")
	public String joinPro(MemberVO member, Model model) {
//		System.out.println(member);
		
		// ------------------------------------------------------------------------
		// BCryptPasswordEncoder 를 활용한 패스워드 암호화
		// 입력받은 패스워드는 암호화 필요 => 복호화가 불가능하도록 단방향 암호화(해싱) 수행
		// => 평문(Clear Text, Plain Text) 을 해싱 후 MemberVO 객체의 passwd 에 덮어쓰기
		// => org.springframework.security.crypto.bcrypt 패키지의 BCryptPasswordEncoder 클래스 활용
		//    (spring-security-crypto 또는 spring-security-web 라이브러리 추가)
		//    주의! JDK 11 일 때 5.x.x 버전 필요
		// => BCryptPasswordEncoder 활용한 해싱은 솔팅(Salting) 기법을 통해
		//    동일한 평문(원본 암호)이더라도 매번 다른 결과(암호문)를 얻을 수 있다!
		// 1. BCryptPasswordEncoder 클래스 인스턴스 생성
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		// 2. BCryptPasswordEncoder 객체의 encode() 메서드를 호출하여
		//    원문(평문) 패스워드에 대한 해싱(= 암호화) 수행 후 결과값 저장
		//    => 파라미터 : MemberVO 객체의 패스워드(평문 암호)   리턴타입 : String(암호문)
		String securePasswd = passwordEncoder.encode(member.getPasswd());
//		System.out.println("평문 패스워드 : " + member.getPasswd()); // 1234
//		System.out.println("암호화 된 패스워드 : " + securePasswd); // $2a$10$wvO.wV.ZHbRFVr9q4ayFbeGGCRs7XKxsN8wmll/.5YFlA/N7hFYl2(매번 다름)
		// 3. 암호화 된 패스워드를 MemberVO 객체에 저장
		member.setPasswd(securePasswd);
		// -------------------------------------------------------------------------------------
		// MemberService - registMember() 메서드 호출하여 회원가입 작업 요청
		// => 파라미터 : MemberVO 객체   리턴타입 : int(insertCount)
		int insertCount = service.registMember(member);
		
		// 회원가입 성공/실패에 따른 페이징 처리
		// => 성공 시 "MemberJoinSuccess" 서블릿 주소 리다이렉트
		// => 실패 시 "fail_back.jsp" 페이지 포워딩("msg" 속성값으로 "회원 가입 실패!" 저장)
		if(insertCount > 0) { // 성공
			// ---------- 인증메일 발송 작업 추가 ----------
			
			return "redirect:/MemberJoinSuccess";
		} else { // 실패
			// 실패 시 메세지 출력 및 이전페이지로 돌아가는 기능을 모듈화 한 fail_back.jsp 페이지
			model.addAttribute("msg", "회원 가입 실패!");
			return "fail_back";
		}
		
	}
	
	@GetMapping("MemberJoinSuccess")
	public String MemberJoinSuccess() {
		
		return "member/member_join_success";
	}
	@GetMapping("MemberLoginForm")
	public String MemberLoginForm() {
		
		return "member/member_login_form";
	}
	@PostMapping("MemberLoginPro")
	public String MemberLoginPro(MemberVO member, HttpSession session, Model model) {
		System.out.println(member);
		
		// 1. DB에 있는 정보 가져오기
		 MemberVO dbMember = service.getMember(member);
		 System.out.println(dbMember);
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		if(dbMember == null || !passwordEncoder.matches(member.getPasswd(), dbMember.getPasswd())) {
			model.addAttribute("msg","로그인 실패!");
			return "fail_back";
		}else {
			session.setAttribute("sId", member.getId());
			return "redirect:/";
		}
	}
	
	@GetMapping("MemberLogout")
	public String MemberLogout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
}





























