package for_;

public class Stu_Test3 {

	public static void main(String[] args) {
		// 바깥쪽 for문 i값이 1~10까지 반복할 동안
		// 안쪽 for문 j값을 1~5까지 반복하면서 i와 j값을 출력
		
		for(int i = 1; i<=10; i++) {
			System.out.println("i값은 : " + i );
			for(int j = 1; j<=5; j++) {
				System.out.println("j값은 : " + j);
		System.out.println("---------------------------------------");
			}
		}
		/*
		 * 타이머 xx분 xx초
		 * - 시(hour) 0~23시
		 * - 분(min) 0~59분
		 * - 초(sec) 0~59초
		 * 
		 */
		
		for(int m = 0; m <= 59; m++) {
			for(int s = 0; s <= 59; s++) {
				System.out.println(m+"분 " + s+"초");
			}
			
		}	
		
	     
 }
}

