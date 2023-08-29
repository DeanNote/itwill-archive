package if_;

public class Ex2s {

	public static void main(String[] args) {
		/*
		 * if ~ else 문
		 * - 조건식 판별 결과가 true일 떄와 false일 때 서로 다른 블록을 실행
		 * - 삼항연산자와 유사한 형태로 수행되나 삼항 연산자보다 유연함
		 * 	 (조건식 판별 결과에 따라 실행 가능한 문장 더 다양함)
		 * - if문 블록은 조건식 결과가 true일 때 실행하고,
		 * 	 else문 블록은 조건식 결과가 false 일 때 실행함.
		 *   => 둘 중 하나의 블록만 실행
		 */
		
		//정수 num에 대한 절대값 계산
		int num = -5;
		if (num<0) {//조건식
			//조건식 결과가 true 일 때 실행할 문잘들...
			System.out.println("음수이므로 양수로 변환!");//문장 2
			num = -num;
		} else {
			//조건식 결과가 false 일 때 실행할 문장들..
			System.out.println("양수이므로 변환 생략!");//문장 3
		}
		System.out.println("num의 절대값 : "+num);//문장4
		System.out.println("------------------------------------------------------");
		
		//정수 num2 에 대해 홀수, 짝수(0포함) 판별
		int num2 = 3;
		
		//홀수 : 정수 num2를 2로 나눈 나머지가 1일 경우(1과 같을경우)
		//짝수 : 정수 num2를 2로 나눈 나머지가 0일 경우(0과 같을경우)
		
		//if문을 사용하여 홀수일 경우 "num은 홀수!"출력하고
		//아니면(짝수일경우)"num은 짝수!"출력
		if ((num2%2) ==1) { //num2%2 >0 과 동일한 결과
			System.out.println(num2 + " : 홀수!");
		}else {
			System.out.println(num2 + " : 짝수!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
