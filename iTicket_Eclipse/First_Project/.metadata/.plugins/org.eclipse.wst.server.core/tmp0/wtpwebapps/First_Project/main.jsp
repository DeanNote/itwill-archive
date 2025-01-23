<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 예매 사이트</title>
<link href="${pageContext.request.contextPath }/css/default.css" rel="stylesheet" type="text/css">
<script>
function pop(){
	window.open("inc/popup.jsp", "pop", "width=400,height=500,history=no,resizable=no,status=no,scrollbars=yes,menubar=no")
}

$(document).ready(function() {
	$('#exit-btn').click(function(){
		$('.iframe-container').remove();
		// 추가된 부분 시작
		$('iframe').attr('src', '');
		// 추가된 부분 끝
	});
	
	$('#like').on('click', 'input', function() {
		$(this).toggleClass('liked');
	});
});
</script>

</head>
<body onLoad="javascript:pop()">
	<header>
		<jsp:include page="inc/top.jsp"></jsp:include>
	</header>
	<article>
<!-- 		<div class="iframe-container"> -->
<!-- 			<iframe src="https://www.youtube.com/embed/xUDhdCsLkjU?autoplay=1&mute=1&autohide=1" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture;" allowfullscreen></iframe> -->
<!-- 			<button id="exit-btn">X</button> -->
<!-- 		</div> -->
		<div id="Sort">
			<a href=""><b>무비차트</b></a>
			<a href="">상영예정작</a>
			<a href="">관람객순</a>
		</div>
		<div id="boxoffice">
			<img src="img/어벤져스인피니티워.jpeg">
			<img src="img/스파이더맨노웨이홈.jpeg">
			<img src="img/싱글 인 서울.jpeg">
			<img src="img/프레디의 피자가게.jpeg">
			<img src="img/어벤져스엔드게임.jpeg">
		</div>
		
		<div id="like">
			<input type="button" value="👍 좋아요">
			<input type="button" value="👍 좋아요">
			<input type="button" value="👍 좋아요">
			<input type="button" value="👍 좋아요">
			<input type="button" value="👍 좋아요">
		</div>
		
		<!-- 추가 기능 -->
		<div id="advertisement">
			<h3>오늘의 할인 이벤트</h3>
			<p>CGV 멤버십 회원에게 50% 할인 혜택 제공</p>
			<p>자세한 내용은 이벤트 페이지에서 확인하세요!</p>
			<a href="event.jsp">이벤트 페이지 바로가기</a>
		</div>
		
	</article>
	<footer>
		<jsp:include page="inc/bottom.jsp"></jsp:include>	
	</footer>
	<script>
	$(document).ready(function() {
		$('#exit-btn').click(function(){
			alert("예고편 종료!");
			$('.iframe-container').remove();
			$('iframe').attr('src', '');
		});
	});
	</script>
</body>
</html>
