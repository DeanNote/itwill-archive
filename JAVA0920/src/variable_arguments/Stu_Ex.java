package variable_arguments;

public class Stu_Ex {

	public static void main(String[] args) {
		/*
		 * 가변형 인자 = 비정형 인자(Varioable Arguments, VARARGS)
		 * - 메서드 파라미터를 하나의 인자만 사용하여 다양하게 전달받는 기능
		 * - 동일한 타입의 파라미터를 0개~ 무한대로 전달받아 배열로 관리
		 *   => 전달받는 인자(데이터)의 개수에 따라 자동으로 배열 생성됨
		 * - 메서드 파라미터(매개변수) 선언 시 데이터 타입 뒤에 ...기호를 표기
		 *   ex) public void add(int... nums){}
		 * - 가변 인자를 사용한 메서드 대표적인 예 : printf()메서드
		 *   => System.out.printf(String str, Object....objs)
		 * - 다른 파라미터와 가변 인자를 조합 가능
		 * - 주의! 가변 인자는 마지막 파라미터로 단 한번만 지정 가능
		 */
		
		//가변인자를 사용하지 않은 오버로딩 메서드 호출
		NormalArguments na = new NormalArguments();
		
		na.print("동그라미");
		
	}//main끝

}//ex끝

class NormalArguments{
	//가변 인자를 사용하지 않은 메서드 오버로딩
	// print() 메서드 오버로딩
	// String 타입 변수 (name)를 통해 이름을 1개~3개 전달받아 출력
	public void print(String name1) {
		System.out.println(name1);
	}
	
	public void print(String name1, String name2) {
		System.out.println(name1 + " " + name2);

	}

	public void print(String name1, String name2, String name3) {
		System.out.println(name1 + " " + name2 + " " + name3);
		
	}
}
