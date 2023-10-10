<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>request2Pro.jsp - 로그인 처리</h1>
	<% 
	String id = request.getParameter("id"); 
	out.print("ID : " + id +"<br>");
	String pw = request.getParameter("passwd");
	out.print("PW : " + pw +"<br>");
	String rememberLogin = request.getParameter("rememberLogin");
	out.print("로그인저장 : " + rememberLogin +"<br>");
	%>
	
	<%
	String dbId = "admin";
	String dbPw = "1234";
	
	if(id.equals(dbId) && pw.equals(dbPw)){
		out.print("<h1>로그인성공</h1>");
	}else{
// 			if(!id.equals(dbId)){
// 			out.print("<h3>아이디 오류!</h3>");
// 			}else if(!pw.equals(dbPw)){
// 			out.print("<h3>비밀번호 오류!</h3>");
// 			}
		out.print("<h2>로그인실패</h2>");%>
		<script>
		alert("로그인실패!");
		history.back();
		</script>
	<%}%>
</body>
</html>