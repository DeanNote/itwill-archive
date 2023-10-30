package generic;

public class Ex2 {

	public static void main(String[] args) {
		/*
		  제네릭 타입 사용 시 주의사항
		 1. Static 멤서 내에서 제네릭 타입 파라미터 사용 불가
		  => 제네릭 타입은 인스턴스 생성 시점에서 실제 데이터타입으로 변환되는데
		     static멤버느 니
		 2. new x
		 3. instanceof x
		 */

		
	}//main end

}// Ex2 end

class GenericClass2<T>{
	
	private T data;
//	private static T staticMember; // 컴파일에러발생!
	// Cannot make a static reference to the non-static type T

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public void compare() {
		Object o = new Object();
//		if(o instanceof T) { // instanceof 연산자에 제네릭 타입 파라미터 사용 불가
			// Cannot perform instanceof check against type parameter T.
			// Use its erasure Object instead since further generic type information will be erased at runtime
			// => 컴파일 시점에서 T 데이터 확인 불가능하므로
			// 형변환도 불가능!
//		}
	}
	
	
}
