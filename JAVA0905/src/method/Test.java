package method;

public class Test {

	public static void main(String[] args) {
		
		// 1. 파라미터도 없고, 리턴값도 없는 메서드 호출 연습
		// "Hello, World!" 문자열을 10번 출력하는 printHello() 메서드 호출
		printHello(); // 파라미터가 없으므로 소괄호 안에 아무것도 전달하지 않음.
		
		System.out.println("-----------------------------------------");
		
		// 구구단 2단 ~ 9단까지 출력하는 gugudan() 메서드 호출
//		gugudan();

	} // main() 메서드 끝

	/* < 메서드 정의 기본 문법 >
	 * [접근제한자] 리턴타입 메서드명([매개변수선언..]) {
	 * 		// 메서드 호출 시 수행할 코드들...
	 * 		// [return [리턴값];]
	 * }
	 */
	
	// 1. 파라미터도 없고, 리턴값도 없는 메서드 정의 연습
	// "Hello, World!" 문자열을 10번 반복 출력하는 printHello() 메서드 정의
	// => 파라미터가 없으므로 선언부 소괄호() 안에 아무것도 명시하지 않음.
	// => 리턴값이 없으므로 리턴타입 void 타입 명시
	public static void printHello() {
		// printHello() 메서드가 호출되면 "Hello, World!" 문자열 10번 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " : Hello, World!");
		}
	} // printHello() 메서드 끝
	
	// ---------------------------------------------------------------------
	// 구구단 2단 ~ 9단까지 출력하는 gugudan() 메서드 정의
	// => 리턴값이 없으므로 리턴타입에 void 타입 명시
	// => 파라미터가 없으므로 메서드 선언부 소괄호() 안에 아무것도 명시하지 않음
	public static void gugudan() {
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("< " + dan + "단 >");
			
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
			}
		}
	}
	
	
	
	
} // Test 클래스 끝








