<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
		<jsp:include page="../inc/top.jsp"></jsp:include>
	</header>
	<article>
		<h1>test2/redirect.jsp</h1>
		<p>${msg}</p>
		<p>이름 : ${param.name}</p>
		<p>나이 : ${param.age}</p>
	</article>
	<footer>
	
	</footer>
</body>
</html>