<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객센터</title>
<%-- 외부 CSS 파일(css/default.css) 연결하기 --%>
<link href="${pageContext.request.contextPath}/css/cs.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="wrapper">
		<h1>고객센터 홈</h1>
		
		<nav> <%-- 사이드 메뉴바 --%>
			<jsp:include page="cs_menubar.jsp"></jsp:include>
		</nav>
		
		<form action="" method="" name="">
			<section id="search">
				<b>빠른 검색</b>
				<input type="search" placeholder="검색어를 입력해주세요"> <%-- 검색어 입력창 --%>
				<input type="button" value="검색">
			</section>
			
			<section id="main_shortcuts"><%-- 바로가기 --%>
				<a href="">
					<img src="" alt="분실물 이미지"> <br>
					분실물 문의 <br>
				</a>
				<a href="">
					<img src="" alt="1:1 이미지"> <br>
					1 : 1 문의 <br>
				</a>
				<a href="">
					<img src="" alt="FQA 이미지"> <br>
					자주 묻는 질문 <br>
				</a>
			</section>
			
			<hr id="hr_mid">
		
			<section id="main_faq"> <%-- 자주묻는질문 바로가기 --%>
				<h4>자주 묻는 질문 BEST5</h4>
				<a href="">더보기</a>
				<ol>
					<li><a href="">내용</a></li> <%-- 자주묻는질문 상위 5개만 보여주기 --%>
					<li><a href="">내용</a></li>
					<li><a href="">내용</a></li>
					<li><a href="">내용</a></li>
					<li><a href="">내용</a></li>
				</ol>
			</section>
			
			<section id="main_notice"> <%-- 공지사항 바로가기 --%>
				<h4>공지사항</h4>
				<a href="">더보기</a>
				<ol>
					<li><a href="">내용</a></li> <%-- 자주묻는질문 최신 5개만 보여주기 --%>
					<li><a href="">내용</a></li>
					<li><a href="">내용</a></li>
					<li><a href="">내용</a></li>
					<li><a href="">내용</a></li>
				</ol>
			</section>
		</form>
	</div>
</body>
</html>