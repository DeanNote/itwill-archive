<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <link rel="stylesheet" type="text/css" href="./css/default.css"> -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/default.css">
</head>
<body>
	<header>
		<jsp:include page="./inc/top.jsp"></jsp:include>
	</header>
	<article>
		<h1>MVC 게시판</h1>
		<h3><a href="BoardWriteForm.bo">글쓰기</a></h3>
		<h3><a href="BoardList.bo">글목록</a></h3>
	</article>
	<footer>
		<jsp:include page="./inc/bottom.jsp"></jsp:include>
	</footer>
	
</body>
</html>