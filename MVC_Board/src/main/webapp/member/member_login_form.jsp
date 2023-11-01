<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/default.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
		<jsp:include page="../inc/top.jsp"></jsp:include>
	</header>
	<article>
		<h1>로그인</h1>
			<form action="MemberLoginPro.me" method="post">
				<table>
					<tr>
						<td>
							<input type="text" placeholder="아이디" name="id" required><br>
						</td>
					</tr>
					<tr>
						<td>
							<input type="password" placeholder="패스워드" name="passwd" required><br>
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox" name="rememberLogin">로그인 상태 유지<br>
						</td>
					</tr>
					<tr>
						<td class = "td_center">
							<input type="submit" value="로그인">
						</td>
					</tr>
				</table>
			</form>
	</article>
</body>
</html>