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
<script type="text/javascript">
function authAccount(){
	let requestUri="https://testapi.openbanking.or.kr/oauth/2.0/authorize?response_type=code&client_id=4066d795-aa6e-4720-9383-931d1f60d1a9&redirect_uri=http://localhost:8081/mvc_board/callback&scope=login inquiry transfer&state=12345678901234567890123456789012&auth_type=0";
	var width = 600; // 팝업 창의 가로 크기
    var height = 800; // 팝업 창의 세로 크기
    var left = (window.innerWidth / 2) - (width / 2); // 화면 가로 중앙에 위치
    var top = (window.innerHeight / 2) - (height / 2); // 화면 세로 중앙에 위치

    var options = "width=" + width + ",height=" + height + ",left=" + left + ",top=" + top;

	
	window.open(requestUri, "authWindow", options);
}
</script>
</head>
<body>
	<header>
		<!-- 기본메뉴 표시 영역(top.jsp 페이지 삽입) -->
		<%-- 주의! JSP 파일은 WEB-INF/views 디렉토리 내에 위치 --%>
		<jsp:include page="../inc/top.jsp"></jsp:include>
	</header>
	<article>
		<!-- 본문 표시 영역 -->
		<h1>핀테크 메인</h1>
		<button onclick="authAccount()">계좌인증</button>
	</article>
	<footer>
		<!-- 회사소개 표시 영역(bottom.jsp 페이지 삽입) -->
		<jsp:include page="../inc/bottom.jsp"></jsp:include>
	</footer>
</body>
</html>














