package method;

public class Stu_test2 {

	public static void main(String[] args) {
		//3. 파라미터 o 리턴 x 메서드 호출 연습
		// 문자열 1개 전달하면 해당 문자열을 출력하는 print() 메서드 호출
		
		print("아이티윌 부산교육센터");
		System.out.println("-----------------------------------------------------------");
		
		//정수 1개 전달하면 홀 짝 판별
		// checkNumber() 메서드 호출
		checkNumber(4);
		System.out.println("-----------------------------------------------------------");
	
		//4. 파라미터 o 리턴 x 메서드 호출 연습
		// 정수 1개 전달하면 홀 짝 판별 후
		// 판별 결과를 리턴하는 checkNumber2()메서드 호출
		String result = checkNumber2(3);
		System.out.println("판별 결과 : " + result);

	}//main 끝
	//-------------------------------------------------------------------
	public static void print(String msg) {
		System.out.println(msg);
	}
	//-------------------------------------------------------------------
	public static void checkNumber(int data) {
		if(data%2==0) {
			System.out.println(data + " 짝수입니다!");
		}else {
			System.out.println(data + " 홀수입니다!");
		}
	}
	//-------------------------------------------------------------------
	public static String checkNumber2(int data) {
		if(data%2==0) {
			return "짝수";
		}
			return "홀수";
	}
	//-------------------------------------------------------------------
	
	
}//class 끝
