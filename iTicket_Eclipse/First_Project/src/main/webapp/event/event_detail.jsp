<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath }/css/event.css" rel="stylesheet">
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
		
		
		<section id="content">
			<h1 id="h01">이벤트</h1>
			<hr>
			<section id="event_detail">
				<div class="detail_tit">
					<h1>&lt;나폴레옹&gt; 돌비 포스터 증정 이벤트</h1>
				</div>
				<div class="detail_date">
					<p>기간 | 2023.11.30 ~ 2023.12.10</p>
				</div>
				<hr>
				<div class="detail_img">
					<img alt="" src="https://www.megabox.co.kr/SharedImg/editorImg/2023/11/23/RKwgsrC8o0U86YObxYmxZbyQ4zasRN8a.jpg">
				</div>
			</section>
		</section>
		
		<footer>
			<jsp:include page="../inc/bottom.jsp"></jsp:include>	
		</footer>
		
	</div>
</body>
</html>