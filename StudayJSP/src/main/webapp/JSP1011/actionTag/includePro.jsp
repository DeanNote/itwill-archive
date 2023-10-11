<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>includePro.jsp</h1>
<h1>jsp:include 액션태그에 의해 포함되는 페이지입니다.</h1>
<%String paramValue = request.getParameter("paramValue"); %>
<%=paramValue%>