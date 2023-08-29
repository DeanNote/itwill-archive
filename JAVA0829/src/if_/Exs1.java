package if_;

public class Exs1 {

	public static void main(String[] args) {
		/*
		 * 조건문
		 * - 조건식 결과에 따라 실행 할 문장이 달라지는 문(statement)
		 * - if문과 switch문으로 구분됨
		 * 
		 * [ if문 ]
		 * 1. if문(단일 if문)
		 * - 가장 단순한 조건문
		 * - 조건식 판별 결과가 true 일 때 특정 문장(블록) 추가로 실행
		 * 
		 * <기본 문법>
		 * 문장 1;
		 * 
		 * if(조건식 "true or false 나타낼수 있는 문장") { 조건식 판별 결과가 true 일 때 실행할 문장들....문장2;}문장 3; 
		 * 결과
		 * true  : 문장1 -> 조건식(true) -> 문장2 -> 문장 3
		 * false : 문장1 -> 조건식(false) -> 문장 3
		 * 
		 */
		
		System.out.println("프로그램 시작!");
		int num = 4;
		//정수 num이 5보다 작은가?
		if (num<5) {
			System.out.println("num이 5보다 작다!!");
			
		}
			System.out.println("프로그램 종료");
		
		System.out.println("----------------------------------------------------------");
		
		//정수 num2의 절대값을 계산하여 출력
		int num2 = -5;
		if(num2<0) {
			num2 = -num2;
			System.out.println("음수를 양수로 반환!");
		}
		System.out.println("num의 절대값 : " + num2);
		
		
		
		
		
		
		
	}

}
