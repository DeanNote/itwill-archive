package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 방법 2. @WebServlet 사용
@WebServlet("/myServlet3")
public class TestMyServlet3 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("test3 GET 방식 요청에 대한 doGet() 메서드 호출됨!");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("test3 POST 방식 요청에 대한 dopost() 메서드 호출됨!");
	}
	
}
