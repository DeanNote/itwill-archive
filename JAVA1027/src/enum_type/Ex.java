package enum_type;

public class Ex {

	public static void main(String[] args) {
		
		/*
		 * 상수를 사용하여 한정된 데이터를 관리하는 경우
		 * 간편한 선언을 통해서 관리할 수 있다는 장점이 있으나
		 * 해당 값의 범위를 벗어나는 값을 사용할 경우
		 * 컴파일 시점에서 오류 발견이 불가능!
		 * 
		 * 추가적인 작업을 통해 범위 내의 값인지 판별하는 작업이 별도로 필요함
		 * => 이를 해결하기 위해 열거형(enum type) 필요!
		 * 
		 * 열거형(Enumeration Type = Enum 타입)
		 * - 상수를 좀 더 확실한 형태로 다루기 위한 객체의 일종
		 * - 데이터타입이 일치하면 다른 데이터라도 사용 가능한 상수의 단점을 해결
		 * - enum 타입은 내부적으로 java.lang.Enum 클래스를 상속받음
		 * 
		 * <열거타입 정의 방법>
		 * [접근제한자] enum 열거타입명{
		 * 	//열거타입에 사용할 값(상수)을 차례대로 나열
		 * 	  상수1, 상수2, ... 상수n
		 * }
		 * 
		 * - 기본적으로 클래스, 인터페이스 정의 문법과 유사함
		 *  단, 열거타입 중괄호 내에는 상수로 사용될 이름만 지정
		 *  
		 *  < 열거 타입 사용 방법 >
		 *  1. 열거타입 변수 선언 방법(클래스, 인터페이스와 동일)
		 *     열거타입 변수명
		 *     ex) Month month, EnumWeek today
		 *     
		 *  2. 열거타입 비교 방법
		 *  - if문 사용 시 동등비교연산자 사용(==)
		 *  - switch문 사용 가능(단, case 문에서 열거타입명 없이 상수만 지정 필수!)
		 *    switch(열거타입변수){
		 *    	case 열거타입상수1 : 수행할 작업들...;
		 *    	case 열거타입상수2 : 수행할 작업들...;
		 *      ...
		 *    	case 열거타입상수n : 수행할 작업들...;
		 *  	}
		 * 
		 */
		
	}//main end

}// Ex end

// 요일 정보를 관리하는 클래스 정의
// 열거타입을 사용하지 않고, 상수만 사용하는 경우
class Week{
	//요일 정보를 상수로 관리
	// => 외부에서 실제 데이터를 정확하게 알지 못해도 상수명(변수명)
	//    만으로 값을 사용 가능
	// => 클래스명만으로 사용이 가능하여 접근이 쉬움.
	//    또한, 값 변경이 불가능하여 안전함.
	public static final int WEEK_MONDAY    = 0;
	public static final int WEEK_TUSEDAY   = 1;
	public static final int WEEK_WEDENSDAY = 2;
	public static final int WEEK_THURSDAY  = 3;
	public static final int WEEK_FRIDAY    = 4;
	public static final int WEEK_SATURDAY  = 5;
	public static final int WEEK_SUNDAY    = 6;
	
	private int myWeek;
	
	
}











