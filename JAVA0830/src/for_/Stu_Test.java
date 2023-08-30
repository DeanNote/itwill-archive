package for_;

public class Stu_Test {

	public static void main(String[] args) {
		// 1~9까지 1씩 증가하면서 출력 (for문)
		for(int i = 1; i<10; i++) {
			System.out.println(i);
		}
		System.out.println("-------------------------------------------------");
		/*
		 * for문 구구단 만들기
		 * 2단
		 * 2 * 1 = 2
		 * 생략..
		 * 2 * 9 = 18
		 */
		int i = 1;
		int dan =2;
		for(i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", dan,i,(dan*i));
		}
		
	}

}
