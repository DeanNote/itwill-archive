<%-- admin_board_notice_detail.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="admin.css" rel="stylesheet" type="text/css">
</head>
<body>
	<form action="">
		<div id="admin_member_Profile">
			<h1>공지사항 상세 정보</h1> <!-- 회원 아이디 값 -->
			<br>
			<table border="1" id="admin_member_Profile">
				<tr>
					<th width=80>번호</th>
					<td>아이유</td>
				</tr>
				<tr>
					<th>제목</th>
					<td>아이유짱</td>
				</tr>
				<tr>
					<th>작성자</th>
					<td>빈사상태</td>
				</tr>
				<tr>
					<th height=400>내용</th>
					<td>VVDIE</td>
				</tr>
				<tr>
					<th>사진첨부</th>
					<td style="text-align: left"><input type="file"></td>
				</tr>
			</table>
			<br>
			<section id="btnCtr"> 
				<!-- 자바스크립트 사용해 사이즈 조정 후 팝업으로 만들 창이므로 버튼을 미리 가운데 정렬-->
				<input type="button" value="수정" onclick="confirm('수정하시겠습니까?')">
				<input type="button" value="돌아가기" onclick="window.close()">
				<input type="button" value="삭제" onclick="confirm('삭제하시겠습니까?')">
			</section>
			</div>
	</form>
</body>
</html>