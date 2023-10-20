<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>S_pageContextTest2.jsp</h1>
	<h3>include()메서드 호출 전</h3>
	<hr>
	<%
	//pageContext 객체의 include()메서드 호출
	//S_pageContextTest2_include1.jsp 호출
	pageContext.include("S_pageContextTest2_include1.jsp");
	%>
	<hr>
	<%
	pageContext.include("S_pageContextTest2_include2.jsp");
	%>
	<hr>
	<h3>include() 메서드 호출 후</h3>
</body>
</html>