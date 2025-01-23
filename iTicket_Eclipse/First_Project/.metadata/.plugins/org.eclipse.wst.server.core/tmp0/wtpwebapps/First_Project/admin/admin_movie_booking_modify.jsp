<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

	.contentBlock {
		background-color: gray;
		width: 300px;
		height: 100px;
		border: 1px solid;
		display: inline-block;
	}
	
/* 	#btnArea { */
/* 		text-align: center; */
/* 	} */
	

</style>
</head>
<body>
	<div class="contentBlock">
		<sup>회원ID</sup><br><br><br>
		<input type="text" style="border:none;">
	</div>
	<br>
	<div class="contentBlock">
		<sup>영화제목</sup><br><br><br>
		<input type="text" style="border:none;">
	</div>
	<div class="contentBlock">
		<sup>관람일</sup><br><br><br>
		<input type="text" style="border:none;">
	</div>
	<br>
	<div class="contentBlock">
		<sup>지점/상영관</sup><br><br><br>
		<input type="text" style="border:none;">
	</div>
	<div class="contentBlock">
		<sup>예매좌석</sup><br><br><br>
		<input type="text" style="border:none;">
	</div>
	<div class="contentBlock">
		<sup>예매인원수</sup><br><br><br>
		<input type="text" style="border:none;">
	</div>
	<br>
	<div class="contentBlock">
		<sup>결제금액</sup><br><br><br>
		<input type="text" style="border:none;">
	</div>
	<div class="contentBlock">
		<sup>결제일</sup><br><br><br>
		<input type="text" style="border:none;">
	</div>
	<div class="contentBlock">
		<sup>결제유무</sup><br><br><br>
		<input type="text" style="border:none;">
	</div>
	<br>
	<section id="btnArea">
		<input type="button" value="뒤로가기">
		<input type="button" value="수정">
		<input type="button" value="삭제">
	</section>
</body>
</html>