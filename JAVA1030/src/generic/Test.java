package generic;

public class Test {

	public static void main(String[] args) {
		// Person 클래스 인스턴스 2개 생성 및 참조변수 출력
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("이순신", 44);
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("===================================");
		
		// Person 객체 여러개를 하나의 객체에 저장하여 관리하는 경우
		// 1. Object[] 배열(또는 Person[] 배열)을 통해 관리
		// => 생성된 배열의 크기가 불변이므로 추가로 객체 저장 불가
		// => Object 타입으로 업캐스팅 된 객체는 다시 다운캐스팅이 필요함
		//    (또한, 다운캐스팅 전 타입 체크도 필요함)
		
		// Object[] 배열에 p1, p2 대입
		Object[] objArr = {p1, p2}; // Person -> Object 업캐스팅 되어 관리됨
		
		// for문으로 출력
		for(int i = 0; i<objArr.length; i++) {
		}
		
		

	}

}







