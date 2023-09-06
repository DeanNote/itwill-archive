package method;

public class Stu_test3 {

	public static void main(String[] args) {
		//5. 파라미터 2개 이상 메서드 호출 연습
		//=> 정수 2개를 전달하면 두 정수의 합을 리턴하는 메서드를 호출하고 리턴값을 출력
		int result = sum(10,20);
//		System.out.println("계산결과는 : " + result); 동일의미
		System.out.println("계산결과는 : " + sum(10,20));
		System.out.println("--------------------------------------------");
		//=> 연산자 문자 1 정수 2개 전달 두 정수에 대한 어떤 연산을 수행 
		//   결과값을 리턴하는 메서드 호출하고 리턴되는 값 출력
		//   ex) + 10 20 전달하면 10+20 결과 30 리턴
		
		System.out.println("결과는 : " + operator(100 , "/" , 20)); 
		
	}//main 끝

	public static int sum(int a, int b) {
		int total = a + b;
		return total;
	}
	
	public static int operator(int a, String b, int c) {
		if(b == "+") {
			System.out.printf("%2d%s%2d=%2d\n",a,b,c,a+c);
			return a+c;
		}else if(b == "-") {
			System.out.printf("%2d%s%2d=%2d\n",a,b,c,a-c);
			return a-c;
		}else if(b == "/") {
			System.out.printf("%2d%s%2d=%2d\n",a,b,c,a/c);
			return a/c;
		}else {
			System.out.printf("%2d%s%2d=%2d\n",a,b,c,a*c);
			return a*c;
		}
	}
	
	
	
	
	
	
	
}// class 끝
