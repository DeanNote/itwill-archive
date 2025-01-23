<%-- admin_board_one_on_one_response.jsp --%>
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
				<th>문의 제목</th>
				<td>문의 제목입니다</td>
			</tr>
			<tr>
				<th>문의 작성자</th>
				<td></td>
			</tr>
			<tr>
				<th>문의 내용</th>
				<td></td>
			</tr>
			<tr>
				<th>사진 첨부</th>
				<td></td>
			</tr>
			<tr>
				<th>답변 제목</th>
				<td></td>
			</tr>
			<tr>
				<th>답변 작성자</th>
				<td></td>
			</tr>
			<tr>
				<th>답변 내용</th>
				<td></td>
			</tr>
		</table>
		<br>
		<section id="btnCtr">
			<!-- 자바스크립트 사용해 사이즈 조정 후 팝업으로 만들 창이므로 버튼을 미리 가운데 정렬-->
			<input type="submit" value="답변 등록">
			<input type="button" value="돌아가기">
		</section>
	</form>
</body>
</html>