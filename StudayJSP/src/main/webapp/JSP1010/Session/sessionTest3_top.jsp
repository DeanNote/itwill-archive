<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//세션 아이디 변수 id에 저장
String id = (String)session.getAttribute("sId");
%>
<div align="right">
	<h4>
		<a href="sessionTest3_main.jsp">HOME</a> |
		<%--
		로그인 성공/실패에 따른 작업 수행(= 서로 다른 하이퍼링크 표시)
		- 세션 아이디(sId 속성값)가 없을 경우
		- 세션 아이디(sId 속성값)가 있을 경우
		--%>
		<%if(session.getAttribute("sId")==null){%>
			<a href="sessionTest3_loginForm.jsp">로그인</a> |
			<a href="sessionTest3_joinForm.jsp">회원가입</a> 
		<%}else{%>
			<%=session.getAttribute("sId") %>님 |
			<a href="sessionTest3_loginout.jsp">로그아웃</a> |
		<%}	%>
	</h4>
</div>
