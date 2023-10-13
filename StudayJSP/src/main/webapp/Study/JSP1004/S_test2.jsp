<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 10/4(수) JSP 주석 -->
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>test2.jsp</h2>
	<!-- HTML주석이다. -->
	<%-- JSP주석이다. --%>
	<%
	// JSP 문서 내에서 자바코드가 기술되는 영역
	/* 자바 주석 사용 가능!*/
	Date now = new Date();
	%>
	<h3>현재 시각 : <%=now %></h3>
	
	<hr>
	
<!-- 	<h2>test2.html</h2> -->
	<%
	Date now2 = new Date();
	%>
	<!--<h3>현재 시각 : <%=now2 %></h3>-->

<%-- 	<h3>현재 시각 : <%=now2 %></h3> --%>
	
</body>
</html>