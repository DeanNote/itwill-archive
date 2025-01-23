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
		
		<div class="img_slide">
			<div class="slideshow-container">
			
				<div class="mySlides fade">
				  <img src="img/img1.jpg" width="900" height="400">
				</div>
				
				<div class="mySlides fade">
				  <img src="img/img2.jpg" width="900" height="400">
				</div>
				
				<div class="mySlides fade">
				  <img src="img/img3.jpg" width="900" height="400">
				</div>
				
				<a class="prev" onclick="plusSlides(-1)">❮</a>
				<a class="next" onclick="plusSlides(1)">❯</a>
			
			</div>
			
			<div style="text-align:center">
			  <span class="dot" onclick="currentSlide(1)"></span> 
			  <span class="dot" onclick="currentSlide(2)"></span> 
			  <span class="dot" onclick="currentSlide(3)"></span> 
			</div>
		</div>
		
		<section id="content">
			
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