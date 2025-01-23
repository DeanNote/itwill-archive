<%-- admin_board_faq_write.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath }/css/admin.css" rel="stylesheet" type="text/css">
</head>
<body>
	<form action="">
		<table border="1" width="700" id="popUpCtr">
			<tr>
				<th width="100">번호</th>
				<td></td>
			</tr>
			<tr>
				<th>유형</th>
				<td></td>
			</tr>
			<tr>
				<th>제목</th>
				<td></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td></td>
			</tr>
			<tr>
				<th>내용</th>
				<td></td>
			</tr>
			<tr>
				<th>사진 첨부</th>
				<td><input type="file"></td>
			</tr>
		</table>
		<br>
		<section id="btnCtr"> 
		<!-- 자바스크립트 사용해 사이즈 조정 후 팝업으로 만들 창이므로 버튼을 미리 가운데 정렬-->
			<input type="submit" value="등록">
			<input type="button" value="돌아가기">
		</section>
	
	</form>
</body>
</html>