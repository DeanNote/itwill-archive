package com.itwillbs.test2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 	컨트롤러 역할을 수행하는 클래스 정의
// @Controller 어노테이션을 적용하면 스프링에서 컨트롤러 역할 클래스로 인식
@Controller
public class TestContrller {
	// "/main" 서블릿 주소 요청 시 자동으로 호출되는 requestMain() 메서드 정의(매핑)
	// => 파라미터 : 없음 리턴타입 : String
//	@RequestMapping(value = "/main", method = RequestMethod.GET )
//	public String requestMain() { //GET 방식의 "/main" 서블릿 주소 요청 시 자동 호출되는 메서드
//		System.out.println("TestController - requestMain()");
//		return "main";
//	}
	
	// "/main" 서블릿 주소 요청을 포스트 방식으로 변경 처리
//	@RequestMapping(value = "/main", method = RequestMethod.POST )
//	public String requestMain() { //GET 방식의 "/main" 서블릿 주소 요청 시 자동 호출되는 메서드
//		System.out.println("TestController - requestMain()");
//		return "main";
//	}
	
	// 주의! POST 방식 지정 시 GET 방식으로 요청 발생할 경우 일치하는 메서드가 없게 되므로 해당 요청을 처리할 수 없게 되어 오류 발생
	// HTTP 상태 405 – 허용되지 않는 메소드(메시지 Request method 'GET' not supported)

	//----------------------------------------------------------------------------------------------------
	// @RequestMapping 어노테이션에서 method 속성 생략시 기본값 GET
//	@RequestMapping(value = "/main")
//	public String requestMain() {
//		return "main";
//	}
	// @RequestMapping 어노테이션에서 속성명을 생략 시 기본 속성명 value 적용됨
	@RequestMapping("/main")
	public String requestMain() {
		return "main";
	}
	
	//----------------------------------------------------------------------
	// "test1" 서블릿 주소 요청을 처리할 test1() 메서드 정의
	@GetMapping("/test1")
	public String test1() {
		return "test/test1";
	}
	//----------------------------------------------------------------------
	// 서블릿 주소가 동일하더라도 요청 방식이 다를 경우 각각 다른 메서드로 매핑(처리) 가능
	// "/test2"서블릿 주소 요청을 처리할 test2() 메서드 정의(GET, POST 모두 요청)
//	@GetMapping("/test2")
//	public String test2_get() {
//		System.out.println("get방식 호출됨!");
//		return "test/test2";
//	}
//	
//	@PostMapping("/test2")
//	public String test2_post() {
//		System.out.println("post방식 호출됨!");
//		return "test/test2";
//	}
	
	//RequestMapping 어노테이션 사용 시 서로 다른 요청 방식을 
	// 하나의 메서드에서 매핑하여 처리가 가능함
	@RequestMapping(value = "/test2", method = {RequestMethod.GET, RequestMethod.POST} )
	public String test2() {
		System.out.println("@RequestMapping - GET & POST");
		return "test/test2";
	}
	
	
	
	
	
	
}
