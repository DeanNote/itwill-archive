package method_overloading;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 메서드 오버로딩 = 메서드 다중 정의
		 * - 동일 이름 파라미터 다른 메서드 여러번 정의
		 * - 비슷 기능 수행, 전달받은 데이터 타입 다른 경우
		 *   메서드 이름 따로 정의 X 동일 이름으로
		 *   파라미터만으로 구분되는 메서드를 여러개 정의하는 것.
		 *   주의사항! 메서드 시그니처(이름, 리턴타입, 파라미터, 접근제한자) 중
		 *   파리미터 제외 나머지 동일 정의!
		 *   =>외부에서 메서드 호출 시점 이름 동일 메서드 간
		 *     전달되는 데이터(파라미터 값) 만으로 각 메서드가 구분되어야 함
		 *     
		 *   <메서드 오버로딩 규칙(택1)>
		 *   1. 메서드 파라미터의 데이터타입이 달라야 함
		 *   2. 메서드 파라미터의 개수가 달라야 함
		 *   
		 */
		
		new NormalMethod();
		
		
		
	}

}

class NormalMethod{
	//두 수를 전달받아 덧셈 결과를 출력하는 메서드 정의
	//1. int형 정수 2개를 전달 받았을 경우
	public void addInt(int num1, int num2) {
		System.out.println(num1+num2);
		
	}
	//2. double형 실수 2개를 전달받을 경우
	public void addDouble(double num1, double num2) {
		System.out.println(num1+num2);
	}
	//일반적으로 메서드명도 식별자에 해당되므로 중복이 불가능함
	//따라서, addInt()메서드와 addDouble()메서드는 하는 일은 같지만 
	//서로 다른 파라미터를 전달받으므로 다른 이름으로 정의했음.
	//=>메서드 정의 시 메서드명을 달리해야하므로 호출 시 구분이 불편할 구 있음.
	
	public void printInt(int num) {
		System.out.println(num);
	}
	
	public void printString(String str) {
		System.out.println(str);
	}
}
