<%@page import="jsp11_jdbc_dao.StudentDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<main>
		<div align="center">
			<h1>학생 목록 조회</h1>
			<table border="1">
				<tr>
					<th>번호</th>
					<th>이름</th>
				</tr>
				<%
				//request 객체에 저장된 학생 목록 객체(List<StudentDTO> 타입) 꺼내서 변수에 저장
				// => request 객체의 getAttribute() 메서드 활용(속성명 "studentList")
				// => 리턴타입이 Object 타입이므로 다시 List<StudentDTO> 타입으로 다운캐스팅
				List<StudentDTO> studentList = (List<StudentDTO>)request.getAttribute("studentList");
				
				//일반 for문 사용하여 List 객체 반복
				for(int i = 0; i<studentList.size(); i++){
					StudentDTO student = studentList.get(i);
				}
							
				%>
			</table>
		</div>
	</main>
</body>
</html>











