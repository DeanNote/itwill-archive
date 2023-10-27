<%@page import="jsp11_jdbc_dao.StudentDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test4_result.jsp - JSTL</h1>
	<%--
	request 객체에 저장된 속성값 꺼낼 때 request.getAttribute() 메서드 사용했으나
	EL 문법은 ${영역객체명.속성명} 형식으로 꺼낼 수 있다!
	=> 이 때, 영역객체명은 생략 가능하며 page -> request -> session -> application 영역을
	   차례대로 검사하여 일치하는 속성에 접근한다!
	=> 주의! 파라미터는 ${param.파라미터명} 이고, 속성은 ${속성명} 형식 사용
	--%>
	<h3>
		번호 : ${idx }<br>
		이름 : ${name }
	</h3>
	<hr>
		
	<%-- 자바의 일반 for문을 통해 제어변수 i값이 1 ~ 10까지 1씩 증가 => i값 출력 --%>
	<%
	for(int i = 1; i <= 10; i++) {
		out.print(i + " ");
	}
	%>
	<hr>
	<%--
	[ JSTL - 반복문(<c:forEach></c:forEach> 태그) ]
	- 일반 for문과 향상된 for문을 모두 사용 가능한 for문(속성 조합에 따라 달라짐)
	--------------------------------------------------
	1) 일반 for문과 동일(시작값 ~ 종료값까지 증감값만큼 반복)한 문법
	<c:forEach var="제어변수명" begin="시작값" end="종료값" step="증감값">
		// 반복문 내에서 실행할 문장들...
		// var 속성으로 생성된 변수는 EL 을 통해 접근 가능(${변수명})
	</c:forEach>
	=> step 속성 생략 시 기본값 1씩 증가
	--%>
	<c:forEach var="i" begin="1" end="10">
		${i }
	</c:forEach>
	<br>
	<c:forEach var="i" begin="1" end="10" step="2">
		${i }
	</c:forEach>
	<hr>
	<%-- 자바의 일반 for문으로 request 객체에 저장된 names 배열에 차례대로 접근 --%>
	<%
	String[] names = (String[])request.getAttribute("names");
	for(int i = 0; i < names.length; i++) {
		out.print(names[i] + " ");
	}
	%>
	<br>
	<%-- <c:forEach> 태그로 동일한 작업 수행(단, 기본적인 방법으로는 배열 크기 알아낼 수 없다) --%>
<%-- 	<c:forEach var="i" begin="0" end="2"> --%>
<!-- 		out.print(names[i] + " "); -->
<%-- 	</c:forEach> --%>
	배열크기 : ${fn:length(names) }<br>
	<c:forEach var="i" begin="0" end="${fn:length(names) }" >
		${names[i] }
	</c:forEach>
	<hr>
	<%--
	2) 향상된 for문
	 --%>
	 <%
	 for(String name: names){
		 out.print(name + " ");
	 }
	 %>
	 <hr>
	 <c:forEach var="name" items="${names }" varStatus="status">
	 	${name } - status.index : ${status.index }, status.count : ${status.count }<br>
	 </c:forEach>
	 <hr>
	 
	 <%
	 //request 객체에 저장된 List 객체 꺼내서 List<StudentDTO> 타입 변수에 저장
	 List<StudentDTO> studentList = (List<StudentDTO>)request.getAttribute("studentList");
	 
	 for(StudentDTO List : studentList){
		 out.print(List.getIdx() + ", " + List.getName() + "<br>");
	 }
	 %>
	<c:forEach var="student" items="${studentList }" >
 		번호 : ${student.idx }, 이름 : ${student.name }<br>
 	</c:forEach>
 	
	
	
	
	
</body>
</html>













