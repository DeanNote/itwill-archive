package array;

public class Stu_Ex2 {

	public static void main(String[] args) {
		/*
		 *  <배열 선언, 생성, 초기화를 한꺼번에 수행하는 문법>
		 *  데이터타입[] 변수명 = {데이터1, 데이터2, ....,데이터n};
		 *  => 배열 생성 문법을 별도로 명시하지 않고
		 *     중괄호를 사용하여 초기화할 데이터를 리터럴 형태로 전달하면
		 *     해당 데이터 개수만큼 배열 공간이 자동으로 생성됨
		 *  => n개 만큼의 공간을 생성하면서 인덱스 번호가 0 ~ n-1까지 부여되고
		 *     자동으로 기본값으로 초기화 됨
		 */
		int[] arr = {1,2,3,4,5};
		// =>주의! 5개의 리터럴 저장 시 5개 데이터 저장 공간만 생성되므로
		//   추가적인 데이터 저장은 불가능하게 된다!
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번 인덱스 데이터 : " + arr[i]);
		}
		
		
		// int형 배열 arr2를 먼저 선언한 후
		// 별도로 정수형 리터럴 1,2,3,4,5 로 한꺼번에 초기화 하는 경우
		int[] arr2;
//		arr2 = {1,2,3,4,5}; // 오류발생! 별도로 초기화 시 사용 불가능!
		// Array constants can only be used in initializers
		// => new 키워드를 사용하는 방법과 결합하여 문법으 지정해야 함
		arr2 = new int[] {1,2,3,4,5};
		// => 주의! 배열 크기는 지정하지 않도록 한다!
		System.out.println("---------------------------------------------");
		
		//String 타입 문자열 데이터 3개 "JAVA" "JSP" "Android" 를 저장하는
		//배열 strArr을 생성하고 리터럴로 즉시 초기화까지 수행 후 출력
		String[] strArr = {"JAVA", "JSP", "Android"};
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(i + "번 인덱스 데이터 : " + strArr[i]);
		}
		System.out.println("---------------------------------------------");

		int[] a = {1,2,3};
		int[] b = {4,5,6};
		int[] c = {7,8,9};
		
		a = b; //b의 조소값을 a에 저장
		// 기존에 a가 가리키던 1,2,3저장 공간을 버리고
		// b가 가리키는 4,5,6 저장 공간의 주소값으을 전달받아 참조하게됨.
		
		
		
		
		
		
		
		
 	}//main 끝

}//Ex2 끝
