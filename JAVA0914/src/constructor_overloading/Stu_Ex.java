package constructor_overloading;

public class Stu_Ex {

	public static void main(String[] args) {
		/*
		 * 생성자 오버로딩
		 * - 메서드 오버로딩과 동일
		 * - 생성자 호출 시 다양한 형태의 파라미터를 전달하여
		 *   객체를 다양하게 초기화하는 목적
		 *   
		 */
		Person0914_2 p = new Person0914_2();
		p.showPersonInfo();
		System.out.println("-------------------------------");
		//문자열 2개만 전달할 경우
		Person0914_2 p2 = new Person0914_2("홍길동","132123-123123");
		p2.showPersonInfo();
		System.out.println("-------------------------------");
		//파라미터 생성자를 하나라도 정의할 경우
		//컴파일러 의해 기본 생성자가 자동으로 생성되지 않는다!
		//따라서, 기본생성자를 호출해야 하는 경우 직접 기본생성자를 정의!
		Person0914_2 p3 = new Person0914_2();
		p.showPersonInfo();

		
	}

}

class Person0914_2{
	String nation;
	String name;
	String jumin;
	
	// 기본 생성자 정의
	public Person0914_2() {
		System.out.println("Person()생성자 호출됨!");
	}
	// 국가는 자동으로 "대한민국"으로 초기화하고
	// 파라미터 2개 (name, jumin)를 전달받아 초기화 하는 생성자 정의
	public Person0914_2(String newName, String newJumin) {
		System.out.println("Person(String, String) 생성자 호출됨!");
		nation = "대한민국";
		name = newName;
		jumin = newJumin;
	}
	public Person0914_2(String newnation, String newName, String newJumin) {
		System.out.println("Person(String, String) 생성자 호출됨!");
		nation = newnation;
		name = newName;
		jumin = newJumin;
	}
	//국가명, 이름, 주민번호 출력하는 showPersonInfo()메서드 정의
	public void showPersonInfo() {
		System.out.println("국가 : " + nation);
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + jumin);
	}
}
