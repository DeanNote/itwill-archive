<%@page import="jsp11_jdbc_dao.StudentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test1_result.jsp</h1>
	<%-- 기존 자바 코드를 활용한 파라미터(name, age) 및 세션 객체 속성값(testValue) 처리 --%>
	<%
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	
	String sessionValue = (String)session.getAttribute("testValue"); 
	
	// session 객체에 저장된 StudentDTO 객체를 "student" 속성명으로 접근하여 가져오기
	StudentDTO student = (StudentDTO)session.getAttribute("student");
	%>
		<h3>
			이름 : <%=name %><br>
			나이 : <%=age %><br>
			세션값 : <%=sessionValue %><br> 
			Student 객체의 idx 값 : <%=student.getIdx() %><br>
			Student 객체의 name 값 : <%=student.getName() %>
		</h3>
	<hr>
		<h3>
			이름 : <%=request.getParameter("name") %><br>
			나이 : <%=request.getParameter("age") %><br>
			세션값 : <%=session.getAttribute("testValue") %> <br>
			Student 객체의 idx 값 : <%=student.getIdx() %><br>
			Student 객체의 name 값 : <%=student.getName() %>
		</h3>
	<hr>
	<%--
	< EL(Expression Language) >
	- JSP 스크립트 태그(= 표현식 <%=%>) 대신 사용 가능한 데이터 처리 표현 방식(언어)
	  (단, JSP 페이지에서만 사용 가능함)
	- JSP 스크립트 태그는 다른 일반 태그(<>)와 혼동을 가져올 수 있지만
	  EL 은 이러한 단점을 보완
	- 기본 표기법 : ${데이터}   =>  <%=%> 기호를 ${} 기호로 변경
	  ex) test 다른 변수 값을 EL 로 표현할 경우 ${test} (표현식은 <%=test%>)
	- 변수값만 지정 가능한 것이 아니라 내장 객체 및 연산자도 제공됨
	  1) 이전 페이지로부터 전달받은 request 객체의 파라미터(URL 파라미터 포함) 접근 시
	     => ${param.파라미터명}
	  2) 각 영역 객체 의 속성 접근 시
	     => ${영역객체명.속성명}   
	     => EL 에서 내장된 영역 객체명 : pageScope, requestScope, sessionScope, applicationScope
	- EL 문장을 데이터로서 취급해야할 경우(= 파싱되지 않고 문자열 자체로 사용할 경우)
	  $ 기호 앞에 \(백슬래시) 기호를 붙여서 표기하면 해당 문장은 단순 텍스트로 취급됨
	  ex) ${name} 을 단순 텍스트로 취급 시 \${name} 으로 표현하면 그대로 화면에 출력됨
	- request 객체 등을 통해 DTO 객체 등을 저장한 후 사용할 때
	  DTO 객체에 접근하는 코드를 ${객체명.변수명} 형태로 접근이 가능하며
	  변수에 직접 접근하는 것처럼 보이지만 실제로는 getXXX() 메서드를 호출하도록 구성되어 있음
	  따라서, DTO 클래스 정의 시 멤버변수 선언 및 Getter 메서드 정의 필수!
	- ${} 내에 잘못된 값을 입력하더라도 오류가 아닌 빈 문자열 출력됨
	  (단, 아무것도 기술하지 않으면 오류 발생)
	--%>
		<h3>
			<%-- EL 을 사용하여 request 객체 내의 파라미터 처리(내장객체 param 활용) --%>
			<%-- ${param.파라미터명} 형식으로 접근 --%>
			이름 : ${param.name }<br> <%-- <%=request.getParmeter("name")%> 코드 대체 --%>
			나이 : ${param.age }<br> <%-- <%=request.getParmeter("age")%> 코드 대체 --%>
			주민번호 : ${param.jumin }<br><%--null String 출력 --%>
			<%-- EL 을 사용하여 session 객체의 속성 처리(내장객체 sessionScope 활용) --%>
			세션의 testValue 값 : ${sessionScope.testValue }<br> <%-- <%=session.getAttribute("testValue")%> 코드 대체 --%>
			<%-- 세션 객체 내에 Student 객체를 통해 멤버변수값 접근 --%>
			<%-- 주의! Getter 메서드명이 아니라, 멤버변수명 지정(단, 내부적으로는 멤버변수가 호출됨) --%>
			세션의 Student 객체의 idx 값 : ${sessionScope.student.idx }<br>
			세션의 Student 객체의 name 값 : ${sessionScope.student.name }
		</h3>
	<hr>
		<h3>
			\${param.name} : ${param.name}<br> 
			\${param.age} : ${param.age}<br> 
			\${param.jumin} : ${param.jumin}<br> 
			\${sessionScope.testValue} : ${sessionScope.testValue}<br> 
		</h3>
	<hr>
		<h3>
			\${10 + 20} = ${10 + 20}<br> 
			\${param.age + 20} = ${param.age + 20}<br> 
			\${10 >= 20} = ${10 >= 20}<br> 
			\${10 ge 20} = ${10 ge 20}<br> 
			\${10 == 20} = ${10 == 20}<br> 
			\${10 eq 20} = ${10 eq 20}<br> 
			<br>
			\${param.name eq null} = ${param.name eq null}<br>
			\${param.name ne null} = ${param.name ne null}<br>
			\${param.jumin eq null} = ${param.jumin eq null}<br>
			\${param.jumin eq ''} = ${param.jumin eq ''}<br>
			\${param.score eq null} = ${param.score eq null}<br>

			\${empty param.name} = ${empty param.name}<br>
			\${empty param.jumin} = ${empty param.jumin}<br>
			\${empty param.score} = ${empty param.score}<br>
			
			\${not empty param.name} = ${not empty param.name}<br>
			
			
		</h3>
	
</body>
</html>














