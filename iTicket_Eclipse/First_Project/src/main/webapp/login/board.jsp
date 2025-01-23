<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath }/inc/board.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h1>XXX님 반갑습니다</h1><%--XXX <-회원가입후 로그인된 이름 또는 아이디 출력(db데이터 가지고오기  --%>
	<hr>
	
<!-- --------- 사이드메뉴창 ---------- -->
	<div class="menu">
			<h3 align="center">마이페이지</h3>
		<section>
			<label><b>결제내역</b></label>
				<div class="menu_1">
					<a href="">나의 예매내역</a><br>
					<a href="">구매/선물내역</a><br>
					<a href="">상품 취소내역</a>
				</div>
		</section>
		
		<section>
			<label><b>나의 게시글</b></label>
				<div class="menu_1">
					<a href="">내가 작성한 글</a><br>
					<a href="" >1:1 문의</a><br>
					<a href="">나의 문의 내역</a>
				</div>
		</section>
		
		<section>
			<label><b>나의 정보</b></label>
				<div class="menu_1">
					<a href="">회원 정보 수정</a>
				</div>
		</section>
		
		<section>
			<label><b>쿠폰 및 포인트</b></label>
				<div class="menu_1">
					<a href="">나의 포인트</a>

				</div>
		</section>
	</div>
<!-- 사이드메뉴창 끝 -->

<!-- 바디부분 상단 -->
	<div class=container>
		<h2 align="left">나의 게시글</h2>
		<div class="container_list">
			<table>
				<tr>
					<td><input type="checkbox"></td><td>No.</td>
					<td>제목</td>
					<td>등록일</td>
					<td>작성자</td>
					<td>조회수</td>
				</tr>
				<tr>
					<td><input type="checkbox"></td><td>[게시글 최신순 번호]</td><%--db에서 자료가져오기 --%>
					<td>제목</td>
					<td>등록일</td>
					<td>작성자</td>
					<td>조회수</td>
				</tr>
				
				<tr>
					<td><input type="checkbox"></td><td>[게시글 최신순 번호]</td><%--db에서 자료가져오기 --%>
					<td>제목</td>
					<td>등록일</td>
					<td>작성자</td>
					<td>조회수</td>
				</tr>
			</table>
		</div>
			<button type="submit" class="" id="cancle">선택항목 삭제</button>
	</div>
	
	<div class=container>
		<h2 align="left">1:1문의</h2>
		<div class="container_list">
			<table>
				<tr>
					<td><input type="checkbox"></td><td>No.</td>
					<td>제목</td>
					<td>등록일</td>
					<td>작성자</td>
					<td>조회수</td>
				</tr>
				<tr>
					<td><input type="checkbox"></td><td>[게시글 최신순 번호]</td><%--db에서 자료가져오기 --%>
					<td>제목</td>
					<td>등록일</td>
					<td>작성자</td>
					<td>조회수</td>
				</tr>
				<tr>
					<td><input type="checkbox"></td><td>[게시글 최신순 번호]</td><%--db에서 자료가져오기 --%>
					<td>제목</td>
					<td>등록일</td>
					<td>작성자</td>
					<td>조회수</td>
				</tr>
			</table>
		</div>
			<button type="submit" class="" id="cancle">선택항목 삭제</button>
	</div>
	
	<div class=container>
		<h2 align="left">나의 문의내역</h2>
		<div class="container_list">
			<table>
				<tr>
					<td><input type="checkbox"></td><td>No.</td>
					<td>제목</td>
					<td>등록일</td>
					<td>작성자</td>
					<td>조회수</td>
				</tr>
				<tr>
					<td><input type="checkbox"></td><td>[게시글 최신순 번호]</td><%--db에서 자료가져오기 --%>
					<td>제목</td>
					<td>등록일</td>
					<td>작성자</td>
					<td>조회수</td>
				</tr>
				<tr>
					<td><input type="checkbox"></td><td>[게시글 최신순 번호]</td><%--db에서 자료가져오기 --%>
					<td>제목</td>
					<td>등록일</td>
					<td>작성자</td>
					<td>조회수</td>
				</tr>
			</table>
		</div>
			<button type="submit" class="" id="cancle">선택항목 삭제</button>
	</div>	
<!-- 바디부분 상단 끝 -->

</body>
</html>