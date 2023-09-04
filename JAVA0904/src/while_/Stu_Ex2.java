package while_;

public class Stu_Ex2 {

	public static void main(String[] args) {
		/*
		 * do~ while문
		 * - while문은 조건을 먼저 검사하고 반복여부를 결정하지만
		 * do~while문은 일단 반복문을 먼저 실행하고 난 뒤에 조건을 검사하여
		 * 다음 반복 여부를 결정함
		 * -while 문은 조건식 따라 반복문이 단 한 번도 실행 되지 않을 수도 있지만
		 * do~while문은 최소 한 번의 실행은 보장됨
		 * 
		 * <기본 문법>
		 * do{
		 * 	// 반복 실행할 문장
		 * } while(조건식);
		 * 	//주의! while 문 뒤에 반드시 세미콜론 ; 필수입력!
		 */
		
		int i = 11;
		do {
			System.out.println("i = " + i);
			i++;
		} while(i<=10);
	
		System.out.println("do ~ while문 종료 후 i 값 : " + i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
