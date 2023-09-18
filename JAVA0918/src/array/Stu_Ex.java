package array;

public class Stu_Ex {

	public static void main(String[] args) {
		/*
		 * 배열(array)
		 * - 같은 타입 데이터 여러 개를 하나의 묶음(변수)으로 다루는 메모리 공간
		 
		 *<배열의 생성 기본 문법>
		 * 변수명 = new 데이터타입[배열크기];
		 * => new 키워드를 사용하여 배열 공간을 생성하는데
		 * 	  데이터타입 뒤의 대괄호 안에 생성할 배열의 크기를 명시
		 * => 생성되는 배열의 위치(주소값)를 선언된 배열 타입 변수에 저장
		 * => 이제, 실제 메모리 공간이 생성되었으므로 데이터 저장이 가능
		 * => 생성된 배열에는 자동으로 인덱스 번호가 부여됨
		 * 	  (인덱스 번호는 0~배열크기-1까지 자동으로 부여됨)
		 * 
		 *<배열 선언 및 생성을 하나의 문장으로 결합>
		 *데이터타입[] 변수명 = new 데이터타입[배열크기];
		 *
		 *<배열 접근 기본 문법>
		 *변수명[인덱스]
		 *=> 변수명에 해당하는 주소(배열 공간)에 접근 한 뒤
		 *	 인덱스에 해당하는 데이터 저장 공간에 접근
		 *=> 배열에 데이터 초기화(저장)시
		 *~~
		 *
		 *
		 *
		 *
		 *
		 */
		
		
		
		//학생 점수 5개를 별도의 변수에 저장하고 관리하는 경우
		int score1 = 90, score2 =60, score3 = 80, score4 =100, score5 = 50;
		int scoreTotal = score1+score2+score3+score4+score5;
		
		//학생 점수 5개(정수)를 저장할 배열(score) 선언 및 생성, 초기화 
		// 1. 배열 선언
//		int[] score;
//		score = 90; //오류발생! 배열 이름으로 사용되는 변수에 데이터 저장 불가!
		// => Type mismatch: cannot convert from int to int[]
		
		// 2. 배열 생성
//		score = new int[5];
		//연속적인 int형 배열공간 5개를 생성하고,
		//해당 공간의 메모리 주소를 int[]타입 변수 score에 저장
		//=>이 때, 5개의 메모리 공간에는 각각의 인덱스 번호가 자동으로 부여됨
		//  (인덱스 번호는 0 ~ 4까지 부여됨)
		
		// 배열 선언 및 생성을 하나의 문장으로 결합
		int[] score = new  int[5];
		
		System.out.println(score);// 배열명 그대로 출력 시 주소값 출력(데이터X);
		System.out.println(score[0]);//score 배열의 0번 인덱스 데이터 값 출력
		System.out.println(score[1]);//score 배열의 1번 인덱스 데이터 값 출력
		System.out.println(score[2]);//score 배열의 2번 인덱스 데이터 값 출력
		System.out.println(score[3]);//score 배열의 3번 인덱스 데이터 값 출력
		System.out.println(score[4]);//score 배열의 4번 인덱스 데이터 값 출력
		// => 이 때, 배열은 자동으로 기본값으로 초기화 되므로 0 출력됨
		
		/*
		 * 주의! 생성된 배열의 인덱스 범위를 벗어나는 배열 접근 시 오류 발생!
		 * => 단, 문법적으로 오류가 아니기 때문에 코드 상에서는 알 수 없고,
		 *    프로그램 실행 시점에서 오류가 발견됨
		 */
		
		System.out.println(score[5]);
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
		//Index 5 out of bounds for length 5 at array.Stu_Ex.main(Stu_Ex.java:71)
		// => ArrayIndexOutOfBoundsException : index 5 5번 인덱스가 범위를 벗어남
		// => at array.Stu_Ex.main(Stu_Ex.java:71) Stu.java클래스의 71번 라인이 오류
		
		
		
		
		
	}

}
