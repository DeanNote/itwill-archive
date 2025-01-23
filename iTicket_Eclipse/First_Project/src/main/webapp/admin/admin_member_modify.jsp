<%-- admin_member_modify.jsp --%>
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
			<h1>XXX의 회원 정보</h1> <!-- 회원 아이디 값 -->
			<br>
			<table border="1" id="admin_member_Profile">
				<tr>
					<th width="100">이름</th>
					<td colspan="2">아이유</td>
				</tr>
				<tr>
					<th>계정</th>
					<td colspan="2">아이유짱</td>
				</tr>
				<tr>
					<th>회원상태</th>
					<td>빈사상태</td>
					<td>DIE</td>
				</tr>
				<tr>
					<th>멤버십</th>
					<td>VVDIE</td>
					<td>구해줘요</td>
				</tr>
				<tr>
					<th>아이디</th>
					<td colspan="2">iuzzang</td>
				</tr>
				<tr>
					<th>생년월일</th>
					<td colspan="2">1993.05.16</td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td colspan="2">010-1169-4485</td>
				</tr>
				<tr>
					<th>이메일</th>
					<td colspan="2">iuzzang@iuzzang.com</td>
				</tr>
			</table>
			<br>
			<section id="btnCtr"> 
				<!-- 자바스크립트 사용해 사이즈 조정 후 팝업으로 만들 창이므로 버튼을 미리 가운데 정렬-->
				<input type="button" value="수정">
				<input type="button" value="돌아가기" onclick="window.close()">
				<input type="button" value="삭제" onclick="confirm('삭제하시겠습니까?')">
			</section>
		</div>
	</form>
</body>
</html>