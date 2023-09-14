package constructor_overloading;

public class Stu_test {

	public static void main(String[] args) {
		MyDate md = new MyDate();
		md.whatday();
		System.out.println("================");

		MyDate md2 = new MyDate(2023);
		md.whatday();
		System.out.println("================");
		
		md.year = 2023;
		md.month = 9;
		md.whatday();
		System.out.println("================");
		
		md.year = 2023;
		md.month = 9;
		md.day = 14;
		md.whatday();
		System.out.println("================");
		
		
	}

}

/*
 * 날짜를 관리하는 MyDate 클래스 정의
 * - 멤버변수 : 연도(year, 정수), 월(month, 정수), 일(day, 정수)
 * - 생성자
 *   1) 기본 생성자 : 1999년 1월 1일로 초기화
 *   2) 파라미터 생성자
 *   	2-1)연도(year)를 전달받아 초기화하고, 1월1일로 초기화
 *   	2-2)연도(year)월(month)을 전달받아 초기화하고 1일로 초기화
 *   	2-3)연도(year)월(month)일(day)을 전달받아 초기화
 */
class MyDate{
	int year;
	int month;
	int day;
	public MyDate(){
		year = 1999;
		month = 1;
		day = 1;
	}
	public MyDate(int newYear){
		year = newYear;
		month = 1;
		day = 1;
		System.out.println("MyDate()생성자 호출됨!");
	}
	public MyDate(int newYear, int newMonth){
		year = newYear;
		month = newMonth;
		day = 1;
		System.out.println("MyDate(int)생성자 호출됨!");
	}
	public MyDate(int newYear, int newMonth, int newDay){
		year = newYear;
		month = newMonth;
		day = newDay;
		System.out.println("MyDate(int,int)생성자 호출됨!");
	}
	public void whatday() {
		System.out.printf("%d년 %d월 %d일\n",year,month,day);
	}
}