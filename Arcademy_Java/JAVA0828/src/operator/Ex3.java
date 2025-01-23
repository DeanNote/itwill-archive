package operator;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 문자열에 대한 덧셈연산자(+) = 연결(결합) 연산자
		 *  - 어떤 데이터를 문자열과 덧셈연산자로 연산할 경우
		 *    산술연산의 덧셈이 아닌 단순 문자열 결합(연결)으로 사용됨
		 *    이 때, 어떤 데이터를 문자열 타입으로 변환하여 두 문자열을 연결
		 *    ex) "문자열" + "문자열" = "문자열문자열"
		 *        int + "문자열" = "int" + "문자열" = "int문자열"
		 */
		
		int a = 10, b = 20;
		System.out.println(a + b); // 일반 산술연산 (덧셈 기능)
		
		System.out.println("a = " + a); // "문자열" + 정수 = "문자열정수"

		String str = ("a = "+ a) ;
		System.out.println(str);	

		System.out.println("b = "+ b);
	
		int c = (a + b);
		System.out.println(a + " + " + b + " = " + c);
		
		System.out.println("덧셈 결과 : "+ c);
		
		System.out.println("======================================================================");
		
		System.out.println(10+20);
		System.out.println(10+"20");
		System.out.println("10"+20);
	
		System.out.println(10+"20"+30);
		System.out.println("10"+20+30);
	
		System.out.println(10+20+"30");
	
		System.out.println("======================================================================");

		
		String name = "김지수";
		int age = 26;
		
//		int jumin = 031010-3123456;
//		long jumin = 0310103123456;
		String jumin = "031010-3123456";
		
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		System.out.println("주민번호 : "+ jumin);
		
		
		
	}

}





