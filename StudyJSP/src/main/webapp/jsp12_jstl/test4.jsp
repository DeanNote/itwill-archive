<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="jsp11_jdbc_dao.StudentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setAttribute("idx", 3);
request.setAttribute("name", "홍길동");

String[] names = {"홍길동", "이순신", "강감찬"};
request.setAttribute("namse", names);

List<StudentDTO> studentList = new ArrayList<StudentDTO>();
// StudentDTO student = new StudentDTO(1, "홍길동");
// studentList.add(student);
studentList.add(new StudentDTO(1,"홍길동"));
studentList.add(new StudentDTO(2,"이순신"));
studentList.add(new StudentDTO(3,"강감찬"));
request.setAttribute("studentList", studentList);

pageContext.forward("test4_result.jsp");
%>