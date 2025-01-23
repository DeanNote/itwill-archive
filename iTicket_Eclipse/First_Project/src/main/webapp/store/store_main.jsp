<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스토어 메인페이지</title>
<link href="${pageContext.request.contextPath }/css/store.css" rel="stylesheet" type="text/css">
</head>
<body>
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
		
		
		<div id="content">
			<div id="div_store_01">
				<h1 id="h01">스토어</h1>
				<hr>
				<!-- 버튼 클릭시 해당 섹션으로 이동  -->
				<!-- body부분 페이지 변환없이 한페이지에서 모두 보이도록 구성 -->

				<nav class="menubtn">
					<ul>
						<li><a href="#div01"><input type="button" value="베스트"></a></li>
						<li><a href="#div02"><input type="button" value="영화관람권"></a></li>
						<li><a href="#div03"><input type="button" value="스낵음료"></a></li>
						<li><a href="store_pay.jsp"><input type="button" value="장바구니"></a></li>
					</ul>
				</nav>
				<!-- 가격 이미지로 작업해서 한번에 보이게 할예정 -->
				<!-- 클릭시 상세페이지로 전환 -->
				<div id="div01">
					<h2>베스트</h2>
					<img alt="" src="../img/짜파게티팝콘패키지.jpg" width="250" height="200">
					<img alt="" src="../img/팝콘패키지.jpg" width="250" height="200">
					<img alt="" src="../img/맥주패키지.jpg" width="250" height="200">
				</div>
				<br>
				<div id="div02">
					<hr>
					<h2>영화관람권</h2>
					<!-- 가격까지 이미지로 다 넣어서 해야할듯 이미지 파일 편집 -->
					<a href=""><img alt="" src="../img/일반관람권.jpg" width="250" height="200"></a>
					<a href=""><img alt="" src="../img/vip관람권.jpg" width="250" height="200"></a>
				</div>
				<br>
				<div id="div03">
					<hr>
					<h2>스낵/음료</h2>
					<!-- 가격까지 이미지로 다 넣어서 해야할듯 이미지 파일 편집 -->
					<a href=""><img alt="" src="../img/스위트콤보.png" width="200" height="250"></a>
					<a href=""><img alt="" src="../img/더블.png" width="200" height="250"></a>
					<a href=""><img alt="" src="../img/콜라M.png" width="200" height="250"></a> <br>
					<a href=""><img alt="" src="../img/콜라L.png" width="200" height="250"></a>
					<a href=""><img alt="" src="../img/오리지날M.png" width="200" height="250"></a>
					<a href=""><img alt="" src="../img/오리지날L.png" width="200" height="250"></a> <br>
					<a href=""><img alt="" src="../img/캬라멜M.png" width="200" height="250"></a>
					<a href=""><img alt="" src="../img/캬라멜L.png" width="200" height="250"></a>
					<a href=""><img alt="" src="../img/반반.png" width="200" height="250"></a>
				</div>
				
				<!-- 폰트사이즈 조절 및 위지 조절  -->
				<div id="store_notice">
					<hr>
					영화관 고객센터 ☎1544-0000
					상담가능 시간 : 월 ~ 금 10:00~12:00
					* 이 외 시간은 자동 응답 안내 가능 
					<hr>
				</div>
			</div>
		</div>
		<footer>
			<jsp:include page="../inc/bottom.jsp"></jsp:include>
		</footer>
	</div>
</body>
</html>