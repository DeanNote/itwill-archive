<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link href="${pageContext.request.contextPath }/css/seat_select.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath }/css/default.css" rel="stylesheet" type="text/css">

 	<script>
	    function toggleSeat(seat) {
	        seat.classList.toggle("selected");
	        displaySelectedSeats(); // 좌석 선택 시 선택된 좌석을 출력하는 함수 호출
	    }
	    
	    function displaySelectedSeats() {
	        var selectedSeats = document.getElementsByClassName("selected");
	        var selectedSeatValues = [];
	        
	        for (var i = 0; i < selectedSeats.length; i++) {
	            selectedSeatValues.push(selectedSeats[i].getAttribute("value"));
	        }
	        
	        var selectedSeatsElement = document.getElementById("selected_seats");
	        selectedSeatsElement.textContent = "선택된 좌석: " + selectedSeatValues.join(", ");
	        
	        // 선택된 좌석 값을 숨겨진 input 요소에 할당
	        document.getElementById("select_seat").value = selectedSeatValues.join(",");
	    }
	    function back(){
	    	history.back();
	    	
	    }
 	
 	</script>
</head>
<body>
	<header>
			<jsp:include page="/inc/top.jsp"></jsp:include>
	</header>
	<article>
		<table class="table">
			<tr>
				<td colspan="6">인원 / 좌석</td>
			<tr>	
			<tr>
				<th colspan="3">
					<div class="" onclick="togglePerson(this)" value=""></div>
					
				</th>
				<th colspan="3">CGV서면삼정타워 | 3관 11층 | 남은좌석 100/120<br><b>예매날짜,시각</b></th>
			</tr>
			
			<tr>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>5</td>
				<td>5</td>
			</tr>
			
			
		</table>
		<div class="">
		    <div class="right">
					선택된 데이터<br>
					영화 : ${movie}<br>
					극장 : ${Theater}<br>
					날짜 : ${Date} <br>
					시간 : ${Time} <br>
		    </div>
	    </div>
		<c:set var="x" value="${fn:split(' A,B,C,D,E,F,G,H,I,J,K', ',')}" /><!--행을결정지을 변수 x 선언-->
	    <h1 class="center">Screen</h1>
		<c:forEach var="i" begin="0" end="${fn:length(x)-1}">		<!--행을 반복할 반복문 선언-->
	    	<div class="center">
		 	<c:forEach var="j" begin="1" end="16">
		    	<c:set var="seat_type" value="${x[i]}${j}" />
		    	<div class="seat ${j}" onclick="toggleSeat(this)" value="${seat_type}">${seat_type}</div>
			</c:forEach><!-- 열반복 종료 -->
			</div>
		</c:forEach><!-- 행반복 종료 -->
			<table class="bottom_info">
				<tr>
					<td><input type="button" value="영화선택" onclick="back()"></td>
					<td>영화포스터 위치</td>
					<td>
						선택된 데이터
						영화 : ${movie}
						극장 : ${Theater}
						날짜 : ${Date}
						시간 : ${Time} 
					</td>
					<td>좌석명 좌석번호 | 일반 총금액</td>
					<td>
						<h3 id="selected_seats">선택된 좌석: </h3>
					</td>
					<td>
						<form action="../money.jsp" method="post" onsubmit="setSelectedSeatValue()">
						    <input type="hidden" name="movie" value="${movie}">		    <!-- 선택된 값을 숨겨진 input 요소에 할당 -->
						    <input type="hidden" name="Theater" value="${Theater}">
						    <input type="hidden" name="Date" value="${Date}">
						    <input type="hidden" name="Time" value="${Time}">
						    <input type="hidden" id="select_seat" name="select_seat" value="">			<!--  선택된 좌석 값 전달 -->	    
						    <input type="submit" value="결제하기">
						</form>
					</td>
				</tr>
			</table>
	</article>
	<footer>
			<jsp:include page="/inc/bottom.jsp"></jsp:include>
	</footer>


</body>
</html>








