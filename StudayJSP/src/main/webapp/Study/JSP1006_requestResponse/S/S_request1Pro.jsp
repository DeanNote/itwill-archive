<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>requestPro1.jsp 요청 파라미터 처리</h1>
	
	<%
	request.setCharacterEncoding("UTF-8");
	
	String strName = request.getParameter("name");
// 	out.print("이름 : " + strName + "<br>");

	String strAge = request.getParameter("age");
// 	out.print("나이 : " + strAge + "<br>");
	
	String strGender = request.getParameter("gender");
// 	out.print("성별 : " + strGender + "<br>");

	String[] arrHobbys = request.getParameterValues("hobby");
// 	for(int i=0; i<arrHobbys.length; i++);
// 	Arrays.toString(arrHobbys);
	%>
	<table border = "1">
		<tr>
			<td>이름</td>
			<td><%=strName%></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><%=strAge%></td>
		</tr>
		<tr>
			<td>성별</td>
			<td><%=strGender%></td>
		</tr>
		<tr>
			<td>취미</td>
			<td>
<%-- 				<%=Arrays.toString(arrHobbys)%> --%>
<%-- 				<%=arrHobbys[0]%><%=arrHobbys[1]%><%=arrHobbys[2]%> --%>
					<%
// 					for(int i = 0; i<arrHobbys.length; i++){
// 						out.print(arrHobbys[i]);						
// 					}
// 					for(String hobby:arrHobbys){
// 						out.print(hobby+" ");						
// 					}
					if(arrHobbys!=null){
						for(String hobby:arrHobbys){
							out.print(hobby+" ");						
							}
					}else{
// 						out.print("선택안함");
						//"취미 선택 필수!"출력 후 이전페이지로 돌아가기
					%> 
						
						<script>
							alert("취미 선택 필수!");
							history.back();
						</script>
					<%}%>
					
			</td>
		</tr>
	</table>
</body>
</html>