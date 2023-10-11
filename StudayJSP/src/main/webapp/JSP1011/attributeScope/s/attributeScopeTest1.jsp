<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>영역 객체 속성 및 범위</h1>
	<%
	/*
	JSP 4대 영역
	
	*/
	pageContext.setAttribute("pageScope", "pageContext value");
	request.setAttribute("pageScope", "request value");
	session.setAttribute("pageScope", "session value");
	application.setAttribute("pageScope", "application value");
	%>
</body>
</html>