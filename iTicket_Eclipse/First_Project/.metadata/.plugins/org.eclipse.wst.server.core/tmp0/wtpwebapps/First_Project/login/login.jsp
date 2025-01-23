<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath }/inc/login.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h1>회원로그인</h1>
	<hr>
	<form action="" method="get"> <%-- 주소 연결 --%>
	
		<div align="right"> <%--login.css 사용해서 정렬 --%>
			<a href="">비회원로그인</a> <%--href 링크, 비회원로그인 부기능 --%>
		</div>
		
		<div class="log_area">
		<h3>로그인</h3>
			<h5>아이디</h5>		
			<div class="div_center"><%--login.css 사용해서 정렬 --%>
				<input type="text" placeholder="아이디입력" name="member_id" required style="width: 350px;">
			</div>
			<br>
			
			<h5>패스워드</h5>				
			<div class="div_center">
				<input type="password" placeholder="패스워드입력" name="member_pass" required style="width: 350px;">
			</div>
			<br>
			
			<div class="div_center">
				<input type="submit" value="로그인" style="width:360px;">
			</div>
			<br>
			
			<div align="center">
				<input type="checkbox">아이디 저장
					<a href="">회원가입</a>
					<a href="">아이디찾기</a>
					<a href="">비밀번호찾기</a>
			</div>
			
			<p class="div_center">
				<input type="submit" value="카카오 간편로그인" style="width: 360px;">
			</p>
			
			<div class="div_center">
				<input type="submit" value="네이버 간편로그인" style="width:360px;">
			</div>
		</div>
		
	</form>
</body>
</html>