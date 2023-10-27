<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>test3.jsp</h1>
		<%-- 셀렉트박스 언어 선택 시 Test3Cookie 서블릿 요청(파라미터로 셀렉트박스 값 전달) --%>
		<select name="lang" onchange="location.href='Test3Cookie?lang=' + this.value">
			<option value="ko-kr">한국어</option>
			<option value="en-us">영어</option>
		</select>
	</div>
</body>
</html>











