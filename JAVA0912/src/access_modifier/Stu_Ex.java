package access_modifier;

public class Stu_Ex {

	public static void main(String[] args) {
		//Person 클래스의 인스턴스(p) 생성
		Person p = new Person();
		
		p.name ="홍길동"; //private 접근제한자 때문에 name 값 수정 못함
		int age = 20;
		
	}

}
