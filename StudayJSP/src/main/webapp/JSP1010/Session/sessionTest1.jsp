<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
	[ session 객체 ]
	- HttpSession 타입을 사용하여 관리(서버가 관리하는 객체)
	- 서버와 클라이언트 사이의 연결 정보에 대한 관리 역할을 수행하는 객체
	  (= 가상의 연결(Virtual Connection) 개념을 사용)
	- 웹 페이지와 관계없이 어떠한 정보를 유지하는 용도로 사용
	  ex) 로그인 후 아이디 정보를 기억하여 페이지 이동시에도 로그인 상태가 계속 유지되도록 함
	  (=> request 객체는 요청페이지에서 응답페이지까지만 정보가 유지됨)
	- 서버에 접속(연결) 시 기본적으로 해당 클라이언트에 해당하는 기억 장소(= 세션)가 생성되고
	  자동으로 아이디(세션ID) 값이 부여됨
	  => 주의! 로그인 할 때 사용하는 아이디가 아님(세션ID 는 사용자가 결정하지 못함)
	- 세션 유지 또는 제거 조건
	  1) 세션 유지 시간(타이머 = maxInactiveInterval) 값만큼 세션 정보가 유지됨
	     따라서, 유지 시간 동안 아무런 동작(통신)이 없을 경우 
	     세션 유지 시간이 만료될 때 세션 정보 자동 제거
	     => 참고) 기본 세션 유지 시간(maxInactiveInterval) 값은 1800(초) = 30분
	     => 참고) 서버와 통신을 수행하면 세션 유지 시간이 다시 초기화됨(처음부터 다시 카운팅)
	  2) 세션 유지 시간과 관계없이 invalidate() 메서드 호출 시 세션 초기화
	  3) 웹브라우저가 종료되면 세션 초기화
	--%>
</body>
</html>

















