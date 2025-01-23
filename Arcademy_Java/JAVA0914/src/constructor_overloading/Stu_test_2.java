package constructor_overloading;

public class Stu_test_2 {

	public static void main(String[] args) {

	
	}

}
class MyDate2{
	int year;
	int month;
	int day;
	
	public MyDate2(int year, int month, int day) {
		setYear(year);
		setYear(month);		
		setYear(day);
	}

	public void setYear(int year) {
		if(year<2100 && year>1900) {
			this.year = year;
		}else {
			System.out.println("연도 재입력 필요");
		}
	}

	public void setMonth(int month) {
		if(month<13 && month>0) {
			this.month = month;
		}else {
			System.out.println("월 재입력 필요");
		}

	}

//	public void setDay(int day) {
//		
//		switch (key) {
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//		case 6:
//		case 7:
//		case 8:
//		case 9:
//		case 10:
//		case 11:
//		case 12:
//			
//			break;
//
//		default:
//			break;
//		}
//		this.day = day;
//	}

	
}
	

/*
*날짜를 관리하는 MyDate2 클래스 정의
*- 멤버변수 : 연도year 월month 일day
*- 접근제한자 private설정
*- 파라미터 생성자
*  year month day 전달받아 초기화
*  유효한 년도 월 일 인지 파라미터 값을 전달할 수 있도록 설정
*  
*  생성자 자동 단축키 : Alt + Shift + s -> o
*                                          R
*  
*  hint!
*  1. 멤버변수 private 접근제한자이므로 Getter/Setter 필요
*  2. 파라미터 생성자에 데이터를 전달할 때 멤버변수의 초기화는
*     Setter()메서드 활용!
*  3. Setter()메서드 내에서 조건식을 사용하여 유효한 년월일인지; 판별
*  <조건식 판별>
*  year 경우 1900~2100 사이
*  month 경우 1~ 12
*  day switch문을 사용 1 3 5 7 8 10 12월 (1~31일)
*                      2 6 9 11월 (1~30일)
*                      2월 29일(윤년 적용)
*                      윤년의 경우 : 4로 나눠지는 해는 윤년이지만 그중 100으로 나눠지는 해는 윤년이 아님. 
*                                    그러나 400으로 나눠지는 해는 윤년이다!
*     
*  4. 입력되는 값의 유효성을 판단하는 isVaild()메서드 정의
*  
*/