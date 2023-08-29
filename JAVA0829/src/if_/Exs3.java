package if_;

public class Exs3 {

	public static void main(String[] args) {
		/*
		 * 다중 if~ else if 문
		 * - 두 가지 이상의 조건식을 사용하여 세 가지 이상의 경우의 수 판별
		 * - 기본 if 문으로 첫 번째 조건을 설정하고, else if 문으로
		 *   두 번째 이후의 조건을 설정한다.
		 * - 모든 조건이 만족하지 않을 때 실행할 문이 있을 경우 문장의
		 *   마지막에 else 문 사용
		 * - if문 비교는 위에서 아래로 차례대로 비교를 수행한다.
		 *   => 비교 범위가 좁은 조건식부터 비교를 수행해야 한다!
		 */
//		<기본 문법
//		if (조건식1) {
//			조건식 1 결과 true
//		}else if (조건식2){
//			조건식 1 결과 false, 조건식 2 결과 true
//		}else if (조건식n) {
//			조건식 2 결과 false, 조건식 n 결과 true
			
		//정수 num이 양수(0보다 클 경우) 일 때 "양수!" 출력하고,
		//아니면, 정수 num이 음수(0보다 작을 경우) 일 때 "음수!"출력하고
		//둘다 아닐 경우 (0일 경우)"0" 출력
		int num = 0;
		if (num>0) {
			System.out.println(num + " : 양수!");
		}else if (num<0) {
			System.out.println(num + " : 음수!");
		}else {
			System.out.println(num +" : 0!");
		}
		
		System.out.println("-----------------------------------------------");
		
		//정수형 변수 num에 대해 홀수, 짝수 판별
		//단, 홀수와 짝수가 아닌 0을 별로로 판별
		num=2;
		
		//if문은 위에서부터 차례대로 조건을 검사 한다!
		if ((num%2)==1) {
			System.out.println(num+" : 홀수!");
			
		}else if (num==0) {
			System.out.println(num+" : 0!");
			
		}else {
			System.out.println(num+" : 짝수!");
		}
		//=> 주의! 0은 2로 나눈 나머지가 0이므로 짝수 판별식에서 true가 됨
		// 	 따라서,0을 출력하는 문장은 실행 될 수가 없다!
	
		System.out.println("-----------------------------------------------");
	
		num = 6;
		//num이 5보다 클 경우 "5보다 크다!"
		//num이 10보다 클 경우 "10보다 크다!"
		if (num>5) {
			System.out.println("5보다 크다!");
		}else if (num>10) {
			System.out.println("10보다 크다!");
		}
		
		
		if (num>10) {
			System.out.println("10보다 크다!");
		}else if (num>5) {
			System.out.println("5보다 크다!");
		}
		
	}

}
