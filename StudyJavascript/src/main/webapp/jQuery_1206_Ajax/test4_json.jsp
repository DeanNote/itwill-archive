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
				type: "GET", // 생략 가능
				url: "test3_json_data.txt", // 일반 파일도 요청 가능
				dataType: "json", // 응답 데이터를 JSON 객체로 취급 
				success: function(data) {
					$("#resultArea").html("<table border='1'><tr><th>아이디</th><th>이름</th><th>나이</th></tr></table>");
					$("#resultArea > table").append(
						"<tr>"
						+ "<td>" + data.id + "</td>"
						+ "<td>" + data.name + "</td>"
						+ "<td>" + data.age + "</td>"
						+ "</tr>"
					);
					
				},
				error : function() {
					$("#resultArea").html("AJAX 요청 실패!");
				}
			}); // ajax 요청 끝
			//==============================================================
			$.ajax({
// 				type "GET" 생략
				url : "test3_json_data2.json",
				dataType : "JSON",
				success : function(data){
					// 테이블에 해당 데이터 출력하기 위해 테이블 생성
					$("#resultArea2").html("<table border='1'><tr><th>아이디</th><th>이름</th><th>나이</th><th>주소</th></tr></table>");
					// 생성된 테이블 내의 마지막 요소로 1개 행 삽입하여 데이터 출력
					$("#resultArea2 > table").append(
						"<tr>"
						+ "<td>" + data.id + "</td>"
						+ "<td>" + data.name + "</td>"
						+ "<td>" + data.age + "</td>"
						+ "<td>" + data.address.address1 + " " + data.address.address2 + "</td>"
						+ "</tr>"
					);
				},
				error : function(){
					$("#resultArea2").html("AJAX 요청 실패!");
				}
			});
			
			
			
		}); // 버튼 클릭 이벤트 끝
		
	}); // document.ready 이벤트 끝
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











