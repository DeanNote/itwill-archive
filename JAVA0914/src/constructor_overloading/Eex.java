package constructor_overloading;

public class Eex {

	public static void main(String[] args) {
		/*
		 * 생성자 오버로딩
		 * - 메서드 오버로딩과 동일
		 * - 생성자 호출 시 다양한 형태의 파라미터를 전달하여
		 *   객체를 다양하게 초기화하는 목적
		 *   
		 */
	}

}

class Person{
	String nation;
	String name;
	String jumin;
	
	// 기본 생성자 정의
	public Person() {
		System.out.println("Person()생성자 호출됨!");
	}
	// 국가는 자동으로 "대한민국"으로 초기화하고
	// 파라미터 2개 (name, jumin)를 전달받아 초기화 하는 생성자 정의
	public Person(String newName, String newJumin) {
		System.out.println("Person(String, String) 생성자 호출됨!");
		System.out.println("Person()생성자 호출됨!");
		System.out.println("Person()생성자 호출됨!");
	}
}
