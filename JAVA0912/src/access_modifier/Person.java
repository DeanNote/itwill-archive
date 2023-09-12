package access_modifier;

public class Person {
	// 멤버변수 선언
	// 외부에서 멤버변수에 접근이 불가능하도록 private 접근제한자 사용
	private String name;
	private int age;
	
	//멤버변수에 대신 접근하도록 Getter/Setter 메서드 정의(public 접근제한자 사용)
	public String getName() {
		//멤버변수 name 값을 외부로 리턴
		return name;
	}
	
	
	public int getAge() {
		return age;
	}
	
	//2. setter 메서드 정의
	//	=>파라미터o 리턴값x
	// String 타입 멤버변수 name에 대한 Setter 메서드 정의
	public void setName(String newName) {
		//외부로 전달받은 name값(로컬변수 newName)을 멤버변수 name에 저장
		name = newName;
		
	}
	
	//int타입 멤버변수 age에 대한 Setter메서드 정의
	public void setAge(int newAge) {
		//외부로 전달받은 age값(로컬변수 newAge)을 멤버변수 age에 저장
	}
	
}