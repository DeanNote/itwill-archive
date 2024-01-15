<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 외부 CSS 파일(css/default.css) 연결하기 -->
<!-- <link href="./css/default.css" rel="stylesheet" type="text/css"> -->
<%-- EL 을 활용하여 컨텍스트경로를 얻어와서 절대주소처럼 사용 가능 --%>
<link href="${pageContext.request.contextPath }/resources/css/default.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath }/resources/js/jquery-3.7.1.js"></script>
<script>
// 	$(function() {
// 		$("#test").change(function() {
// 			alert($(this).val());
// 		});
		
// 		$("#test2").change(function() {
// 			$("#test").change();
// 		});
		
// 		$("#test").blur(function() {
// 			console.log("blur");
// 		});
// 	});
	
// 	function func(value) {
// 		alert(value);
// 	}
</script>
</head>
<body>
	<header>
		<!-- 기본메뉴 표시 영역(top.jsp 페이지 삽입) -->
		<%-- 주의! JSP 파일은 WEB-INF/views 디렉토리 내에 위치 --%>
		<jsp:include page="inc/top.jsp"></jsp:include>
	</header>
	<article>
		<!-- 본문 표시 영역 -->
		<h1>MVC 게시판</h1>
		<h3><a href="BoardWriteForm">글쓰기</a></h3>
		<h3><a href="BoardList">글목록</a></h3>
		<select id="test">
			<option value="1" onclick="alert(1)">1</option>
			<option value="2">2</option>
		</select>
		<select id="test2">
			<option value="3">1</option>
			<option value="4">2</option>
		</select>
	</article>
	<footer>
		<!-- 회사소개 표시 영역(bottom.jsp 페이지 삽입) -->
		<jsp:include page="./inc/bottom.jsp"></jsp:include>
	</footer>
</body>
</html>














