<%-- admin_movie_booking.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="admin.css" rel="stylesheet" type="text/css">
</head>

<!-- onclick="window.open('admin_movie_메인페이지.jsp', '_blank', 'width=800, height=800,left=550,top=100' ); return false;" -->
<body>
	<form action="">
		<div id="wrapper">
			<nav>
				<jsp:include page="admin_menubar.jsp"></jsp:include>
			</nav>
			<h1>영화 예매 관리 페이지</h1>
			<table border="1" id="admin_table">
				<tr>
					<th>결제번호</th>
					<th>영화명</th>
					<th>회원ID</th>
					<th>영화관명</th>
					<th>날짜</th>
					<th>좌석</th>
					<th>회원정보</th>
					<th>수정/삭제</th>
				</tr>
				<tr>
					<td>13251245</td>
					<td>A영화</td>
					<td>coming</td>
					<td>영화줄거리란입니다영화줄거리란입니다영화줄거리란입니다</td>
					<td>2023</td>
					<td>01:01</td>
					<td>2023-06-06</td>
					<td><input type="button" value="MORE"></td>
				</tr>
				<tr>
					<td>13251245</td>
					<td>A영화</td>
					<td>coming</td>
					<td>영화줄거리란입니다영화줄거리란입니다영화줄거리란입니다</td>
					<td>2023</td>
					<td>01:01</td>
					<td>2023-06-06</td>
					<td><input type="button" value="MORE"></td>
				</tr>
				<tr>
					<td>13251245</td>
					<td>A영화</td>
					<td>coming</td>
					<td>영화줄거리란입니다영화줄거리란입니다영화줄거리란입니다</td>
					<td>2023</td>
					<td>01:01</td>
					<td>2023-06-06</td>
					<td><input type="button" value="MORE"></td>
				</tr>
				<tr>
					<td>13251245</td>
					<td>A영화</td>
					<td>coming</td>
					<td>영화줄거리란입니다영화줄거리란입니다영화줄거리란입니다</td>
					<td>2023</td>
					<td>01:01</td>
					<td>2023-06-06</td>
					<td><input type="button" value="MORE"></td>
				</tr>
				<tr>
					<td>13251245</td>
					<td>A영화</td>
					<td>coming</td>
					<td>영화줄거리란입니다영화줄거리란입니다영화줄거리란입니다</td>
					<td>2023</td>
					<td>01:01</td>
					<td>2023-06-06</td>
					<td><input type="button" value="MORE"></td>
				</tr>
				<tr>
					<td>13251245</td>
					<td>A영화</td>
					<td>coming</td>
					<td>영화줄거리란입니다영화줄거리란입니다영화줄거리란입니다</td>
					<td>2023</td>
					<td>01:01</td>
					<td>2023-06-06</td>
					<td><input type="button" value="MORE"></td>
				</tr>
				<tr>
					<td>13251245</td>
					<td>A영화</td>
					<td>coming</td>
					<td>영화줄거리란입니다영화줄거리란입니다영화줄거리란입니다</td>
					<td>2023</td>
					<td>01:01</td>
					<td>2023-06-06</td>
					<td><input type="button" value="MORE"></td>
				</tr>
			</table>
			<br>
			<div id="pageBtn">
				<input type="button" value="&lt;" id="page_move">
				<input type="button" value="1">
				<input type="button" value="2">
				<input type="button" value="3">
				<input type="button" value="&gt;" id="page_move">
			</div>
		</div>
	</form>
</body>
</html>
</body>
</html>