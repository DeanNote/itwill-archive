package method;

public class Stu_test {

	public static void main(String[] args) {
		
		// 1. 파라미터도 없고, 리턴값도 없는 메서드 호출 연습
		// "Hello, World!" 문자열을 10번 출력하는 printHello()메서드 호출
		printHello(); //파라미터가 없으므로 소괄호 안에 아무것도 전달하지 않음.
		System.out.println("----------------------------------------------");
		
		// 2. 구구단 2단 ~ 9단 까지 출력하는 gugudan() 메서드 호출
		gugudan();
		System.out.println("----------------------------------------------");

		// 3. 1~10까지 정수의 합(55)을 계산하여 리턴하는 sum()메서드 호출
		System.out.println("1~10까지 정수의 합 : " + sum());
		
	}// main() 메서드 끝

	 /* <메서드 정의 기본 문법>
	 * [접근제한자] 리턴타입 메서드명([매개변수선언..]){
	 * 	//메서드 호출 시 수행할 코드들...
	 * 	//[return[리턴값];]
	 *  }
	 */ 

	// 1. 파라미터도 없고, 리턴값도 없는 메서드 정의 연습
    //"Hello, World!" 문자열을 10번 출력하는 printHello()메서드 정의
	//=>파라미터가 없으므로 선언부 소괄호()안에 아무것도 명시하지 않음.
	//=>리턴값이 없으므로 리턴타입  void 타입 명시
	
	// 2. 파라미터는 없고, 리턴값만 있는 메서드 정의 연습
	//	  1~10까지 정수의 합(55)을 계산하여 리턴하는 sum()메서드정의
	//	  메서드 파라미터가 없으므로 선언부 소괄호() 안에 아무것도 명시하지 않음
	//  =>리턴값이 있으므로 리턴할 데이터와 일치하는 데이터 타입을
	//	  리턴타입 부분에 명시(정수의 합(정수)을 리턴하므로 int 타입을 명시)
	
	public static int sum() {
		int total = 0;
		for(int i = 1; i<=10; i++) {
			total += i;
		}
		return total;
	}
	
	public static void printHello() {
		//printHello()메서드가 호출되면 "Hello, World!" 문자열 10번 출력
		for(int i = 1; i<=10; i++) {
			System.out.println(i + "Hello, World!");
		}
	}
	
	public static void gugudan() {
		for(int dan = 1; dan<10; dan++) {
			System.out.println(" < " + dan + "단 > ");
			
			for(int i = 1; i<10; i++) {
				System.out.printf("%2d *%2d = %02d\n",dan,i,(dan*i));
			}
		}
	}
	

}// Test클래스 끝
