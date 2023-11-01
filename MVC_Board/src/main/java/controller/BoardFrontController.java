package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.bo")
public class BoardFrontController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("BoardFrontController");
		String command = request.getServletPath();
		System.out.println("command : " +command);
		if(command.equals("/BoardWriteForm.bo")) {
//			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp14_servlet2/board_write_form.jsp");
//			dispatcher.forward(request, response);
			System.out.println("글 쓰기!");
		} else if(command.equals("/BoardList.bo")) {
//			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp14_servlet2/board_list.jsp");
//			dispatcher.forward(request, response);
			System.out.println("글 목록!");
		}

}
}
