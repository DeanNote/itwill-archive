<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! 
	//10/4(수) JSP 선언문, 스크립틀릿, 표현식
	// 이곳은 JSP 선언문! 파일 전체에서 접근 가능한 멤버변수, 메서드 선언하는 곳
	// 1. 멤버변수 선언
	String str1 = "멤버변수입니다.";
	// 2. 리턴값이 없는 메서드 선언
	public void method1(){
		System.out.println("선언문 내  method1 호출 됨"); // Console에 출력
	}
	// 3. 리턴값이 있는 메서드 선언
	public String method2(){
		return "method2() 메서드의 리턴값";
	}

%><%-- 선언문 끝 --%>
<%! private String srt2 = "두번째 멤버변수!"; %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test3.jsp</h1>
	<h3>멤버변수 str1 = <%=str1 %></h3>
	<h3>method2() 메서드 리턴값 : <%=method2() %></h3>
	
	<!-- 리턴타입 void 메서드는 표현식(출력문)에 지정 불가! http500 에러 발생! -->
<%-- 	<h3>method2() 메서드 리턴값 : <%=method1() %></h3> --%> 

<%-- 	<h3>로컬변수 str3 = <%=str3 %></h3> --%>
	<!-- 	str3 cannot be resolved to a variable -->
	<!-- 스크립틀릿 내에서 선언된 로컬변수는 선언 위치보다 위로 올수 없다.  -->
	
	<%
		/*
		이곳은 스크립틀릿 내부입니다.
		변수 선언 가능, 선언된 변수는 로컬변수로 취급
		*/
		String str3 = "로컬변수입니다.";
		
		method1(); //출력문 아니므로 리턴타입 void인 메서드 호출 가능
		
		//스크립틀릿 내에서 메서드 정의 불가!!
	// 	public void method3(){} 
		// Syntax error on token "method3", AnnotationName expected after this token 
		// 문법 오류! 컴파일 에러!
		System.out.println("이 문장은 이클립스 콘솔창에 출력됨!");
		System.out.println(str3);
		
		/*
		스크립틀릿 내에서 웹브라우저에 데이터 출력하려면
		JSP에서 제공하는 내장객체인 out 객체의 print() 또는 println()메서드 사용
		=> JSP의 표현식과 동일한 역할을 수행
		*/
		
		out.println("이 문장은 웹브라우저 화면에 출력됨!<br>");
		out.println(str3+"<br>");
		//줄바꿈 적용 안되서 <br> 사용해야 함!!!
	%><!-- 스크립틀릿 끝! -->
	<%-- 로컬변수는 반드시 선언된 위치보다 아래에서만 접근 가능 --%>
	<h3>로컬변수 str3 = <%=str3 %></h3>
	
	<%-- String 타입 멤버변수 str4 선언 및 "멤버변수 str4"문자열 저장 --%>
	<h3>멤버변수 str4 = <%=str4 %></h3>
	<%! String str4 = "멤버변수 str4 문자열 저장"; %>
	<h3>멤버변수 str4 = <%=str4 %></h3>
</body>
</html>