<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String passwd2 = request.getParameter("passwd2");
// 	String jumin1 = request.getParameter("jumin1");
// 	String jumin2 = request.getParameter("jumin2");
//  하나로 결합
	String jumin = request.getParameter("jumin1") + "-" + request.getParameter("jumin2");

	String postCode = request.getParameter("postCode");
	String address1 = request.getParameter("address1");
	String address2 = request.getParameter("address2");
	String email = request.getParameter("email1") + "@" + request.getParameter("email2");
	String job = request.getParameter("job");
	String gender = request.getParameter("gender");
	String[] arrHobbys = request.getParameterValues("hobby");
	String motivation = request.getParameter("motivation");
	
	%>
	<table border="1">
		<tr>
			<td>이름</td>
			<td><%=name %></td>
		<tr>
		<tr>
			<td>아이디</td>
			<td><%=id %></td>
		<tr>
		<tr>
			<td>비밀번호</td>
			<td><%=passwd%></td>
		<tr>
		<tr>
			<td>비밀번호확인</td>
			<td><%=passwd2%></td>
		<tr>
		<tr>
			<td>주민번호</td>
			<td><%=jumin%></td>
		<tr>
		<tr>
			<td>주소</td>
			<td>우편번호 : <%=postCode%><br>기본주소 : <%=address1%><br>상세주소 : <%=address2%><br></td>
		<tr>
		<tr>
			<td>E-Mail</td>
			<td><%=email%></td>
		<tr>
		<tr>
			<td>직업</td>
			<td><%=job%></td>
		<tr>
		<tr>
			<td>성별</td>
			<td><%=gender%></td>
		<tr>
		<tr>
			<td>취미</td>
			<td><%
					for(String hobby:arrHobbys){
						out.print(hobby+" ");						
						}
			%></td>
		<tr>
		<tr>
			<td>가입동기</td>
			<td><%=motivation%></td>
		<tr>
				
	</table>	
</body>
</html>