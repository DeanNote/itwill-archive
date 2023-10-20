<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 내장 객체 response 를 활용하여 pageContextTest2.jsp 페이지로 이동
// 	response.sendRedirect("S_pageContextTest2.jsp");
// 또 다른 내장 객체 pageContext 객체의 forward() 메시지 활용
	pageContext.forward("S_pageContextTest2.jsp");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>S_pageContextTest1.jsp</h1>
	<script type="text/javascript">
		alert("확인");
	</script>
</body>
</html>