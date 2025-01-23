<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객센터</title>
<%-- 외부 CSS 파일(css/default.css) 연결하기 --%>
<link href="${pageContext.request.contextPath}/css/cs.css" rel="stylesheet" type="text/css">
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
			<h1 id="h01">자주 묻는 질문</h1>
			<hr>
			<div id="cs_nav"> <%-- 사이드 메뉴바 --%>
				<jsp:include page="cs_menubar.jsp"></jsp:include>
			</div>
			
			<form action="" method="" name="" >
				<section id="search">
					<b>빠른 검색</b>
					<input type="search" placeholder="검색어를 입력해주세요"> <%-- 검색어 입력창 --%>
					<a href="cs_FAQ.jsp"><input type="button" value="검색"></a>
				</section>
			
				<nav id="fqa_button">
					<ul>
						<li><a href="#div01"><input type="button" value="전체"></a></li> <%-- 전체 질문 보기 --%>
						<li><a href="#div02"><input type="button" value="예매"></a></li> <%-- 예매 관련 질문 모아보기 --%>
						<li><a href="#div03"><input type="button" value="관람권"></a></li> <%-- 관람권 관련 질문 모아보기 --%>
						<li><a href="#div03"><input type="button" value="할인혜택"></a></li> <%-- 할인 관련 질문 모아보기 --%>
						<li><a href="#div03"><input type="button" value="영화관이용"></a></li> <%-- 영화관 관련 질문 모아보기 --%>
					</ul>
				</nav>
				
				<section>
					<table id="cs_table1">
						<tr>
							<th>번호</th>
							<th>구분</th>
							<th>제목</th>
							<th>등록일</th>
						</tr>
						<tr>
							<td>번호-내용넣기</td> <%-- 나중에 내용 집어넣기 --%>
							<td>구분-내용넣기</td>
							<td>제목-내용넣기</td>
							<td>등록일-내용넣기</td>
						</tr>
						<tr>
							<td>번호-내용넣기</td> <%-- 나중에 내용 집어넣기 --%>
							<td>구분-내용넣기</td>
							<td>제목-내용넣기</td>
							<td>등록일-내용넣기</td>
						</tr>
						<tr>
							<td>번호-내용넣기</td> <%-- 나중에 내용 집어넣기 --%>
							<td>구분-내용넣기</td>
							<td>제목-내용넣기</td>
							<td>등록일-내용넣기</td>
						</tr>
					</table>
				</section>

				<div class="pagination">
					<a href="#">&laquo;</a>
					<a href="#">1</a>
					<a class="active" href="#">2</a>
					<a href="#">3</a>
					<a href="#">4</a>
					<a href="#">5</a>
					<a href="#">&raquo;</a>
				</div>
			</form>
		</section>
		<footer>
			<jsp:include page="../inc/bottom.jsp"></jsp:include>
		</footer>
	</div>	
</body>
</html>