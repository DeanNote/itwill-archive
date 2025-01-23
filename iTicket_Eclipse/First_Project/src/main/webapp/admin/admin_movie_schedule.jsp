<%-- admin_movie_schedule.jsp --%>
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
			<nav>
				<jsp:include page="admin_menubar.jsp"></jsp:include>
			</nav>
			<h1>상영스케쥴 관리페이지</h1>
			<div id="schedule_serch">
				<select id="select">
					<option>A지점</option>
					<option>B지점</option>
					<option>C지점</option>
					<option>D지점</option>
				</select>
				<label id="lbl">상영날짜</label><input type="date">
				<input type="button" value="조회">&nbsp;&nbsp;&nbsp;&nbsp;
				<label id="lbl">현재시간(분)</label><input type="text">
			</div>
			<section>
			<br><br>
				<table border="1" width="1500" height="500" id="tblCtr">
					<tr>
						<th width="100">상영관명</th>
						<th>1회차</th>
						<th>2회차</th>
						<th>3회차</th>
						<th>4회차</th>
						<td></td>
					</tr>
					<tr>
						<td>
							A관<br>
							<select>
								<option>영화1</option>
								<option>영화2</option>
								<option>영화3</option>
								<option>영화4</option>
							</select>
						</td>
						<td>
							상영번호 : <br>
							690<br>
							상영기간 : <br>
							2023.11.22 ~ 2023.11.25<br><br>
							상영시간 : <br>
							18:22:00 ~ 00:00:00<br><br>
							러닝타임 : <br>
							180분<br><br>
							영화명 : <br>
							A영화
						</td>
						<td>
							상영번호 : <br>
							690<br>
							상영기간 : <br>
							2023.11.22 ~ 2023.11.25<br><br>
							상영시간 : <br>
							18:22:00 ~ 00:00:00<br><br>
							러닝타임 : <br>
							180분<br><br>
							영화명 : <br>
							A영화
						</td>
						<td>
							상영번호 : <br>
							690<br>
							상영기간 : <br>
							2023.11.22 ~ 2023.11.25<br><br>
							상영시간 : <br>
							18:22:00 ~ 00:00:00<br><br>
							러닝타임 : <br>
							180분<br><br>
							영화명 : <br>
							A영화
						</td>
						<td>
							상영번호 : <br>
							690<br>
							상영기간 : <br>
							2023.11.22 ~ 2023.11.25<br><br>
							상영시간 : <br>
							18:22:00 ~ 00:00:00<br><br>
							러닝타임 : <br>
							180분<br><br>
							영화명 : <br>
							A영화
						</td>
						<td>
							<input type="button" value="등록"><br><br><br>
							<input type="button" value="수정"><br><br><br>
							<input type="button" value="삭제" onclick="confirm('삭제하시겠습니까?')">
						</td>
					</tr>
					<tr>
						<td>
							A관<br>
							<select>
								<option>영화1</option>
								<option>영화2</option>
								<option>영화3</option>
								<option>영화4</option>
							</select>
						</td>
						<td>
							상영정보 없음
						</td>
						<td>
							미등록<br>
							상영번호 : <br>
							690<br>
							상영기간 : <br>
							2023.11.22 ~ 2023.11.25<br><br>
							상영시간 : <br>
							18:22:00 ~ 00:00:00<br><br>
							러닝타임 : <br>
							180분<br><br>
							영화명 : <br>
							A영화
						</td>
						<td>
							상영정보 없음
						</td>
						<td>
							상영정보 없음
						</td>
						<td>
							<input type="button" value="등록"><br><br><br>
							<input type="button" value="수정"><br><br><br>
							<input type="button" value="삭제" onclick="confirm('삭제하시겠습니까?')">
						</td>
					</tr>
				</table>
			</section>
			<br>
		</div>
	</form>
</body>
</html>