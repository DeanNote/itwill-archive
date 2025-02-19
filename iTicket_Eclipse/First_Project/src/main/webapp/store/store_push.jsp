<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스토어 상세페이지</title>
<link href="${pageContext.request.contextPath }/css/store.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="wrapper">
		<!-- 상단 고정 메뉴 자리 -->
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
		
		
		<!-- 전체  -->
		<section id="content">
		<!-- 상품정보 -->
			<!-- 상품명 -->
			<div id="item_name"><strong >스위트 콤보</strong></div> 
			
			<!-- 상품 상세정보 box_store_view-->
			<!-- 상품상세 이미지 box_store_view.left.img -->
			<div id="box_store_view">
				<div class="left">
					<div class="img">
						<p><img src="../img/스위트콤보.png" alt="스위트콤보"></p>
					</div>
				</div>
				<!-- left -->
				<!-- 제품 설명 box_store_view.right.goods_info-->
				<div id="right">
					<div class="goods_info">
						<div class="line">
							<p class="title"><span class="store_line">상품구성</span></p>
							<div class="contents">
								<span class="txt">오리지널L + 탄산음료M2</span>
							</div>
						</div>
						<div class="line">
							<p class="title"><span>상품제한</span></p>
							<div class="contents">
								<span class="txt">제한없음 </span>
							</div>
						</div>	
						<div class="line">
							<p class="title"><span>유효기간</span></p>
							<div class="contents">
								<span class="txt">구매일로부터 366일 이내 취소 가능하며, 부분취소는 불가능합니다.</span>
							</div>
						</div>	
					</div>
				
					<!-- 상품/결제 -->
					<div class="pay">
						<div class="receipt">
							<p class="title">수량/금액</p>
							<div class="contents">
								<button type="button" class="btn_minus" title="수량감소">-</button>
								<input type="text" title="수량입력" value="1" min="1" max="99" class="input-text">
								<button type="button" class="btn_minus" title="수량증가">+</button>
								<div class="money">10000원</div>
							</div>
						</div>
					</div>	
					<br>
					<div id="btn_buy">
	                	<a href="store_main.jsp"><button type="button">취소</button></a>
	                	<a><button type="button">구매</button></a>
	               	</div>
				</div>	
				<!-- right -->	
			<!-- box_store_view -->
			<!-- store_view -->
			</div>
			<!-- 사용 방법 및 이용안내 -->
		<div id="store_exap">
			<div id="store_expl01"><strong>사용방법</strong> <br></div>
			<div id="store_expl02">
			- 스토어 상품은 회원만 구매할 수 있습니다.<br>
			- 일반관람권의 경우 2D 일반영화에 사용 가능합니다. (스페셜관 및 특수좌석 사용 불가)<br>
			- 영화관람권은 L.POINT 적립이 불가합니다.<br>
			- 유효기간은 24개월로 관람일 기준입니다.<br>
			- 구매한 영화관람권은 마이시네마 > 나의 쿠폰함에서 확인 후 롯데시네마 홈페이지, 모바일 웹/앱에서 사용 가능합니다.<br>
			- 선물한 영화관람권은 문자쿠폰(MMS)으로 발송되며 롯데시네마 홈페이지, 모바일 웹/앱에서 사용 가능합니다.<br>
			- 선물한 상품은 마이시네마 > 예매/구매내역 > 선물내역 메뉴에서 30일 내 1회 재발송 가능합니다. 단, 받는 사람 번호는 변경 불가합니다.<br>
			- 관람권 구매금액보다 낮은 금액의 티켓 구매 시 구매금액이 아닌 티켓 금액으로 VIP 승급금액이 반영됩니다. (예; 조조, 심야, 문화의 날 등)<br>
			</div>
		</div>
		</section>
		<footer>
			<jsp:include page="../inc/bottom.jsp"></jsp:include>
		</footer>
	</div>
</body>
</html>