<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<!-- 외부 CSS 파일(css/default.css) 연결하기 -->
<link href="${pageContext.request.contextPath }/css/join.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
	window.onload = function() {
		<%-- "전체동의" 체크박스 체크 시 취미 항목 모두 체크, 
			 "전체동의" 해제 시 취미 항목 모두 체크 해제하기 --%>
		document.querySelector("#agreeAll").onclick = function() {
		
			for(let i = 0; i < document.joinAgree.agree.length; i++) {
				document.joinAgree.agree[i].checked = document.querySelector("#agreeAll").checked;
			}
		};
		
	}; // window.onload 이벤트 끝
</script>
</head>
<body>
	<!-- div 태그로 전체를 감싼 후 가운데에 정렬하기 -->
	<div id="wrapper">
		<h1>회원가입</h1> <!-- 제목영역 -->
		<section id="join_top"> <!-- 회원가입 진행상황 -->
			<span>본인인증</span>
			<span id="this">약관동의</span>
			<span>정보입력</span>
			<span>가입완료</span>		
		</section>

		<form  action="join_form.jsp" method="post" name="joinAgree">
			<hr>
			<h3 id="join_top">약관 및 정보활용 동의</h3> <!-- 소제목 -->
			<label><input type="checkbox" id="agreeAll">전체동의</label> <br>
			<hr id="hr_mid">
			<section id="agree" name="agree">
				<label id="required"><input type="checkbox" name="agree" value="서비스 이용 약관 동의(필수)" required>
				서비스 이용 약관 동의(필수)</label> <br>
				<textarea readonly>약관</textarea> <br> <br> <!-- 수정불가 -->
				<label id="required"><input type="checkbox" name="agree" value="개인정보 수집 및 이용 동의(필수)" required>
				개인정보 수집 및 이용 동의(필수)</label> <br>
				<textarea readonly>약관</textarea> <br> <br> <!-- 수정불가 -->
				<label><input type="checkbox" name="agree" value="마케팅 활용을 위한 개인정보 수집 및 이용 안내(선택)">
				마케팅 활용을 위한 개인정보 수집 및 이용 안내(선택)</label> <br>
				<textarea readonly>약관</textarea> <br> <br> <!-- 수정불가 -->
				<label><input type="checkbox" name="agree" value="위치기반서비스 이용 약관 동의(선택)">
				위치기반서비스 이용 약관 동의(선택)</label> <br>	
				<textarea readonly>약관</textarea> <!-- 수정불가 -->
			</section>
			<section id="join_button">
				<input type="button" value="취소"> <!-- 취소하시겠습니까? 메세지 출력 후 메인 페이지로 바로 이동 -->
				<input type="submit" value="다음"> <!-- 회원 정보 입력 폼 페이지로 이동 -->
			</section>
			<hr>
			<p id="notice">선택약관에 동의하지 않으셔도 가입이 가능합니다.</p>
		</form>
	</div>
</body>
</html>