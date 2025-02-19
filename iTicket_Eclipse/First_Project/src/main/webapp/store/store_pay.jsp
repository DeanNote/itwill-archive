<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스토어 결제 페이지</title>
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
		
		<section id="content">
			<!-- 상단 진행도 상태창 -->
			<!-- 이미지 넣고 싶음 -->
			<div class="store_progress">
				<div> <span class="step">STEP 01</span> <br> 장바구니 </div>
				<div> <span class="bracket"> > </span>  </div>
				<div id="progress_red"><span class="step"> STEP 02 </span> <br> 결제하기 </div>
				<div> <span class="bracket"> > </span> </div>
				<div> <span class="step"> STEP 03</span> <br> 결제완료 </div>
			</div>
			
			<!-- 구매 상품 정보 테이블 -->		
			<div class="store_pay">
				<div class="store_pay_box">
					<div class="store_subject">구매상품 정보</div>
					<table class="store_pay_table">
						<tr class="store_table_box01">
							<!-- 이미지와 상품정보 두칸 합치기 위해 상품명 colspan2 사용 -->
							<th colspan="2" class="store_table_box_td">상품명</th>
							<th>판매금액</th>
							<th>수량</th>
							<th>구매금액</th>
						</tr>
						<tr class="store_table_box02">
							<td><img src="../img/스위트콤보.png" alt="스위트콤보" width="200" height="250"></td>
							<td><span>스위트 콤보</span> <br> 
								<span>오리지날L + 탄산음료M2</span></td>
							<td>10,000원</td>
							<td>1개</td>
							<td>10,000원</td>
						</tr>
					</table>
					<br>
					<div class="store_subject">결제금액</div>
					<table class="store_pay_table">
						<tr class="store_table_box03">
							<th>총 상품 금액</th>
							<th></th>
							<th>할인금액</th>
							<th></th>
							<th>총 결제 예정금액</th>
						</tr>
						<!-- -, = 꾸미는법 아시는분? -->
						<tr class="store_table_box04">
							<td> 10,000원 </td>
							<td><img src="../img/-.png" width="35px" height="35px"></img> </td>
							<td> 0원 </td>
							<td><img src="../img/=.png" width="35px" height="35px"></img></td>
							<td class="table_box_red"> 10,000원</td>
						</tr>
					</table>
				</div>
				<br>
				<div class="">
					<div class="store_subject">주문자 정보확인</div>
					<div class="store_member_info">	
						<!-- 이름과 휴대전화 번호는 자동 저장 -->
						<section>
							<span><b>이름</b> <input type="text"></span>
							<span><b>휴대전화 번호</b> <input type="text"></span>
						</section>
					</div>
					<div class="store_member_info_ex">* 구매하신 기프티콘은 주문자 정보에 입력된 휴대전화 번호로
					MMS로 발송 됩니다. <br> &nbsp; 입력된 휴대전화 번호가 맞는지 꼭 확인하세요</div>
				</div>
				
				<div class="store_payment">
					<div class="store_subject">결제 수단</div>
					<div class="store_payment_line">
						<section>
							<span><input type="radio" value="신용카드" ><b>신용카드</b></span>
							<span><input type="radio" value="kakaoPay">kakao<b>Pay</b></span>
						</section>
					</div>	
				</div>
			
				<div class="store_pay_info">
					<div><input type="checkbox">주문정보/결제 대행 서비스 약관 모두 동의</div>
					<div class="store_pay_info_group">
						<div class="info01"><input type="checkbox">기프트콘 구매 동의
							<br> <span class="info01_01">&nbsp;&nbsp;&nbsp;기프트콘 발송 및 CS 처리 등을 이해 수신자로부터 영화관에 수신자의 전화번호를 제공하는 것에 대한 적합한 동의를 받습니다.</span>
						</div>
						<div class="info02"><input type="checkbox">결제 대행 서비스 약관 모두 동의 <br>
							<div>&nbsp;&nbsp;<input type="checkbox">전자금융거래 이용약관</div>
							<div>&nbsp;&nbsp;<input type="checkbox">개인정보 수집 이용약관</div>
							<div>&nbsp;&nbsp;<input type="checkbox">개인정보 제공 및 위탁안내</div>
						</div>
					</div>
				</div>
			</div>
			<div class="paybtn">
				<a href="store_main.jsp"><input type="button" value="이전화면"></a>
				<a href="" ><input type="button" value="결제하기"></a>
			</div>
		</section>
		<footer>
			<jsp:include page="../inc/bottom.jsp"></jsp:include>
		</footer>
	</div>
</body>
</html>