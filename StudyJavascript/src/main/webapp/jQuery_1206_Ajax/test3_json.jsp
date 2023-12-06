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
			// test3_json_data.txt 파일을 AJAX 를 통해 요청
			// - 응답 데이터 형식(dataType 속성)을 지정하지 않으면 자동 식별
			//   만약, 단순 텍스트일 경우 "text" 또는 "html" 형식으로 지정해도 됨
			// - 전송할 파라미터가 없을 경우 data 속성 생략
			$.ajax({
				type: "GET", // 생략 가능
				url: "test3_json_data.txt", // 일반 파일도 요청 가능
				dataType: "json", // 응답 데이터를 단순 텍스트로 취급
				success: function(data) {
					$("#resultArea").html("AJAX 요청 성공<br>" + data);
				},
				error : function() {
					$("#resultArea").html("AJAX 요청 실패!");
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











