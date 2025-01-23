package reference_type_conversion;

public class Test {

	public static void main(String[] args) {
		// 레퍼런스 형변환 연습
		// 서브클래스 타입(스마트폰) 인스턴스 생성
		스마트폰 내폰 = new 스마트폰();
		
		// 서브클래스 타입으로 참조 가능한 메서드 : 3개
		내폰.전화();
		내폰.문자();
		내폰.카톡();
		
		// 슈퍼클래스 타입(핸드폰) 인스턴스 생성
		핸드폰 어머니폰 = new 핸드폰();
		
		// 슈퍼클래스 타입으로 참조 가능한 메서드 : 2개
		어머니폰.전화();
		어머니폰.문자();
//		어머니폰.카톡();
		
		System.out.println("---------------------------------------------");
		
		// 업캐스팅 예)
		// 내가 쓰던 스마트폰(내폰)을 어머니께 드릴 경우
		// = 스마트폰(서브) -> 핸드폰(슈퍼) 타입으로 변환하는 경우
		어머니폰 = 내폰; // 자동 형변환
		
		// 어머니가 사용 가능한 기능 : 2개
		어머니폰.전화(); // 핸드폰에서 사용 가능한 기능(보임)
		어머니폰.문자(); // 핸드폰에서 사용 가능한 기능(보임)
//		어머니폰.카톡(); // 스마트폰에서 사용 가능한 기능(안보임) = 사용 불가!
		// => 스마트폰을 핸드폰 타입으로 참조할 경우 기능이 축소됨!
		
		// 또 다른 스마트폰(동생폰)을 어머니께 드릴 경우
		// = 스마트폰(서브) -> 핸드폰(슈퍼) 타입으로 변환하는 경우
		스마트폰 동생폰 = new 스마트폰();
		
		어머니폰 = 동생폰;
		어머니폰.전화(); // 핸드폰에서 사용 가능한 기능(보임)
		어머니폰.문자(); // 핸드폰에서 사용 가능한 기능(보임)
//		어머니폰.카톡(); // 스마트폰에서 사용 가능한 기능(안보임) = 사용 불가!
		// => 스마트폰을 핸드폰 타입으로 참조할 경우 기능이 축소됨!
		
		System.out.println("============================================");
		
		// 다운캐스팅이 성공적으로 수행되는 예)
		어머니폰 = new 스마트폰(); // 스마트폰 -> 핸드폰으로 업캐스팅
		
		// 어머니폰으로 사용 가능한 기능 : 2개
		어머니폰.전화();
		어머니폰.문자();
		
//		내폰 = 어머니폰; // 핸드폰 타입 -> 스마트폰 다운캐스팅으로 강제 형변환 필수!
		내폰 = (스마트폰)어머니폰; // 다운캐스팅 수행
		
		// 참조 가능한 영역이 확대
		// => 사용 가능한 기능이 3가지로 확대됨
		// => 이전에 이미 스마트폰 -> 핸드폰으로 업캐스팅 한 뒤에
		//    다시 스마트폰으로 다운캐스팅을 하는 경우이므로 안전하다!
		내폰.전화();
		내폰.문자();
		내폰.카톡();

	}

}

class 전화기 {
	public void 전화() {
		System.out.println("전화 걸기!");
	}
}

class 핸드폰 extends 전화기 {
	public void 문자() {
		System.out.println("문자 전송!");
	}
}

class 스마트폰 extends 핸드폰 {
	public void 카톡() {
		System.out.println("카톡 전송!");
	}
}













