<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
response.sendRedirect("S_responseTest2.jsp");

System.out.println("리다이렉트 완료!");
%>

<script>
	console.log("확인");
	alert("확인");
</script>