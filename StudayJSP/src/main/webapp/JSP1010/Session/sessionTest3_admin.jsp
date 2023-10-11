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
//관리자페이지는 보안상의 이유로 관리자 외에는 접근이 불가능해야한다!
//반드시, 세션 아이디 체크 또는 별도의 비밀번호 확인 기능을 추가해야함
//---------------------------------------------------------------------
//세션아이디가 admin이 아닐경우 
//"접근 권한이 없습니다" 출력 후에 이전 페이지로 돌아가기
//단, admin 판별 전에 null값 판별이 우선적으로 수행되어야 함
String id = (String)session.getAttribute("sId");
if(id==null || !id.equals("admin")){
	%>
	<script type="text/javascript">
		alert("접근 권한이 없습니다!");
		history.back();
	</script>
	<%	
}
%>
<header>
		<%-- sessionTest3_top.jsp 페이지를 현재 위치에 포함시키기 --%>
		<%-- pageContext 객체의 include() 메서드 호출 --%>
		<%pageContext.include("sessionTest3_top.jsp"); %>
	</header>
	<hr>
	<main>
		<h1>관리자 페이지</h1>
	</main>
	<hr>
	<footer>
		회사설명......
	</footer>
</body>
</html>