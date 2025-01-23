<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath }/login/login.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="wrapper">

	<header>
		<jsp:include page="/inc/top.jsp"></jsp:include>
	</header>
	
	<h1>XXX님 반갑습니다</h1><%--XXX <-회원가입후 로그인된 이름 또는 아이디 출력(db데이터 가지고오기  --%>
	<hr>
		
<!-- --------- 사이드메뉴 ---------- -->

	<div id="my_menu">	
		<p><a href="login_main.jsp">마이페이지</a></p> <!-- 고객센터 홈으로 이동 -->
		<ul>
			<li><a href="">나의 예매내역</a></li>
			<li><a href="">구매/선물내역</a></li>
			<li><a href="">상품 취소내역</a></li>
		
			<li><a href="">나의 문의 내역</a></li>
			<li><a href="">회원정보수정</a></li>
		</ul>
	</div>

<!-- 사이드메뉴 끝 -->

<!-- 바디부분 상단 -->	
	
<!-- 		<nav> 사이드 메뉴바 -->
<%-- 			<jsp:include page="cs_menubar.jsp"></jsp:include> --%>
<!-- 		</nav> -->
		
		<form action="" method="" name="">
			
		<h2>나의예매상태</h2>
			<section>
				<table id="my_table1">
					<tr>
						<th>No.</th>
						<th>영화제목</th>
						<th>상영관</th>
						<th>좌석번호</th>
					</tr>
					<tr>
						<td>[예매순번]</td> <%-- 내용 넣기 --%>
						<td>[영화제목]</td>
						<td>[영화관명]</td>
						<td>[좌석번호]</td>
					</tr>
					<tr>
						<td>[예매순번]</td> <%-- 내용 넣기 --%>
						<td>[영화제목]</td>
						<td>[영화관명]</td>
						<td>[좌석번호]</td>
					</tr>
					<tr>
						<td>[예매순번]</td> <%-- 내용 넣기 --%>
						<td>[영화제목]</td>
						<td>[영화관명]</td>
						<td>[좌석번호]</td>
					</tr>
				</table>
			</section>
			<section id="pageNum">
				<input type="button" value="<">
				<a href="">1</a>
				<a href="">2</a>
				<a href="">3</a>
				<a href="">4</a>
				<a href="">5</a>
				<input type="button" value=">">
			</section>
<!-- 바디부분 상단 끝 -->

<!-- 바디부분 하단 -->
		<h2>환불 안내서</h2>
		<table id="my_table1">
			<tr>
				<td>인터넷 예매시에는 예매매수의 전체환불 및 교환만 가능합니다. 
					인터넷 예매분에 대해 교환환불 및 취소하고자 하실 경우,
					예매하신 내역 전체에 대해 취소 후
					새로 예매를 하시거나 해당 영화관을 방문하셔서 처리하셔야 합니다. 
					
					1) 인터넷상 취소 가능시간 (상영시간 20분전까지만 가능) 
					 - 전체 취소가능하며, 부분 취소 불가
					 EX) 인원수, 관람자, 시간변경은 모두 취소 후 재예매 해주셔야합니다.
					
					2) 현장 취소 가능시간(상영시간 전까지만 가능) 
					  - 전체환불 및 교환가능 단, 부분환불 및 교환은 사용하신 카드로 전체 취소 후 재결제하셔야 합니다.
				</td>
			</tr>
		</table>
		</form>
	</div>
	
	<footer>
		<jsp:include page="/inc/bottom.jsp"></jsp:include>
	</footer>
	
</body>
</html>