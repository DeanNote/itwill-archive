<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>servlet2_main.jsp</h1>
<!-- 	Servlet2Main -> jsp08_servlet/Main2Servlet 맵핑 -->
	<form action="redirectServlet" method ="GET"> <!--  Servlet2RedirextServlet 클래스 매핑-->
		이름 : <input type="text" name="name"><br>
		나이 : <input type="text" name="age"><br>
	 	<input type="submit" value="redirectServlet 서블릿 주소 요청(GET)">
	</form>
	<form action="dispatchServlet" method ="GET"> <!--  Servlet2DispatchServlet 클래스 매핑-->
		이름 : <input type="text" name="name"><br>
		나이 : <input type="text" name="age"><br>
		<input type="submit" value="dispatchServlet 서블릿 주소 요청(GET)">
	</form>
</body>
</html>