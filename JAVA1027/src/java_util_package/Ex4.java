package java_util_package;

import java.util.Calendar;
import java.util.Date;

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
		
//		Calendar cal = new Calendar();
		// => Cannot instantiate the type Calendar
		// => 추상클래스 이므로 인스턴스 생성 불가!
		Calendar cal = Calendar.getInstance();
		// 현재 시스템 날짜 및 시각 정보 리턴
		
		// toString()메서드가 오버라이딩 되어 있으나 식별이 어려움
//		System.out.println(cal);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.print(year + "년");
		System.out.print((month+1) + "월");
		System.out.println(day + "일");
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);//24시간제(HOUR : 12시간제)
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.println(hour + ":" + min + ":" + sec);
		
		System.out.println("----------------------------------------");
		
		/*
		 Calendar <-> Date 상호 변환
		1. Calendar -> Date로 변환 시
		*/
		Date date = cal.getTime();
		System.out.println(date);
		
		//2. Date -> Calendar로 변환 시 
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date);
		System.out.println(cal2.getTime());
		
		System.out.println("==========================");
		
		// set() 메서드를 사용하여 날짜 및 시각 정보 설정
		cal2.set(1999, 11, 31);// 연, 월, 일 직접 전달
		System.out.println(cal2.getTime());
		
		cal2.set(Calendar.YEAR, 2010);
		cal2.set(Calendar.MONTH, 5);
		
		Date date2 = cal2.getTime();
		System.out.println(date2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
