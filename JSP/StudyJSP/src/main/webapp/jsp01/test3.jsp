<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
// 이 곳은 JSP 선언문(Declaration)으로 JSP 파일 전체(= 전역)에서 접근 가능한
// 멤버변수 및 메서드를 선언하는 곳입니다.
// => 자바 클래스 내의 멤버레벨(클래스 내부, 메서드 외부) 위치와 동일
// 1. 멤버변수 선언
String str1 = "멤버변수입니다.";

// 2. 메서드 정의
// 2-1. 리턴값이 없는 method1() 메서드
public void method1() {
	System.out.println("선언문 내의 method1() 메서드 호출됨!");
}

// 2-2. 리턴값이 있는 method2() 메서드
public String method2() {
	return "method2() 메서드의 리턴값";
}
%> <%-- 선언문 끝 --%>

<%! private String str2 = "두번째 멤버변수"; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test3.jsp</h1>
	<%--
	표현식 <%= %>
	- 선언문 또는 스크립틀릿에서 선언된 변수에 접근하여 값을 출력하거나
	  메서드 호출 후 리턴되는 값을 전달받아 출력하거나
	  연산에 대한 결과값을 출력하는 용도로 사용
	- 자바의 System.out.print() 메서드와 동일한 문법 구조 사용
	  (단, System.out.print() 메서드는 이클립스 콘솔에 출력되지만,
	  표현식은 웹페이지(브라우저) 내에 출력하므로 JSP 의 out.print() 메서드와 동일한 역할 수행)
	--%>
	<h3>멤버변수 str1 = <%=str1 %></h3>
	<h3>method2() 메서드 리턴값 : <%=method2() %></h3>
	
	<%-- 주의! 리턴타입이 void 인 메서드는 표현식(출력문)에 지정 불가! HTTP 500 에러 발생! --%>
<%-- 	<h3>method1() 메서드 리턴값 : <%=method1() %></h3> --%>
	
	<%--
	스크립틀릿 <% %>
	- 자바의 기본적인 문장들을 그대로 표현 가능한 블럭
	- 스크립틀릿 내부는 자바의 메서드 내부와 동일한 위치로 취급됨
	  => 메서드 내에서 수행 가능한 작업들만 코드로 기술 가능
	  => 자동 생성된 서블릿 클래스 내의 jspService() 메서드 내에 해당 코드가 모두 포함됨
	  => 스크립틀릿 내에서 선언된 변수는 로컬 변수로 취급되며,
	     메서드는 정의할 수 없다! (= 메서드 내에 메서드 정의 X) 
	--%>
	
	<%-- 스크립틀릿 내에서 선언된 로컬변수는 선언 위치보다 윗쪽(앞)에서 접근 불가! --%>
<%-- 	<h3>로컬변수 str3 = <%=str3 %></h3> --%>

	<%
	// 이 곳은 스크립틀릿 내부입니다.
	// 변수 선언도 가능하며, 선언된 변수는 로컬변수로 취급됨
	String str3 = "로컬변수입니다.";
	
	// 다른 메서드를 호출하거나, 객체 생성 등의 다양한 작업 가능함
	method1(); // 출력문이 아니므로 리턴타입 void 인 메서드 호출도 가능
	
	// 스크립틀릿 내에서 메서드 정의 불가
// 	public void method3() {} // 컴파일 에러 발생!

	System.out.println("이 문장은 이클립스 콘솔창에 출력됨!");
	System.out.println(str3);

	// 스크립틀릿 내에서 웹브라우저에 데이터 출력하려면 
	// JSP 에서 제공하는 내장객체인 out 객체의 print() 또는 println() 메서드 사용
	// => JSP 의 표현식과 동일한 역할을 수행
// 	out.println("이 문장은 웹브라우저 화면에 출력됨!");
// 	out.println(str3);
	// => 주의! println() 메서드를 호출하더라도 줄바꿈은 적용되지 않음!
	// => <br> 태그를 문자열로 함께 포함시켜야한다!
	out.println("이 문장은 웹브라우저 화면에 출력됨!<br>");
	out.println(str3 + "<br>");
	%>
	
	<%-- 로컬변수는 반드시 선언된 위치보다 아래쪽(뒤)에서만 접근 가능 --%>
	<h3>로컬변수 str3 = <%=str3 %></h3>
	
	
	<%-- 멤버변수는 선언문보다 윗쪽(앞)에서도 접근 가능! --%>
	<h3>멤버변수 str4 = <%=str4 %></h3>
	
	<%-- String 타입 멤버변수 str4 선언 및 "멤버변수 str4" 문자열 저장 --%>
	<%! String str4 = "멤버변수 str4"; %>
	
	<%-- <h3> 태그를 활용하여 멤버변수 str4 출력 --%>
	<h3>멤버변수 str4 = <%=str4 %></h3>
</body>
</html>




















