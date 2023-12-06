<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
<script type="text/javascript">
	$(function() {
		$("#btnOk").on("click", function() {
			$.ajax({
				
			});
		});
	});
</script>
</head>
<body>
	<h1>AJAX - test3_json.jsp</h1>
	<input type="button" value="JSON 데이터 파싱" id="btnOk">
	<hr>
	<div id="resultArea"></div>
	<hr>
	<div id="resultArea2"></div>
</body>
</html>











