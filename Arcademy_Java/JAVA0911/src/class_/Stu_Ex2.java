package class_;

public class Stu_Ex2 {

	public static void main(String[] args) {
		
		Person22 p1 = new Person22();
		p1.name = "홍길둥";
		p1.age = 20;
		System.out.println("이름 : " + p1.name);
		System.out.println("나이 : " + p1.age);
		
		p1.print();
		
		Person22 p2 = new Person22();
		p2.name = "이순신";
		p2.age = 44;
		p2.print();
		
		
	}//main끝

}//class끝


// 사람(person) 클래스 정의
 
class Person22{
	//멤버변수 선언
	String name;// 이름
	int age;// 나이
	
	// 메서드 정의
	// 자신의 인스턴스에 저장된 이름, 나이를 출력하는 print() 메서드 정의
	// => 매개변수 없음, 리턴값 없음
	public void print() {
		// 클래스 내 메서드에서 자신의 클래스 멤버변수에 자유롭게 접근 가능
		// => 즉, 변수명만으로 메모리에 생성된 자신의 인스턴스 내역
		// 	  멤버변수 값을 사용 할 수 있다!
		//	단, 동일한 코드라도 인스턴스에 따라 저장된 값은 달라짐
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
	}
	
}
