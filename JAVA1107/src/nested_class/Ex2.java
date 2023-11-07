package nested_class;

public class Ex2 {

	public static void main(String[] args) {
		
	}

}

class Outer2{
	private int num = 10;
	public void method() {
		System.out.println(num);
		
		// 로컬 내부클래스 정의
		class LocalInner{
			String name = "LocalInnerClass";
			
//			static int staticmember; 오류 발생! 사용 불가능!
//			public static void staticmethod() {} 오류 발생! 사용 불가능!
		}
		
	}
}