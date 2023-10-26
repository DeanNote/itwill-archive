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
		\${num}값(${num}) 0 보다 크다!<br>
	</c:if>
	
	<c:if test="${param.age < 20 }">
		20세 미만!<br>
	</c:if>
	
	<c:if test="${empty param.name }">
		<script>
			alert("이름 입력 필수!")
			history.back(); 
		</script>
	</c:if>
	<hr>
	
	<c:set var="num" value="-4" />
	<c:choose>
		<c:when test="${num > 0}">
			num(${num })은 0보다 크다!
		</c:when>
		<c:when test="${num < 0 }">
			num(${num })은 0보다 작다!
		</c:when>
		<c:otherwise>
			num(${num })은 0이다!
		</c:otherwise>	
	</c:choose>
	<hr>
	<h3>\${param.name}= ${param.name}</h3>
	<c:choose>
		<c:when test = " ${param.name eq '이순신'}">
			\${param.name } = ${param.name } 
		</c:when>
		<c:when test = " ${param.name eq '홍길동'}">
			\${param.name } = ${param.name }
		</c:when>
		<c:when test = " ${empty param.name}">
			<script>
				alert("이름 입력 필수!")
				history.back();
			</script>
		</c:when>
	
	</c:choose>
	
</body>
</html>














