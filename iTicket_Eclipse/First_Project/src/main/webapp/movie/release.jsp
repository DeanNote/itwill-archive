<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/css/movie.css" rel="stylesheet">
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
			<h1 id="h01">현재상영작</h1>
			<hr>
			<nav class="movie-menu">
				<ul>
					<li class="active"><a href="release.jsp">
						<input type="button" value="현재상영작"></a></li>
					<li><a href="comming.jsp">
						<input type="button" value="상영예정작"></a></li>
				</ul>
			</nav>
			<section class="movie-section">
				<div class="container">
					<div class="movie-grid">
					<c:forEach begin="1" end="16">
						<div class="movie">
							<a href="detail.jsp">
							<div class="movie-poster">
								<div class="poster">
									<img alt="" src="https://img.megabox.co.kr/SharedImg/2023/11/15/OM0860oG9r27Dz8NvMXxZJqydpkEwMdK_420.jpg">
								</div>
								<div>
									<p class="title">관람등급/제목</p>
								</div>
							</div>
							</a>
							<div class="reserve_area">
								<a href="../reserve/movie_select1.jsp"" class="rel_reservBtn">
									<input type="button" value="예매하기"></a>
							</div>
						</div>
					</c:forEach>
					</div>
				</div>
			</section>
		</section>
		<footer>
			<jsp:include page="../inc/bottom.jsp"></jsp:include>	
		</footer>
	</div>
</body>
</html>