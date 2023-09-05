package while_;

public class Stu_test3 {

	public static void main(String[] args) {
		/*
		 * 중첩 while문 활용해서 만들기
		 * 
		 * 타이머(XX분XX초)
		 * - 시(hour) : 0 ~ 23시
		 * - 분(min) : 0 ~ 59분
		 * - 초(sec) : 0 ~ 59초
		 * 
		 * < 출력 예시 >
		 * 0분 0초
		 * 0분 1초
		 * 0분 2초
		 * ... 생략 ...
		 * 0분 59초
		 * 1분 0초
		 * 1분 1초
		 * ... 생략 ...
		 * 59분 58초
		 * 59분 59초
		 * 
		 */
		
		int min = 0;
		while(min<60) {
			int sec = 0;
			while(sec<60) {
				System.out.printf("%2d분 %2d초\n",min,sec);
				sec++;
			}
			min++;
		}
		
		// 중첩 while문을 활용한 구구단 출력
		
		int dan = 2;
		while(dan<10) {
			System.out.printf("< %d단 >\n",dan);
			int s = 1;
			while(s<10) {
				System.out.printf("%2d * %2d = %2d\n",dan,s,dan*s);
				s++;
			}
			dan++;
		}
		
		
		
		
		
		
	}

}
