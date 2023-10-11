<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3 align="center">include 템플릿 페이지</h3>
	<table border="1" align="center">
		<tr>
			<td colspan="2" width="800" height="100">
				<%@ include file="includeTemplate_top.jsp" %>
			</td>
		</tr>
		<tr>
			<td width="200" height="400">
				<%@ include file="includeTemplate_left.jsp" %>
			</td>
			<td>
				<%@ include file="includeTemplate_main.jsp" %>
			</td>
		</tr>
		<tr>
			<td colspan="2" height="100">
				<%@ include file="includeTemplate_bottom.jsp" %>
			</td>
		</tr>
	</table>
</body>
</html>