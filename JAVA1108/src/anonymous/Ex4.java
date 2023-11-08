package anonymous;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 익명 객체의 로컬 변수 사용
		 * - 메서드의 매개변수나 로컬변수를 익명 객체 내부에서 사용할 때 제한이 있음
		 * - 익명 객체는 메서드 실행이 종료되면 없어지는 것이 일반적이지만
		 *   메서드가 종료되어도 계속 실행 상태로 존재할 수 있음
		 *   (ex.익명 쓰레드 객체 사용)
		 *   
		 */
		AnnoymousClass ac = new AnnoymousClass();
		ac.method(0, 0);
		
		
		
	}

}

interface Calculatable{
	public int sum();
	
}

class AnnoymousClass{
	private int num;
	
	public void method(final int arg1, int arg2) {
		final int num1 = 0;
		int num2 = 0;
		
		num = 10;//인스턴스 멤버 변수의 값은 변경이 가능
		
//		arg1 = 20; 오류발생! The final local variable arg1 cannot be assigned. It must be blank and not using a compound assignment
//		arg2 = 20;
//		num1 = 30; 오류발생! The final local variable num1 cannot be assigned. It must be blank and not using a compound assignment
//		num2 = 30;
		
		Calculatable cal = new Calculatable() {
			@Override
			public int sum() {
				int result = num + arg1 + arg2 + num1 + num2;
				return result;
			}
		};
		System.out.println(cal.sum());
	}//method end
	
}//AnnoymousClass end
























