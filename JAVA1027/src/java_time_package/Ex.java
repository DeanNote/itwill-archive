package java_time_package;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Ex {

	public static void main(String[] args) {
		/*
		 java.time 패키지
		 - 날짜 및 시각 정보를 관리하는 기능의 패키지 JDK 8 부터 제공됨
		 - LocalDate 클래스 : 날짜 관련 기능 제공
		   LocalTime 클래스 : 시각 관련 기능 제공
		   
		*/
		
		LocalDate date = LocalDate.now(); // 시스템의 날짜 정보 리턴 받음
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		System.out.println("----------------------------------------");
		
		//of()메서드를 사용하여 정보 설정하기
		LocalDate date2 = LocalDate.of(2000, 1, 1);
		System.out.println(date2);
		
		LocalTime time2 = LocalTime.of(17, 40, 1);
		System.out.println(time2);
		
		//LocalDateTime 클래스의 of()메서드는 각각의 정보를 따로 설정도 가능하며,
		//LocalDate, LocalTime 객체로도 설정이 가능함
		LocalDateTime dateTime2 = LocalDateTime.of(date2, time2);
		System.out.println(dateTime2);
		
		System.out.println("----------------------------------------");

		//getXXX() 메서드를 통해 항목별 정보 가져오기
		int year = date.getYear();
		int month = date.getMonthValue();
		int day = date.getDayOfMonth();
		
		System.out.print(year + "/");
		System.out.print(month + "/");
		System.out.println(day);
		
		// Month 타입 객체 활용
		// => enum 타입 객체인 Month 타입으로 관리됨(각 월의 이름이 상수로 제공)
		Month enumMonth = date.getMonth();
		System.out.println(enumMonth); // toString() 생략됨
		String monthName = enumMonth.toString();// 변수 저장 시 String 변환 필수!
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
