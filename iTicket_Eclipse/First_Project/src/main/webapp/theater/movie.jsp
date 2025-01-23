<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<link href="css.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
<html>
 <head>
 <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
  <title>cgv</title>
 </head>

<style>
.요금표{margin-left: 30em;
text-align: center;}
.일반2{text-align: left;}

.제목{font-weight: bold;
color: brown;}

</style>
<header>
	<jsp:include page="../inc/top.jsp"></jsp:include>
</header>
 <body>

<div style="text-align: center;">
	<img src="img/cgv.jpg" alt="cgv">
</div>

<hr>

<nav class="menu">
 <ul>
  <li><a href="">롯데부산점</a></li>
  <li><a href="">신세계센텀점</a></li>
  <li><a href="">삼정타워점</a></li>
  <li><a href="">서면CGV점</a></li>
 </ul>
</nav>
<hr>

   	<div style="float: left" class ="요금표">
		<table class = "가격표">
		<colgroup>
				<col style="width: 100px;">
				<col style="width: 300px;">
				<col style="width: 80px;">
				<col style="width: 80px;">
		</colgroup>
	</div>
			<div style="float: left">
			<tr>
			<th colspan="4" class="일반2"><b>■ 일반 2D</b></th>
			</tr>
			<tr class="제목">
				<td>요일</td>
				<td>시간대</td>
				<td>일반</td>
				<td>청소년</td>
				</tr>
			<tr>
			<td colspan="4"><hr></td>
			</tr>
			<tr>
				<td rowspan="4">월~목</td>
				<td>모닝(06:00~ )</td>
				<td>10,000</td>
				<td>8,000</td>
			</tr>
			<tr>
				<td>브런치(10:01~ )</td>
				<td>13,000</td>
				<td>10,000</td>
			</tr>
			<tr>
				<td>일반(13:01~ )</td>
				<td>14,000</td>
				<td>11,000</td>
			</tr>
			<tr>
				<td>심야(24:00~ )</td>
				<td>9,000</td>
				<td>9,000</td>
			</tr>
			<tr>
				<td colspan="4"><hr></td>
			</tr>
	</div>
	<div>
    <div style="float: left" class ="요금표">
		<table class = "가격표">
		<colgroup>
			<col style="width: 100px;">
			<col style="width: 300px;">
			<col style="width: 80px;">
			<col style="width: 80px;">
		</colgroup>
			<div style="float: left">
			<tr>
				<td rowspan="4">금~일<br>(공휴일)</td>
				<td>모닝(06:00~)</td>
				<td>11,000</td>
				<td>8,000</td>
			</tr>
			<tr>
				<td>브런치(10:01~ )</td>
				<td>15,000</td>
				<td>12,000</td>
			</tr>
			<tr>
				<td>일반(13:01~ )</td>
				<td>15,000</td>
				<td>9,000</td>
			</tr>
			<tr>
				<td>심야(24:00~ )</td>
				<td>9,000</td>
				<td>9,000</td>
			</tr>
			<tr>
				<td colspan="4"><hr></td>
			</tr>
			
			</table>
		</div>
	
	<section>
		<table class="Notice">
			<colgroup>
			<col style="width: 450px;">
		</colgroup>
		<thead>
			<tr style="line-height: 38px">
				<th scope="col">공지사항 <a href="https://www.daum.net" target = "_Blank">더보기</a></th>
			</tr>
		</thead>
		<td><hr></td>
		<tbody>
			<tr>
			<td><a href="공지사항.jsp" onclick="window.open(this.href, '_blank', 'width=800, height=800,left=700,top=100' ); return false;">&#9917; [GS&POINT] 시스템 정기 정검 안내(3/9)</a></td>
			</tr>
			<tr>
			<td><a href="공지사항.jsp" onclick="window.open(this.href, '_blank', 'width=800, height=800,left=550,top=100' ); return false;">&#9917; 회원등급 조정 및 VIP쿠폰북 관련 안내</a></td>
			</tr>
			<tr>
			<td><a href="공지사항.jsp" onclick="window.open(this.href, '_blank', 'width=800, height=800,left=550,top=100' ); return false;">&#9917; 동백씨네마 시스템 점검 안내(2/21)</a></td>
			</tr>
			<tr>
			<td><a href="공지사항.jsp" onclick="window.open(this.href, '_blank', 'width=800, height=800,left=550,top=100' ); return false;">&#9917; [라이브뷰잉]아이유 콘서트 안내</a></td>
			</tr>
			<tr>
			<td><a href="공지사항.jsp" onclick="window.open(this.href, '_blank', 'width=800, height=800,left=550,top=100' ); return false;">&#9917; SKT 휴대폰본인확인 서비스 일시 중단 발생 안내(2/9)</a></td>
			</tr>
			<td><hr></td>
		</tbody>
	</table>
	</section>
	
	
<section>
	<div>
	<div id="map" style="width:400px;height:300px;"></div>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=b9f6c3bc1e6871394d3b26ee55215784"></script>
		<script>
		var container = document.getElementById('map');
		var options = {
			center: new kakao.maps.LatLng(35.15420102038991, 129.05749932101727),
			level: 3
		};
		var map = new kakao.maps.Map(container, options);
	
		
		// 마커가 표시될 위치입니다 
		var markerPosition  = new kakao.maps.LatLng(35.15420102038991, 129.05749932101727); 

		// 마커를 생성합니다
		var marker = new kakao.maps.Marker({
		    position: markerPosition
		});

		// 마커가 지도 위에 표시되도록 설정합니다
		marker.setMap(map);
		</script>
	</div>
</section>
 
 


<footer>
	<jsp:include page="../inc/bottom.jsp"></jsp:include>
</footer>

</html>