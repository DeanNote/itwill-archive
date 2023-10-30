<%@page import="jsp14_servlet2.StudentDTO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<main>
		<div align="center">
			<h1>학생 목록 조회</h1>
			<table border="1">
				<tr>
					<th>번호</th>
					<th>이름</th>
				</tr>
				<c:forEach var="student" items="${studentList }">
					<tr>
						<td>${student.idx }</td>
						<td>${student.name }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</main>
</body>
</html>











