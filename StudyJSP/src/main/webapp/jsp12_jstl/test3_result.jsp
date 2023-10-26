<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test3_result.jsp - JSTL</h1>
	<h3>\${param.name} ${param.name}</h3>
	<h3>\${param.age} ${param.age}</h3>
	
	<c:set var="num" value="10"/>
	\${num} ${num}
	<hr>
	
	<c:if test="${num > 0}">
		0 보다 크다!
	</c:if>
	
	
</body>
</html>














