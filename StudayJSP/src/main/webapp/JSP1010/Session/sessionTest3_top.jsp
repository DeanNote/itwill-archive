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
		<%if(id==null){%>
			<a href="sessionTest3_loginForm.jsp">로그인</a> |
			<a href="sessionTest3_joinForm.jsp">회원가입</a> | 
		<%}else{%>
			<%=id %>님 |
			<a href="sessionTest3_loginout.jsp">로그아웃</a> 
			<%-- 단, 세션 아이디가 "admin"이면 [관리자페이지]링크 표시--%>
			<%if(id.equals("admin")) {%>
				| <a href="sessionTest3_admin.jsp">관리자 페이지</a> 
			<%}%>
		<%}%>
	</h4>
</div>
