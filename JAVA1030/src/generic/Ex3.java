package generic;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// 제네릭 타입의 상속과 구현
class Class1<P> {}
interface Interface<Q>{}

// 부모 타입에 제네릭 타입이 지정되어 있는 경우
// 서브클래스에서 상속받을 때 부모의 타입 파라미터를 서브클래스 타입파라미터로 명시해야 한다!

class SubClass extends Class1{
	
}