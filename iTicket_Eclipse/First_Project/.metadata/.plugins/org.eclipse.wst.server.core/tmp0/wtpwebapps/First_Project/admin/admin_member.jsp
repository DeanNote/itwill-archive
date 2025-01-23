<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#searchArea {
		text-align: right;
	}
	
	#pageList {
		text-align: center;
	}
</style>
</head>
<body>
	<h1>회원 정보 관리 페이지</h1>
	<section id="searchArea">
		<select>
			<option>이름</option>
			<option>아이디</option>
			<option>멤버십</option>
		</select>
		<input type="search" placeholder="Search">
		<input type="button" value="조회">
	</section>
	<br>
	<table border="1" width="1500" height="500">
	<tr>
		<th>이름</th>
		<th>아이디</th>
		<th>멤버십</th>
		<th>회원상태</th>
		<th>계정종류 및 변경</th>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td width="150"><input type="button" value="회원"></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td><input type="button" value="비회원"></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td><input type="button" value="회원"></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td><input type="button" value="비회원"></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td><input type="button" value="회원"></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td><input type="button" value="비회원"></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td><input type="button" value="회원"></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td><input type="button" value="비회원"></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td><input type="button" value="회원"></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td><input type="button" value="비회원"></td>
	</tr>
	</table>
	<section id="pageList">
		<input type="button" value="&lt;">
		<input type="button" value="&gt;">
	</section>
</body>
</html>