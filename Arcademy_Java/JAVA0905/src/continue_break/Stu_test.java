package continue_break;

public class Stu_test {

	public static void main(String[] args) {
		/*
		 * 1~100까지 정수의 합을 계산(total 변수에 저장)
		 * 단, 합계가 1000보다 클 경우 반복문을 종료하고 빠져나간 뒤
		 * 1000보다 커지는 시점의 정수(x) 를 출력
		 */
		
		int total = 0;
		int i;
		for(i = 1; i<=100; i++) {
			total += i;
			if(total>1000) {
				System.out.println("1000보다 커지는 시점의 정수 i : " + i);
				break;
			}System.out.println(total);
		}
		System.out.println("===================================================");
		
		/*
		 * 1+ (-2)+3+( -4)+5+(-6)+7+(-8)+9+생략....
		 * 짝수를 음수로 만들어서
		 * 형식으로 계속 더 할 때 총합이 100이상이 되는  x값을 출력 (break문 사용
		 * <힌트> 정수가 짝수 일 때는 음수 형태로 변환하여합계 누적
		 */
		
		int x = 0;
		total = 0;
		
//		while(total < 100) {
//			x++;
//			if(x%2==0) {
//				System.out.println(-x);
//				total = total + -x;
//			}else {
//				System.out.println(x);
//				total += x;
//			}
//		}
		/////////////////////////////////////////////////////
		
		// break문을 사용한 while문
		x = 1;
		total = 0;
		
//		while(true) {
//			if(x % 2 == 0) {
//				System.out.println(-x);
//				total = total + -x;
//			}else {
//				System.out.println(x);
//				total += x;
//			}
//			if(total >= 100) {
//				break;
//			}
//			x++;
//		}
		//////////////////////////////////////
		//조건식을 생략한 형태의 for문
		for(x = 1; ; x++) {
			if(x % 2 == 0) {
				System.out.println(-x);
				total = total + -x;
			}else {
				System.out.println(x);
				total += x;
			}
			if(total >= 100) {
				break;
			}
			x++;
		}
		///////////////////////////////////
		//증감식을 생략한 형태의 for문
		for(x = 1;total<100;) {
			if(x % 2 == 0) {
				System.out.println(-x);
				total = total + -x;
			}else {
				System.out.println(x);
				total += x;
			}
			if(total >= 100) {
				break;
			}
			x++;
		}
		////////////////////////////////////////
		//모든 요소를 생략한 형태의 for문
		for( ; ; ) {
			if(x % 2 == 0) {
				System.out.println(-x);
				total = total + -x;
			}else {
				System.out.println(x);
				total += x;
				
			}
			if(total >= 100) {
				break;
			}
			x++;
		}
	}

}
