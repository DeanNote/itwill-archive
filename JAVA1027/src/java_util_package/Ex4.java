package java_util_package;

import java.util.Calendar;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * Calendar 클래스
		 * - 주로 날짜 및 시각을 조작하는 용도의 클래스(표현도 가능)
		 * - 추상클래스이므로 인스턴스 생성 없이 제공되는 인스턴스를
		 *   static 메서드인 getInstance() 메서드로 리턴받아 사용
		 * - get() 메서드로 날짜 및 시각 정보를 조회하고,
		 *   set() 메서드로 날짜 및 시각 정보를 설정(조작)함
		 *   => 파라미터로 날짜 및 시각 모두 설정을 위한 상수 사용
		 *   
		 * 
		 */
		
		Calendar cal = new Calendar();
		// => Cannot instantiate the type Calendar
		// => 추상클래스 이므로 인스턴스 생성 불가!
		
		
	}

}
