<%-- admin_payment_detail.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="admin.css" rel="stylesheet" type="text/css">
</head>
<body>
	<form action="">
		<div id="wrapper">
			<h1>결제 상세 페이지</h1>
			<table border="1" id="popUpCtr">
				<tr>
					<th width="100">결제 번호</th>
					<td></td>
				</tr>
				<tr>
					<th>주문자명</th>
					<td>주문자명입니다</td>
				</tr>
				<tr>
					<th>결제일</th>
					<td></td>
				</tr>
				<tr>
					<th>영화 명</th>
					<td></td>
				</tr>
				<tr>
					<th>극장 명</th>
					<td></td>
				</tr>
				<tr>
					<th>인원 수</th>
					<td></td>
				</tr>
				<tr>
					<th>좌석 번호</th>
					<td></td>
				</tr>
				<tr>
					<th>주문한 상품</th>
					<td></td>
				</tr>
				<tr>
					<th>결제 방법</th>
					<td></td>
				</tr>
				<tr>
					<th>총 결제 금액</th>
					<td></td>
				</tr>
			</table>
			<br>
			<section id="payX">
				<!-- 자바스크립트 사용해 사이즈 조정 후 팝업으로 만들 창이므로 버튼을 미리 가운데 정렬-->
				<input type="button" value="결제취소" onclick="confirm('결제 취소하시겠습니까?')">
				<input type="button" value="뒤로가기" onclick="window.close()">
			</section>
		</div>
	</form>
</body>
</html>