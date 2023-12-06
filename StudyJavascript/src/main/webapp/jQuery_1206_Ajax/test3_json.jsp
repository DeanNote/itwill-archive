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
// 				type : "GET" // 생략가능
				url: "test3_json_data.txt",
// 				data : 전송할 파라미터 없음 -> 생략
				data : "text", // 응답 데이터를 단순 텍스트로 취급
				succes: function(data){
					alert("AJAX 요청 성공!" + data);
				},
				error: function(){
					alert("AJAX 요청 실패!");
				}
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











