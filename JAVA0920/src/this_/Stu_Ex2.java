package this_;

public class Stu_Ex2 {

	public static void main(String[] args) {
		/*
		 * 생성자 this()
		 * - 자신의 생성자 내에서 자신의 또 다른 생성자를 호출
		 * - 래퍼런스 this 사용과 동일하게 자신의 인스턴스에 접근하여
		 *   다른 오버로딩 된 생성자를 호출하는 용도로 사용
		 * - 생성자 오버로딩 시 인스턴스 변수에 대한 초기화 코드가 중복되는데
		 *   초기화 코드 중복을 제거하는 용도로 사용
		 *   => 여러 생성자에서 각각 인스턴스 변수를 중복으로 초기화하지 않고
		 *      하나의 생성자에서만 초기화 코드를 작성 한 뒤
		 *      나머지 생성자에서는 해당 초기화 코드를 갖는 생성자를 호출하여
		 *      초기화 할 값만 전달 후 대신 인스턴스 변수를 초기화
		 *   => 메서드 오버로딩 시 코드의 중복을 제거하기 위해서
		 *   	하나의 메서드에서만 작업을 수행하고 나머지 메서드는 
		 *   	해당 메서드를 호출하여 데이터를 전달하는 것과 동일함
		 *   	(단, 메서드는 메서드 이름() 으로 호출, 생성자 this()로 호출하는 차이)
		 * < 생성자 this() 호출 기본 문법 >
		 * 생성자 내의 첫 번째 라인에서
		 * this([데이터...]);
		 * 
		 */
	}//main끝

}//EX끝

class MyDate{
	int year;
	int month;
	int day;
	//Alt+Shift+S => O 기본 생성자 자동완성
	public MyDate() {
		//연도 : 1900, 월 :1, 일:1 로 초기화
		
		System.out.println("MyDate() 생성자 호출됨!");
		
		year = 1900;
		month = 1;
		day = 1;
	}
	//연도(year)만 전달받고 나머지는 1월 1일로 초기화를 하는 생성자 
	public MyDate(int year) {
		System.out.println("MyDate(int) 생성자 호출됨!");
		this.year = year;
		month = 1;
		day = 1;
		
	}
	//연도(year)와 월(month)을 전달받고 나머지는 1일로 초기화를 하는 생성자
	public MyDate(int year, int month) {
		System.out.println("MyDate(int, int) 생성자 호출됨!");
		this.year = year;
		this.month = month;
		day = 1;
	}
	//연도(year),월(month),일(day)을 전달받아 초기화 하는 생성자
	public MyDate(int year, int month, int day) {
		System.out.println("MyDate(int, int, int) 생성자 호출됨!");
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	
	
	
	
}
