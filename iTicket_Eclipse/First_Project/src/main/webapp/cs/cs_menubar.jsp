<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 외부 CSS 파일(css/default.css) 연결하기 -->
<link href="${pageContext.request.contextPath}/css/cs.css" rel="stylesheet" type="text/css">
</head>
<body>
	<!-- 고객센터 모든 페이지에 삽입될 메뉴바입니다. -->
	<div id="menubar">	
		<p><a href="cs_main.jsp">고객센터</a></p> <!-- 고객센터 홈으로 이동 -->
		<ul>
			<li><a href="cs_main.jsp">고객센터 홈</a></li> <!-- 고객센터 홈으로 이동 -->
			<li><a href="cs_FAQ.jsp">자주 묻는 질문</a></li> <!-- 자주 묻는 질문 페이지로 이동 -->
			<li><a href="cs_notice.jsp">공지사항</a></li> <!-- 공지사항 페이지로 이동 -->
			<li><a href="cs_OneToOne.jsp">1 : 1 문의</a></li> <!-- 1대1 문의 페이지로 이동 -->
			<li><a href="cs_lost.jsp">분실물 문의</a></li> <!-- 분실문 문의 페이지로 이동 -->
		</ul>
	</div>
</body>
</html>