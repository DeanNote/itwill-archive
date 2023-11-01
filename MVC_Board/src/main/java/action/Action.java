package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;

// XXXAction 클래스에서 수행할 작업에 대한 메서드를 공통형식으로 제공하기 위해 인터페이스 생성
public interface Action {
	// 공통 메서드 execute 정의
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response);
}
