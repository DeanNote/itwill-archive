<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
//스크립틀릿
//인스턴스생성 가능 메서드는 불가능
Calendar c = Calendar.getInstance();
int hour = c.get(Calendar.HOUR_OF_DAY);
int min = c.get(Calendar.MINUTE);
int sec = c.get(Calendar.SECOND); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test3_exam.jsp</h1>
	<%-- 스크립틀릿 내에서 선언된 변수는 표현식으로 출력 가능 --%>
	<h3>현재 시각은 <%=hour %>시 <%=min %>분 <%=sec %>초 입니다.</h3>
	
	<%
	//스크립틀릿 내에서 표현식과 동일한 방식으로 데이터 출력
	
	out.print("<h3>현재 시각은 ");
	out.print(hour+"시 ");
	out.print(min+"분 ");
	out.print(sec+"초 ");
	out.print("입니다.</h3>");
	%>
	
	<!--1번 방법 out.print -->
	<%
	//if문을 사용하여 현재시각(hour) 오전 오후 판별 
	if(hour<12){
		out.print("오전입니다.<br>");
	}else{
		out.print("오후입니다.<br>");
	}
	%>
	
	<%--2번방법 <%= > --%>
	<%
	//if문 블록 사이에 스크립틀릿 열고 닫기
	if(hour<12){
		%><h3>오전입니다!</h3><%  
	}else{
		%><h3>오후입니다!</h3><%  
	}
	%>
	
	<!--2번방법의 변형 -->
	<%if(hour < 12){ %>
		<h3>오전입니다!</h3>
	<%} else { %>
		<h3>오후입니다!</h3>
	<%} %>
	

</body>
</html>