package while_;

public class Stu_Test {

	public static void main(String[] args) {
		/* while문을 이용하여 구구단 2단 출력
		 * 
		 */
		
		int dan = 2;
		int i = 1;
		while(i<10) {
			System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
			i++;
		}
		
		System.out.println("------------------------------------------------------");
		
		//whlie문을 사용하여 정수 1~10까지의 합(total)을 계산 후 출력
		
		int total = 0;
		i = 1;
		while(i<=10) {
			total = total + i;
			i++;
		}
		System.out.println("1~10까지의 정수의 합 : " + total);
		
		
		
		
		
		
		
	}

}
