<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test2.jsp - JSTL</h1>
	<c:set var="str" value="Hello, World!" />
	<h3>\${str} : ${str}</h3>
	<h3>\${str}값이 비어있는가? : ${empty str}</h3>
<%-- 	<h3>\${str} : <%=str %></h3> 오류발생! c:set 태그로 생성하면 표현식통해 접근 불가--%>
	<%
	String str2 = "Hello, World2!";
	pageContext.setAttribute("str2", str2);
	%>	
	<h3>\${str2} : ${str2}</h3>
	
	<c:set var="str3" value="<%=str2 %>"/>
	<h3>\${str3} : ${str3}</h3>
	
	<hr>
	<c:out value="${str}" />
	<hr>
	<c:remove var="str"/>
	<h3>\${str} remove : ${str}</h3>
	<h3>\${empty str} : ${empty str}</h3>
	


		
</body>
</html>