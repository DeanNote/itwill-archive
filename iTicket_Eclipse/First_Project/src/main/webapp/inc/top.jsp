<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 외부 CSS 파일(css/default.css) 연결하기 -->
<link href="${pageContext.request.contextPath}/css/default.css" rel="stylesheet" type="text/css">
<div id ="top_area">
	<div id="member_area">
		<div id="logo">
			<a href="${pageContext.request.contextPath}/main.jsp"><img src="${pageContext.request.contextPath }/img/logo.png"></a>
		</div>
		<div id="member">
			<a href="${pageContext.request.contextPath}/login/login.jsp"> <input type="button" value="로그인"></a>
			<a href="${pageContext.request.contextPath}/join/join_certification.jsp"><input type="button" value="회원가입"></a>
		</div>
	</div>
	
</div>
