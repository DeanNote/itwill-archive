<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../css/release.css" rel="stylesheet">
</head>
<body>
	<h1>현재 상영작</h1>
	<nav>
		<ul>
			<li><a href="movie/release.jsp"><b>현재상영작</b></a></li>
			<li><a href="movie/comming.jsp">상영예정작</a></li>
		</ul>
		<hr>
	</nav>
	<c:forEach begin="1" end="3">
		<section class="line">
			<div class="poster">
				<c:forEach begin="1" end="5">
					<a href="detail.jsp"><img alt="" src="" width="200" height="280" class="poster"></a>
				</c:forEach>
			</div>
			<div>
				<c:forEach begin="1" end="5">
					<div class="title">관람등급/제목</div>
				</c:forEach>
			</div>
			<div class="reserve_area">
				<c:forEach begin="1" end="5">
					<a href="#" class="reservBtn"><span >예매하기</span></a>
				</c:forEach>
			</div>
		</section>
	</c:forEach>	
</body>
</html>