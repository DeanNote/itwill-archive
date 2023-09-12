package method_overloading;

public class test {

	public static void main(String[] args) {
	

	PrintOverloading pri = new PrintOverloading();
	
	pri.print(1);
	pri.print(2.0);
	pri.print("자- 바- ");

	
	
	}//main 끝
	
}//test class끝

/*
 * 정수, 실수, 문자열 데이터를 1개를 전달받아 출력하는 print()메서드 오버로딩
 * 파라미터가 없는 print() 메서드까지 정의(->줄바꿈) 
 * 클래스 명 : PrintOverloading 
 */

class PrintOverloading{
	
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