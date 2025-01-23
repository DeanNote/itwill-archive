<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath }/inc/id_find.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h1>아이디찾기</h1>
	<hr>
		<form action="" method="get">
		<h3>아이디찾기</h3>
		
			<h5>이름</h5>
			<div class="div_center"><%--css 사용해서 정렬 --%>
				<input type="text" placeholder="이름을 입력해주세요" name="member_name" style="width: 350px;" required>
			</div>
			
			<h5>생년월일</h5>			
			<div class="div_center">
				<input type="text" placeholder="생년월일 8자리를 입력해주세요(YYYYMMDD)" name="member_birth" required style="width: 350px;">
			</div>
			
			<h5>휴대폰번호</h5>			
			<div class="div_center">
				<input type="text" placeholder="-없이 휴대폰번호를 입력해주세요" name="member_phone" required style="width: 350px;">
			</div>
			
			
			<p class="div_center">
				<input type="button" value="취소" style="width: 100px;"><%--로그인 페이지로 돌아가기 --%>
				<input type="submit" value="아이디찾기" style="width:100px;">
				<%--"아이디를 알림창으로 띄운뒤" 로그인 페이지로 돌아가기 --%>
			</p>
		</form>
</body>
</html>