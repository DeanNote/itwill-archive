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
				System.out.printf("%d분%2d초\n",m,s);
			}
		}	
		System.out.println("---------------------------------------");
		/*
		 * 중첩 for 문 활용한 구구단 전체 출력(2단 ~ 9단)
		 * <2단>
		 * 2*1=2
		 * 2*2=3
		 * ~~생략
		 * 2*9=18
		 * <3단>
		 * 3*1=3
		 * ~~~생략
		 * <9단>
		 * ~~생략
		 * 9*9=81
		 */
		int dan = 0;
		for(dan = 2; dan<=9; dan++) {
			System.out.println("<" + dan + "단>");
			for(int i =1; i<=9; i++) {
//				System.out.println(dan + "*" + i + "=" + dan*i);
				System.out.printf("%d + %d = %d\n",dan,i,(dan*i));
			}
		  System.out.println();
		}
		System.out.println("---------------------------------------");

		//주사위 2개를 굴려서 주사위 눈의 합이 6일 때 두 주사위 값을 출력
		//ex) 주사위 1         주사위 2        합계
		/*      1        +       5       =       6
		/*      2        +       4       =       6
		/*      3        +       3       =       6
		/*      4        +       2       =       6
		/*      5        +       1       =       6
		 * 주사위 눈 : 1~6
		 * 주사위(dice1, dice2) 변수 값을 1~6까지 1씩 증가하면서 반복하여
		 * 주사위 눈의 합계가 6인지 판별하여 6일 때 주사위 눈의 값 출력
		 * => 판별해야 하므로 if문이 같이 사용됨
		*/
	
		int dice1 = 0;
		int dice2 = 0;
		for(dice1=1; dice1<=6; dice1++) {
			for(dice2=1; dice2<=6; dice2++) {
				if(dice1 + dice2 == 6) {
					System.out.printf("%d + %d = %d\n",dice1,dice2,(dice1+dice2));
				}
			}
		}
		
		
	
	
	
	
	}
}

