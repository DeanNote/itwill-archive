package anonymous;

public class Test2 {
	/*
	 * run() 메서드를 가지는 인터페이스 Vehicle 를 정의하고
	 * 익명 구현 객체를 이용하여 필드, 로컬변수의 초기값과
	 * 메서드의 매개값을 출력해보세요!
	 * 필드 : 자전거가 달립니다.
	 * 로컬변수의 초기값 : 승용차가 달립니다.
	 * 매서드의 매개값 : 트럭이 달립니다.
	 */
	public static void main(String[] args) {
		
		A a = new A();
		a.vh.run();
		
		B b = new B();
		b.method();
		
		C c = new C();
		c.method1(null);
		c.method2();
		c.method3(new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("트럭이달립니다.");
			}
		});
		
		
	}//메인 끝

}//테스트2 끝
interface Vehicle{
	public abstract void run();
}



class A{
	Vehicle vh = new Vehicle() {

		@Override
		public void run() {
			System.out.println("승용차가 달립니다.");
		}
		
	};
}

class B{
	public void method() {
		Vehicle localVar = new Vehicle(){

			@Override
			public void run() {
				System.out.println("자전거가 달립니다.");
			}
			
		};
		localVar.run();
	}//method end
}// B class end

class C{
	void method1(Vehicle ve) {}
	void method2() {
		method1(new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		});
	}
	
	
	void method3(Vehicle ve) {
		ve.run();
	}
}