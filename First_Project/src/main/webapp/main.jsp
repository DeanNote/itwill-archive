<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화관</title>
<%-- 외부 CSS 파일 연결하기 --%>
<link href="css/main.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="wrapper">
		<header>
			<jsp:include page="inc/top.jsp"></jsp:include>
		</header>
		
		<section id="content">
<!-- 			<div id="iframe-container"> -->
<!-- 				<iframe src="https://www.youtube.com/embed/xUDhdCsLkjU?autoplay=1&mute=1&autohide=1" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture;" allowfullscreen></iframe> -->
<!-- 				<button id="exit-btn">X</button> -->
<!-- 			</div> -->
			<div id="Sort">
				<a href=""><input type="button" value="무비차트"></a>
				<a href=""><input type="button" value="상영예정작"></a>
				<a href=""><input type="button" value="관람객순"></a>
			</div>
			<div id="boxoffice">
				<div>
					<img src="img/어벤져스인피니티워.jpeg"><br>
					<input type="button" value="👍 좋아요">
				</div>
				
				<div style="text-align:center">
				  <span class="dot" onclick="currentSlide(1)"></span> 
				  <span class="dot" onclick="currentSlide(2)"></span> 
				  <span class="dot" onclick="currentSlide(3)"></span> 
				</div>
			</div>
			
			<div id="main_page">
				<div id="Sort">
					<ul>
						<li><a href=""><input type="button" value="무비차트"></a></li>
						<li><a href=""><input type="button" value="상영예정작"></a></li>
						<li><a href=""><input type="button" value="관람객순"></a></li>
					</ul>
				</div>
				
				<div id="boxoffice">
					<div>
						<a href=""><img src="img/어벤져스인피니티워.jpeg"></a><br>
						<input type="button" value="👍 좋아요">
					</div>
					<div>
						<a href=""><img src="img/스파이더맨노웨이홈.jpeg"></a><br>
						<input type="button" value="👍 좋아요">
					</div>
					<div>
						<a href=""><img src="img/싱글 인 서울.jpeg"></a><br>
						<input type="button" value="👍 좋아요">
					</div>
					<div>
						<a href=""><img src="img/프레디의 피자가게.jpeg"></a><br>
						<input type="button" value="👍 좋아요">
					</div>
					<div>
						<a href=""><img src="img/어벤져스엔드게임.jpeg"></a><br>
						<input type="button" value="👍 좋아요">
					</div>
				</div>
			
				<div id="main_store">
					<hr>
					<h2>스토어 베스트 상품</h2>
					<img alt="" src="img/짜파게티팝콘패키지.jpg" width="250" height="200">
					<img alt="" src="img/팝콘패키지.jpg" width="250" height="200">
					<img alt="" src="img/맥주패키지.jpg" width="250" height="200">
				</div>
				
				
				 <div class="container">
					 <hr>
			        <h1>진행 중인 이벤트</h1>
			        <div class="event-grid">
			        <c:forEach begin="1" end="4">
			            <div class="event">
			            	<a href="event_detail.jsp" class="event_link">
				            	<div class="event-image">
					                <img src="https://img.megabox.co.kr/SharedImg/event/2023/11/21/GuvlkLZPAUjb8uk2ikaFSmI6C4E6GRtg.jpg" alt="이벤트 썸네일">
					            </div>
					            <div>
					                <p class="event-title">이벤트 제목</p>
					                <p class="event-date">2023. 11. 1 ~ 2023. 11. 30</p>
					            </div>    
			                </a>
			            </div>
		            </c:forEach>
			            <!-- 이벤트 항목을 추가로 작성 -->
			     	 </div>
		     	</div>
			
			
			
			<script>
			let slideIndex = 1;
			showSlides(slideIndex);
			
			function plusSlides(n) {
			  showSlides(slideIndex += n);
			}
			
			function currentSlide(n) {
			  showSlides(slideIndex = n);
			}
			
			function showSlides(n) {
			  let i;
			  let slides = document.getElementsByClassName("mySlides");
			  let dots = document.getElementsByClassName("dot");
			  if (n > slides.length) {slideIndex = 1}    
			  if (n < 1) {slideIndex = slides.length}
			  for (i = 0; i < slides.length; i++) {
			    slides[i].style.display = "none";  
			  }
			  for (i = 0; i < dots.length; i++) {
			    dots[i].className = dots[i].className.replace(" active", "");
			  }
			  slides[slideIndex-1].style.display = "block";  
			  dots[slideIndex-1].className += " active";
			}
			</script>
					
					
		</section>
		
		<footer>
			<jsp:include page="inc/bottom.jsp"></jsp:include>	
		</footer>
	</div>
</body>
</html>