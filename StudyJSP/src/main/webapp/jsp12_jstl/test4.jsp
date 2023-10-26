<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setAttribute("idx", 3);
request.setAttribute("name", "홍길동");

String[] names = {"홍길동", "이순신", "강감찬"};
request.setAttribute("namse", names);

response.sendRedirect("test4_result.jsp");
%>