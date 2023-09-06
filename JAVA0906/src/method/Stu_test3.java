package method;

public class Stu_test3 {

	public static void main(String[] args) {
		//5. 파라미터 2개 이상 메서드 호출 연습
		// 정수 2개를 전달하면 두 정수의 합을 리턴하는 메서드를 호출하고
		// 리턴값을 출력
		int total = sum(10,20);
		System.out.println(total);
		
		
	}//main 끝

	public static int sum(int a, int b) {
		int total = a + b;
		return total;
	}
	
}// class 끝
