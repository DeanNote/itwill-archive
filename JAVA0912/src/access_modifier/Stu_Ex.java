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
		 * -------------------------------------------------------------
		 * Getter/ Setter 메서드
		 * private로 접근제한된 멤버변수에 접근을 위해
		 * 중개 역할의 메서드
		 * public 접근제한자 사용하여 정의
		 * 
		 * 1. Getter : 내부 멤버변수의 값을 외부로 리턴하는 메서드
		 * 
		 * => getXXX() 형식
		 * => 파라미터는 없고 리턴값은 있음
		 * 		ex) public int getNum( ){ }
		 * 
		 * 2. Setter : 외부로부터 값을 전달 받아 내부 멤버변수에 저장하는 메서드
		 * 
		 * => setXXX() 형식
		 * => 파라미터는 있고 리턴값은 없음
		 * 		ex)public void setNum( ){ }
		 */
		//Person 클래스의 인스턴스(p) 생성
		Person p = new Person();
		
		// 멤버변수 값을 변경하기 위해 참조변수를 통해 멤버 변수에 접근
		// private 접근제한자 때문에 외부 클래스에저 접근 불가!
		p.name ="홍길동"; // The field Person.name is not visible
		p.age = 20;
		
	}

}
