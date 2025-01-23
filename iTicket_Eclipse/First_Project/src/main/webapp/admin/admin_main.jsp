<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객센터</title>
<!-- 외부 CSS 파일(css/default.css) 연결하기 -->
<link href="cs.css" rel="stylesheet" type="text/css">
<style>

.menu1{}

.menubar>ol>li{text-align: center;
border: 1px solid;
display: inline-block;
width: 200px; height: 100px;
margin: 15px;
line-height: 100px;
}



.mububar4>ol>li{
width:200px; height: 50px;
border: 1px solid;
text-align: center;
display: inline-block;
margin: 15px;
}


</style>
</head>
<body>
	<div id="wrapper">
		<h1>ADMIN MAIN </h1>
		<nav> <!-- 사이드바 -->
			<jsp:include page="admin_menubar.jsp"></jsp:include>
		</nav>
		<main>
		<form action="" method="" name="" class="menu1">
			<section class="mainpage">
				<strong>아이유시네마 관리자 페이지</strong>
			</section>
			
			<div class="menubar">
			<ol>
				<li id = "menu1"><a href="#">TODAY 예매</a></li>
				<li id = "menu2"><a href="#">TODAY 상영 영화</a></li>
				<li id = "menu3"><a href="#">스토어 주문</a></li>
				<li id = "menu4"><a href="#">회원수</a></li>
			</ol>
			</div>
			<section id="menubar2">
				<strong>■ 회원정보</strong>
			</section>
			<section class="menubar3">
				<input type="search" placeholder="회원정보를 입력하세요"> <!-- 검색어 입력창 -->
				<input type="button" value="검색">
				<input type="button" value="전체보기">
			</section>
			<section>
				<table id="cs_table" border="1">
					<colgroup>
						<col style="width: 100px;">
						<col style="width: 500px;">
						<col style="width: 10px;">
						<col style="width: 500px;">
						<col style="width: 100px;">
						<col style="width: 500px;">
						<col style="width: 300px;">
						<col style="width: 80px;">
						<col style="width: 300px;">
					</colgroup>
					<tr>
						<td id="table1">아이디</td>
						<td id="table1">이름</td>
						<td id="table1">이메일</td>
						<td id="table1">휴대폰번호</td>
						<td id="table1">포인트</td>
						<td id="table1">선호지점</td>
						<td id="table1">선호장르</td>
						<td id="table1">가입일자</td>
						<td id="table1">회원상태</td>
					</tr>
					<tr>
						<td id="table3">iuzzang</td>
						<td id="table3">아이유</td>
						<td id="table3">iuzzang@gamil.com</td>
						<td id="table3">010-2222-3333</td>
						<td id="table3">500,000</td>
						<td id="table3">부산서면점</td>
						<td id="table3">로맨스</td>
						<td id="table3">2023.11.16</td>
						<td id="table3">활동</td>
					</tr>
					<tr>
						<td id="table3">iuzzang</td>
						<td id="table3">아이유</td>
						<td id="table3">iuzzang@gamil.com</td>
						<td id="table3">010-2222-3333</td>
						<td id="table3">500,000</td>
						<td id="table3">부산서면점</td>
						<td id="table3">로맨스</td>
						<td id="table3">2023.11.16</td>
						<td id="table3">활동</td>
					</tr>
					<tr>
						<td id="table3">iuzzang</td>
						<td id="table3">아이유</td>
						<td id="table3">iuzzang@gamil.com</td>
						<td id="table3">010-2222-3333</td>
						<td id="table3">500,000</td>
						<td id="table3">부산서면점</td>
						<td id="table3">로맨스</td>
						<td id="table3">2023.11.16</td>
						<td id="table3">활동</td>
					</tr>
					<tr>
						<td id="table3">iuzzang</td>
						<td id="table3">아이유</td>
						<td id="table3">iuzzang@gamil.com</td>
						<td id="table3">010-2222-3333</td>
						<td id="table3">500,000</td>
						<td id="table3">부산서면점</td>
						<td id="table3">로맨스</td>
						<td id="table3">2023.11.16</td>
						<td id="table3">활동</td>
					</tr>
					<tr>
						<td id="table3">iuzzang</td>
						<td id="table3">아이유</td>
						<td id="table3">iuzzang@gamil.com</td>
						<td id="table3">010-2222-3333</td>
						<td id="table3">500,000</td>
						<td id="table3">부산서면점</td>
						<td id="table3">로맨스</td>
						<td id="table3">2023.11.16</td>
						<td id="table3">활동</td>
					</tr>
					<tr>
						<td id="table3">iuzzang</td>
						<td id="table3">아이유</td>
						<td id="table3">iuzzang@gamil.com</td>
						<td id="table3">010-2222-3333</td>
						<td id="table3">500,000</td>
						<td id="table3">부산서면점</td>
						<td id="table3">로맨스</td>
						<td id="table3">2023.11.16</td>
						<td id="table3">활동</td>
					</tr>
					<tr>
						<td id="table3">iuzzang</td>
						<td id="table3">아이유</td>
						<td id="table3">iuzzang@gamil.com</td>
						<td id="table3">010-2222-3333</td>
						<td id="table3">500,000</td>
						<td id="table3">부산서면점</td>
						<td id="table3">로맨스</td>
						<td id="table3">2023.11.16</td>
						<td id="table3">활동</td>
					</tr>
				</table>
			</section>
			<section>
				<table id="pageNum" border="1px solid;">
					<tr>
						<th height="30" width="30" id = "pageNum0"><a href="#"><</a></th>
						<th height="30" width="30" id = "pageNum1"><a href="#">1</a></th>
						<th height="30" width="30" id = "pageNum2"><a href="#">2</a></th>
						<th height="30" width="30" id = "pageNum3"><a href="#">3</a></th>
						<th height="30" width="30" id = "pageNum4"><a href="#">4</a></th>
						<th height="30" width="30" id = "pageNum5"><a href="#">5</a></th>
						<th height="30" width="30" id = "pageNum6"><a href="#">></a></th>
					</tr>
				</table>
			</section>
		</form>
		</main>
	</div>
</body>
</html>