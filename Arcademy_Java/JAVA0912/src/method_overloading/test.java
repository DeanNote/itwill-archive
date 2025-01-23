package method_overloading;

public class test {

	public static void main(String[] args) {

	PrintOverloading pri = new PrintOverloading();
	pri.print(1);
	pri.print(2.0);
	pri.print("자- 바- 메서드 - 오버로딩 -");
	System.out.println("--------------------");

	Caclulator cac = new Caclulator();
	cac.add(1, 2);
	cac.add(1, 2, 3);
	cac.add(1, 2, 3, 4);
	System.out.println("--------------------");
	
	cal ca = new cal();
	ca.ccc("+", 1, 2);
	ca.ccc("+", 1, 2, 3);
	ca.ccc("-",50,10,10);
	ca.ccc("-",50,10,10,10);
	
	}//main 끝
	
}//test class끝

/*
 * 연산자에 해당하는 연산 수행하는 cal()메서드 정의
 */

class cal{
	public void ccc(String a, int b, int c) {
		if(a == "+") {
			System.out.printf("%d+%d=%d\n",b,c,b+c);
		}else if(a == "-") {
			System.out.printf("%d-%d=%d\n",b,c,b-c);
		}
	}
	public void ccc(String a, int b, int c, int d) {
		if(a == "+") {
			System.out.printf("%d+%d+%d=%d\n",b,c,d,b+c+d);
		}else if(a == "-") {
			System.out.printf("%d-%d-%d=%d\n",b,c,d,b-c-d);
		}
	}
	public void ccc(String a, int b, int c, int d, int e) {
		if(a == "+") {
			System.out.printf("%d+%d+%d+%d=%d\n",b,c,d,e,b+c+d+e);
		}else if(a == "-") {
			System.out.printf("%d-%d-%d-%d=%d\n",b,c,d,e,b-c-d-e);
		}
	}
}

/*
 * 계산기 Caclulator 클래스 정의
 * - 정수를 전달받아 덧셈만 수행하는 add() 메서드 정의
 * 1. 정수 2개를 전달받아 덧셈 결과 출력
 * 2. 정수 3개를 전달받아 덧셈 결과 출력
 * 3. 정수 4개를 전달받아 덧셈 결과 출력
 */

class Caclulator{
	public void add(int a, int b) {
		System.out.println("정수 2개 합 출력 : " + (a+b));
	}
	public void add(int a, int b, int c) {
		System.out.println("정수 3개 합 출력 : " + (a+b+c));
	}
	public void add(int a, int b, int c, int d) {
		System.out.println("정수 4개 합 출력 : " + (a+b+c+d));
	}
}

/*
 * 정수, 실수, 문자열 데이터를 1개를 전달받아 출력하는 print()메서드 오버로딩
 * 파라미터가 없는 print() 메서드까지 정의(->줄바꿈) 
 * 클래스 명 : PrintOverloading 
 */

class PrintOverloading{
	
	public void print() {
		System.out.println();
	}
	public void print(int a) {
		System.out.println("int 변수 : " + a);
	}
	public void print(double b) {
		System.out.println("double 변수 : " + b);
	}
	public void print(String c) {
		System.out.println("String 변수 : " + c);
	}
	
}