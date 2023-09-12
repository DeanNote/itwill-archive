package access_modifier;

public class Stu_Ex {

	public static void main(String[] args) {
		/*
		 * 1. private 접근제한자
		 * 외부 클래스에서 접근x 자신의 클래스 내에서만 가능
		 * 주로 외부에서 접근못하게 멤버변수에 적용
		 * 
		 * 2. public 접근제한자
		 * 누구나 접근가능
		 * 주로 외부에서 접근하는 메서드에 적용
		 * 
		 * 
		 * 
		 */
		//Person 클래스의 인스턴스(p) 생성
		Person p = new Person();
		
		// 멤버변수 값을 변경하기 위해 참조변수를 통해 멤버 변수에 접근
		//private 접근제한자 때문에 외부 클래스에저 접근 불가!
		p.name ="홍길동"; //private 접근제한자 때문에 name 값 수정 못함
		p.age = 20;
		
	}

}
