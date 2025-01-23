<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<!-- 외부 CSS 파일(css/default.css) 연결하기 -->
<link href="${pageContext.request.contextPath }/css/join.css" rel="stylesheet" type="text/css">
</head>
<body>
	<!-- div 태그로 전체를 감싼 후 가운데에 정렬하기 -->
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
			<h1 id="h01">회원가입</h1> <!-- 제목영역 -->
			<section id="join_top"> <!-- 회원가입 진행상황 -->
				<span>본인인증</span>
				<span>약관동의</span>
				<span>정보입력</span>
				<span id="this">가입완료</span>		
			</section>
			
			<form action="" method="" name="" id="completion_msg">
				<hr>
				<h2>회원가입을 축하합니다</h2> <!-- 소제목 -->
				<p>(아이디) 님의 회원가입을 축하합니다. <br>
				로그인을 하시면 포인트 적립, 쿠폰 등 <br>
				다양한 혜택을 누리실 수 있습니다. </p>
				<section id="join_button">
					<a href=""> <input type="button" value="로그인"></a> <!-- 로그인 페이지로 바로 이동 -->
					<a href=""><input type="button" value="메인페이지"></a> <!-- 메인 페이지로 바로 이동 -->
				</section>
				<hr>
			</form>
		</section>
		<footer>
			<jsp:include page="../inc/bottom.jsp"></jsp:include>
		</footer>
	</div>	
</body>
</html>