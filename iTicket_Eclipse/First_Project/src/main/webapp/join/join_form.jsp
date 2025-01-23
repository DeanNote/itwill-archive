<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<%-- 외부 CSS 파일(css/default.css) 연결하기 --%>
<link href="${pageContext.request.contextPath }/css/join.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
	window.onload = function() {
		<%-- "중복확인" 버튼 클릭 시 새 창 띄우기 --%>
		document.querySelector("#id_check").onclick = function() {
			window.open("check_id.jsp", "", "width=300, height=300, left=700, top=500");
		};
		
		<%-- 커서가 빠져나갈 때 아이디 길이 체크하기 --%>
		document.joinForm.id.onblur = function() {
			let id = document.joinForm.id.value; <%-- 입력받은 아이디 저장 --%>
			
		    if(id.length >= 5 && id.length <= 20) {
		     	document.querySelector("#checkIdResult").innerText = "사용 가능";
		     	document.querySelector("#checkIdResult").style.color = "green";
		    } else {
		     	document.querySelector("#checkIdResult").innerText = "5~20글자만 사용 가능합니다";
		     	document.querySelector("#checkIdResult").style.color = "red";
		    }
		};
		
		<%-- 키를 누를때마다 비밀번호 길이 체크하기 --%>
		document.joinForm.passwd.onkeyup = function() {
			let passwd = document.joinForm.passwd.value; <%-- 입력받은 비밀번호 저장 --%>
			
		    if(passwd.length >= 8 && passwd.length <= 16) {
		     	document.querySelector("#checkPasswdResult").innerText = "사용 가능한 패스워드";
		     	document.querySelector("#checkPasswdResult").style.color = "blue";
		    } else {
		     	document.querySelector("#checkPasswdResult").innerText = "8 ~ 16글자만 사용 가능합니다";
		     	document.querySelector("#checkPasswdResult").style.color = "red";
		    }
			
		};
		
		<%-- 비밀번호와 같은지 체크하기 --%>
		document.joinForm.passwd2.onkeyup = function() {
			let passwd = document.joinForm.passwd.value;
			let passwd2 = document.joinForm.passwd2.value;
			
		    if(passwd == passwd2) { <%-- 일치 --%>
		     	document.querySelector("#checkPasswd2Result").innerText = "비밀번호가 일치합니다";
		     	document.querySelector("#checkPasswd2Result").style.color = "blue";
		     	isSamePasswd = true;
		    } else { <%-- 불일치 --%>
		     	document.querySelector("#checkPasswd2Result").innerText = "비밀번호가 일치하지 않습니다";
		     	document.querySelector("#checkPasswd2Result").style.color = "red";
		     	isSamePasswd = false;
		    }
			
		};
		
		<%-- "가입완료" 클릭 시
	    	모든 필수 항목이 입력되었을 경우에만 submit 동작이 수행되도록 처리 --%>
		document.joinForm.onsubmit = function() {
			if(document.joinForm.id.value == "") {
				alert("아이디 입력은 필수입니다");
				document.joinForm.id.focus();
				return false; // submit 동작 취소
			} else if(!(document.joinForm.id.value.length >= 5 
					&& document.joinForm.id.value.length <= 20)) {
				alert("아이디를 올바르게 입력해주세요");
				document.joinForm.id.focus();
				return false; // submit 동작 취소
			} else if(document.joinForm.passwd.value == "") {
				alert("비밀번호 입력은 필수입니다");
				document.joinForm.passwd.focus();
				return false; // submit 동작 취소
			} else if(!(document.joinForm.passwd.value.length >= 8 
					&& document.joinForm.passwd.value.length <= 16)) {
				alert("비밀번호를 올바르게 입력해주세요");
				document.joinForm.passwd.focus();
				return false; // submit 동작 취소
			} else if(document.joinForm.passwd2.value == "") {
				alert("비밀번호 일치 여부를 확인해주세요");
				document.joinForm.passwd2.focus();
				return false; // submit 동작 취소
			} else if(document.joinForm.passwd2.value
					!= document.joinForm.passwd.value) {
				alert("비밀번호가 일치하지 않습니다");
				document.joinForm.passwd2.focus();
				return false; // submit 동작 취소
			} else if(document.joinForm.name.value == "") {
				alert("이름 입력은 필수입니다");
				document.joinForm.name.focus();
				return false; // submit 동작 취소
			} else if(document.joinForm.phone.value == "") {
				alert("휴대폰번호 입력은 필수입니다");
				document.joinForm.phone.focus();
				return false; // submit 동작 취소
			} else if(document.joinForm.email.value == "") {
				alert("이메일주소 입력은 필수입니다");
				document.joinForm.email.focus();
				return false; // submit 동작 취소
			} else if(document.joinForm.birth.value == "") {
				alert("생년월일 입력은 필수입니다");
				document.joinForm.birth.focus();
				return false; // submit 동작 취소
			}
			
			return true; // submit 동작 수행(생략 가능)
		};
		
		
	}; // window.onload 이벤트 끝
