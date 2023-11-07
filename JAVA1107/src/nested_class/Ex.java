package nested_class;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 중첩 클래스 (Nested Class)
		 * - 외부 Outet class
		 * - 내부 Inner class
		 * 
		 * 1) 인스턴스(멤버)내부 클래스
		 * - 
		 * 2) 정적 멤버 클래스
		 * -
		 * 3) 로컬 멤버(내부) 클래스(=로컬클래스)
		 * 
		 * 
		 */
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.innerMethod();
		System.out.println(inner.innerNum);
		
		Outer.StaticInner stc = new Outer.StaticInner();
		stc.innerStaticMethod();
		System.out.println(stc.innerStaticNum);
		
		
	}

}

class Outer{//Outerclass
	private int num = 10;
	int num2 = 20;
	static int num3 = 30;
	
	public void method() { //인스턴스 멤버메서드
		// 인스턴스 멤버메서드 내에서는 인스턴스 멤버변수 및 메서드에 대해 자유롭게 접근이 가능
		System.out.println("인스턴스 멤버변수 num = " + num);
		method2();
	}
	
	public void method2() {//인스턴스 멤버메서드
		System.out.println("인스턴스 메서드 method2()");
	}
	
	public static void method3() {// 정적 멤버메서드
//		System.out.println("인스턴스 멤버변수 num = " + num);//접근불가!
		System.out.println("정적 멤버변수 num3 = " + num3);//접근가능!
	}
	//----------------------------------------------------------------------------------------------
	// 인스턴스 멤버 내부 클래스 정의
	class Inner{// 중첩클래스(인스턴스 멤버 클래스)
		int innerNum = 100;
		// 인스턴스 멤버 내부클래스에서는 외부 클래스의 멤버에 자유롭게 접근
//		static int innerNum2 = 200;
		//The field innerNum2 cannot be declared static in a non-static inner type, unless initialized with a constant expression
		//static 변수 선언 불가!
		public void innerMethod(){
			System.out.println("외부 클래스의 인스턴스 멤버변수 num = " + num);
			method2();//외부 클래스의 메서드도 호출 가능
		}
		
//		public static void innerStaticMethod() {}
		//The method innerStaticMethod cannot be declared static; static methods can only be declared in a static or top level type
		//static 메서드 정의할 수 없음!
		
	}//Inner Class End
	//----------------------------------------------------------------------------------------------
	//정적 멤버 내부 클래스 정의
	static class StaticInner{
		int innerNum = 100;
		
		static int innerStaticNum = 200;
		
		public void innerMethod() {
//			System.out.println("외부클래스의 인스턴스 멤버변수 num = " + num);
			// Cannot make a static reference to the non-static field num
			// 외부 클래스의 멤버변수 접근 불가능
//			method2();
			//Cannot make a static reference to the non-static method method2() from the type Outer
			// 외부 클래스의 멤버메서드도 호출 불가능
		}
		
		public static void innerStaticMethod(){
//			System.out.println("내부 클래스의 인스턴스 멤버변수 innerNum = " + innerNum); //innerNum cannot be resolved to a variable
			System.out.println("내부 클래스의 정적 멤버변수 innerStaticNum = " + innerStaticNum);
		}
			
	}//Static Class End
	
	
}// Outer Class End