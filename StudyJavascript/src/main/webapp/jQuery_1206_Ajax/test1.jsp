<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath}/js/jquery-3.7.1.js"></script>
<script type="text/javascript">
	/*
	AJAX(Asynchonous Javascript And Xml, 비동기식 자바스크립트&XML)
	- 웹 페이지(브라우저)의 갱신(Refresh) 없이도 서버로 요청을 수행하고 
	  요청에 대한 응답을 처리할 수 있는 자바스크립트(jQuery) 라이브러리
	- 데이터베이스 등의 작업 요청 시 요청된 응답이 돌아올 때까지 기다리지 않고
	  다른 작업을 수행하면서 요청에 대한 응답이 돌아오면 해당 응답을 처리하는 기술
	- 주로, 아이디 및 패스워드 검증 등의 실시간 정보 조회 작업에 활용
	- jQuery 의 라이브러리로 제공
	
	< 기본 문법 >
	$.ajax({
		type : xxx, // AJAX 로 요청 시 사용할 메서드(= 요청 방식 = "GET" or "POST" 등) 지정
		url : xxx, // AJAX 로 요청할 요청 주소(URL)
		data : xxx, // 요청(전송할) 데이터 지정(복수개 파라미터일 경우 중괄호로 묶고, 속성명 : 값 형식으로 지정)
		dataType : xxx, // 응답 데이터에 대한 타입 지정(생략 시 "text")
		success : function(response) { // 요청에 대한 처리 성공 시 처리할 함수 정의
			
		}, 
		error : function(xhr, textStatus, errorThrown) { // 요청에 대한 처리 실패 시 처리할 함수 정의
			
		}
	});
	*/
	// --------------------------------------------------------------
	// 로그인 버튼 클릭 이벤트 처리
	$(function() {
		$("#btnLogin").on("click", function() {
			// 아이디, 패스워드 중 하나라도 입력되지 않았을 경우 오류메세지 출력하고 함수 종료
			if($("#id").val() == "") {
				alert("아이디 입력 필수!");
				$("#id").focus();
				return;
			} else if($("#passwd").val() == "") {
				alert("패스워드 입력 필수!");
				$("#passwd").focus();
				return;
			}
			
// 			$("form").submit();
//------------------------------------------------------
			//AJAX 를 사용하여 test1_result.jsp 페이지로 요청 전송하기
			$.ajax()
			
		});
	});
</script>
</head>
<body>
	<div align="center">
		<h1>로그인</h1>
		<form action="" method="post">
			<input type="text" placeholder="아이디" name="id" id="id"><br>
			<input type="password" placeholder="패스워드" name="passwd" id="passwd"><br>
			<input type="button" value="로그인" id="btnLogin">
		</form>
	</div>
</body>
</html>