</script>
</head>
<body>
	<%-- div 태그로 전체를 감싼 후 가운데에 정렬하기 --%>
	<div id="wrapper">
		<header>
			<jsp:include page="../inc/top.jsp"></jsp:include>
		</header>
				
		<div id="menu_nav">
			<nav>
				<a href="${pageContext.request.contextPath}/reserve/movie_select.jsp">예매</a>
				<a href="${pageContext.request.contextPath}/movie/release.jsp">영화</a>
				<a href="${pageContext.request.contextPath}/theater/theater.jsp">극장정보</a>
				<a href="${pageContext.request.contextPath}/store/store_main.jsp">스토어</a>
				<a href="${pageContext.request.contextPath}/event/event_movie.jsp">이벤트</a>
				<a href="${pageContext.request.contextPath}/cs/cs_main.jsp">고객센터</a>
			</nav>
		</div>
		<hr id="top_hr">
		

		<section id="content">	
			<h1 id="h01">회원가입</h1> <%-- 제목영역 --%>
			<section id="join_top"> <%-- 회원가입 진행상황 --%>
				<span>본인인증</span>
				<span>약관동의</span>
				<span id="this">정보입력</span>
				<span>가입완료</span>		
			</section>
			
			<form action="join_completion.jsp" method="post" name="joinForm">
				<hr>
				<h3 id="join_top">회원정보입력</h3> <%-- 소제목 --%>
				<b id="warning">*은 필수</b> <br>
				<section id="join_center">
					<input type="text" id="id" name="id" placeholder="*아이디">
					<input type="button" id="id_check" value="중복확인" onclick="checkId()"> <br>
					<span id="checkIdResult"></span> <br>
					<input type="text" id="passwd" name="passwd" placeholder="*비밀번호"> <br>
					<span id="checkPasswdResult"></span> <br>
					<input type="text" id="passwd2" name="passwd2" placeholder="*비밀번호확인"> <br>
					<span id="checkPasswd2Result"></span> <br>
					<input type="text" id="name" name="name" placeholder="*이름"> <br>
					<input type="phone" id="phone" name="phone" placeholder="*휴대폰번호"  maxlength="11"> <br>
					<input type="text" id="email" name="email" placeholder="*이메일주소"> <br>
					<input type="text" id="birth" name="birth" placeholder="*생년월일" maxlength="8"> <br>
					<div class="joinbtn">
						<a href="join_certification.jsp"><input type="button" value="이전"></a>
						<a href="join_completion.jsp" ><input type="button" value="가입완료"></a>
					</div>
				</section>
			</form>
		</section>
		<footer>
			<jsp:include page="../inc/bottom.jsp"></jsp:include>
		</footer>
	</div>
</body>
</html>