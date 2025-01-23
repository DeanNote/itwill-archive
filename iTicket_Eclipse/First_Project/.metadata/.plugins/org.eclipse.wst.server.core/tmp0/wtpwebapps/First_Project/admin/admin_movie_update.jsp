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
		margin: 10px;
	}
	
	.contentBlock_w {
		background-color: gray;
		width: 700px;
		height: 100px;
		border: 1px solid;
	
	}	

</style>
</head>
<body>
	<select>
		<option>명탐정코난 흑철의 어영</option>
		<option>B영화</option>
		<option>C영화</option>
		<option>D영화</option>
		<option>E영화</option>
		<option>F영화</option>
	</select>
	<input type="button" value="조회"><br><br>
	<img src="../img/명탐정 코난.jpeg" width="250" height="400">
	<input type="file"><br><br>
	<div class="contentBlock">
		<sup>영화코드</sup><br><br><br>
		<input type="text" style="border:none;">
	</div>
	<div class="contentBlock">
		<sup>영화제목</sup><br><br><br>
		<input type="text" style="border:none;">
	</div>
	<br><br>
	<div class="contentBlock">
		<sup>제작년도</sup><br><br><br>
		<input type="text" style="border:none;">
	</div>
	<div class="contentBlock">
		<sup>상영시간</sup><br><br><br>
		<input type="text" style="border:none;">
	</div>
	<br><br>
	<div class="contentBlock">
		<sup>관람등급</sup><br><br><br>
		<input type="text" style="border:none;">
	</div>
	<div class="contentBlock">
		<sup>장르</sup><br><br><br>
		<input type="text" style="border:none;">
	</div>
	<br><br>
	<div class="contentBlock">
		<sup>상영일</sup><br><br><br>
		<input type="date" style="border:none;">
	</div>
	<div class="contentBlock">
		<sup>종영일</sup><br><br><br>
		<input type="date" style="border:none;">
	</div>
	<br><br>
	<div class="contentBlock_w">
		<sup>줄거리</sup><br><br><br>
		<input type="text" style="border:none;">
	</div>
		<br><br>
	<div class="contentBlock_w">
		<sup>상영상태</sup><br><br><br>
		<input type="text" style="border:none;">
	</div>
	<input type="button" value="등록">
</body>
</html>