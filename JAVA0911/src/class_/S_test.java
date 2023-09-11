package class_;

public class S_test {

	public static void main(String[] args) {
		
		Person bob = new Person();
		bob.name = "홍길동";
		bob.age = 20;
		bob.isHungry = true;
		
		bob.eat("라면");
		System.out.println(bob.isHungry);
		bob.talk();
		System.out.println(bob.isHungry);
	}

}

/*
 * Person 클래스 정의
 * [ 멤버변수(인스턴스 변수) 선언]
 * - 이름(name, 문자열)
 *   나이(age, 정수)
 *   배고픔(isHungry, boolean)
 *   
 * [ 메서드 정의 ]
 * - 이름, 나이, 배고픔을 출력하는 showPersonInfo() 메서드
 *   (매개변수 없음, 리턴값 없음)
 *   출력 형태
 *   이름 : 홍길동
 *   나이 : 20
 *   배고픔 : true
 *   
 * - 밥먹는 기능을 수행하는 eat() 메서드
 *   (매개변수 : 음식이름(foodName, 문자열), 리턴값 없음)
 *   => "XXX 먹기!" 출력
 *   => 멤버변수 isHungry 의 값을 false로 변경  
 *   
 * - 말하기 기능을 수행하는 talk() 메서드
 *   (매개변수 없음, 리턴값 없음)
 *   => "말하기!" 출력
 *   => 멤버변수 isHungry 의 값을 true로 변경
 *     

 *     
 */


class Person {

		String name;
		int age;
		boolean isHungry;
		
		public void showPersonInfo() {
			System.out.println("이름 :" + name);
			System.out.println("나이 :" + age);
			System.out.println("배고픔 :" + isHungry);
		}
		
		public void eat(String menu) {
			System.out.println(menu + "먹기!");
			isHungry = false;
		}
	
		public void talk() {
			System.out.println("말하기!");
			isHungry = true;

		}
}



