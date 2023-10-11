<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 세션을 초기화 하고 메인페이지로 리다이렉트
session.invalidate();
response.sendRedirect("sessionTest3_main.jsp");
%>