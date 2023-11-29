<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>영화 예매</title>
    <link href="${pageContext.request.contextPath }/css/movie_select.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath }/css/default.css" rel="stylesheet" type="text/css">
    <script type="text/javascript">

    </script>
</head>
<body>
	<header>
		<jsp:include page="/inc/top.jsp"></jsp:include>
	</header>
	<article>
		<form action="seat_select.jsp" method="post">
		<div id = "reserve_parameter">
			<div class="overflow movie"><b>영화</b><br>
				<input type ="button" value="서울의 봄"><br>
				<input type ="button" value="싱글 인 서울"><br>
				<input type ="button" value="괴물"><br>
				<input type ="button" value="명탐정코난 - 흑철의 어영"><br>
				<input type ="button" value="극장판 파워 디지몬 더 비기닝"><br>
				<input type ="button" value="다크나이트"><br>
				<input type ="button" value="3일의 휴가"><br>
				<input type ="button" value="사채소년"><br>
				<input type ="button" value="겨울왕국"><br>
				<input type ="button" value="아이언맨"><br>
				<input type ="button" value="어벤져스"><br>
			</div> 
			<div class="overflow theater"><b>극장</b><br>
				<input type="button" value="CGV 부산 서면점"><br>
				<input type="button" value="CGV 부산 센텀시티점"><br>
				<input type="button" value="CGV 부산 롯데백화점 서면점"><br>
				<input type="button" value="CGV 부산 대연점"><br>
				<input type="button" value="CGV 부산 광복점"><br>
				<input type="button" value="CGV 부산 남포동점"><br>
				<input type="button" value="CGV 부산 아시아드점"><br>
				<input type="button" value="CGV 부산 전포동점"><br>
				<input type="button" value="CGV 부산 수영점"><br>
				<input type="button" value="CGV 부산 금정점"><br>
			</div>
			<div class="overflow date"><b>날짜</b><br>
				2023<br>11<br>
					<input type="button" value="수 29"><br>
					<input type="button" value="목 30"><br>
				2023<br>12<br>
					<c:set var="Day_of_the_week" value="${fn:split('월,화,수,목,금,토,일', ',')}" /><!-- 요일을 결정지을 변수 선언 -->
					<c:set var="startDay" value="4" /> <!--시작하는 요일은 금요일 -->
					<c:forEach var="i" begin="1" end="31"><!-- 1일부터 31일까지 반복 -->
						<c:set var="day" value="${(i + startDay - 1) % 7}" /><!-- 요일 판별하는 변수 -->
						<c:set var="dayOfWeek" value="" />
						<c:set var="dayOfWeek" value="${Day_of_the_week[day]}" />
						<input type="button" value="${dayOfWeek} ${i}"><br>
					</c:forEach>
					
			</div> 
			<div class="overflow time"><b>시간</b><br> 
				1관 11층<br>
				<input type="button" value="10:00">
				<input type="button" value="12:00">
				<input type="button" value="14:00"><br>
				<input type="button" value="16:00">
				<input type="button" value="18:00">
				<input type="button" value="20:00"><br>
				2관 11층<br>
				<input type="button" value="10:00">
				<input type="button" value="12:00">
				<input type="button" value="14:00"><br>
				<input type="button" value="16:00">
				<input type="button" value="18:00">
				<input type="button" value="20:00"><br>
				3관 11층<br>
				<input type="button" value="10:00">
				<input type="button" value="12:00">
				<input type="button" value="14:00"><br>
				<input type="button" value="16:00">
				<input type="button" value="18:00">
				<input type="button" value="20:00"><br>
				4관 11층<br>
				<input type="button" value="10:00">
				<input type="button" value="12:00">
				<input type="button" value="14:00"><br>
				<input type="button" value="16:00">
				<input type="button" value="18:00">
				<input type="button" value="20:00"><br>
			</div>
		</div>
	
	    <!-- 좌석 선택 -->
	    <div class="right">
        	<button type="submit" class="right">좌석 선택</button>
        </div>
        </form>
	</article>
	<footer>
			<jsp:include page="/inc/bottom.jsp"></jsp:include>
	</footer>
</body>
</html>
