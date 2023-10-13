<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test1.jsp</h1>
	<!-- 
	지금까지 요청주소를 특정 파일명 xxx.jsp 을 사용했으나
	서블릿 주소는 특정 파일의 이름이 아닌 가상의 주소를 요청 주소로 사용
	-------------------------------------------------------------------
	서블릿 요청 방식 (GET or POST)중
	 form태그내에 method ="POST" 명시될 경우에만 POST 사용
	 그 외 대부분 모두 GET 방식 요청으로 취급된다! 
	 -->
	 <h3><a href="myServlet">myServlet 서블릿 주소 요청(GET)</a></h3>
	 
	 <!-- form 태그를 사용하여 get, post 각각 myServlet 주소 요청 -->
	 <form action="myServlet" method ="GET">
	 	<input type="submit" value="myServlet 서블릿 주소 요청(GET)">
	 </form>
	 <form action="myServlet" method ="POST">
	 	<input type="submit" value="myServlet 서블릿 주소 요청(POST)">
	 </form>
	 <form action="myServlet_fail" method ="POST">
	 	<input type="submit" value="myServlet_fail 서블릿 주소 요청(실패)">
	 </form>
</body>
</html>