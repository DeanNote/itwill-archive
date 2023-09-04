package while_;

public class Stu_Ex3 {

	public static void main(String[] args) {
		/*
		 * 중첩 while문
		 * - 중첩 for문과 마찬가지
		 * 
		 * 기본문법
		 * 초기식 1;
		 * while(조건식1){
		 * 	초기식2;
		 *	while(조건식2);{
		 * 		반복할 문장
		 * 		증감식 2;
		 *	}
		 *	증감식1;
		 * }
		 */
		
//		for(int i = 1; i<=5; i++) {
//			for(int j = 1; j<=5; j++) {
//				System.out.println("i = " + i +"j = " + j);
//			}
//		}
		
		int i = 1;
		while(i <=5 ) {
			System.out.println("< i값"+i+">");
			int j = 1;
			while(j <= 5) {
				System.out.println("i값 :"+ i +" j값 :"+j);
				j++;
			}
			i++;
		}
			
		
		
		
		
		
		
	}

}
