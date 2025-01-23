package while_;

public class Stu_Ex {

	public static void main(String[] args) {
	/*
	 * while문
	 * - for문과 마찬가지로 특정 조건식의 판별 결과가 true일 동안 반복
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
		
	// for문을 사용하여 "hello, world!" 문자열을 10번 반복 출력
	for(int i = 1; i <= 10; i++) {
		System.out.println(i+"Hello, World!");
	}
	System.out.println("----------------------------------------------");
	
	//위의 for문을 while문으로 변환
	
	int i = 1; //초기식
	
	while(i <= 10) {
		System.out.println(i+"Hello, World!"); //반복 실행문
		i++;//증감식
	}
	
	//제어변수 i가 while문 보다 위쪽에서 선언되었으므로
	//while문 반복 종료 후에도 변수 i값에 접근 가능함
	System.out.println("while문 종료 후 값 : "+i);
	System.out.println("----------------------------------------------");
	
	//제어변수 i가 1~10까지 1씩 증가하면서  i 값 출력
	
	i = 1;
	while(i<=10) {
		System.out.print(i + " ");
		i++;
	}
	
	System.out.println();
	System.out.println("----------------------------------------------");

	//제어변수 i가 1~10까지 2씩 증가하면서 i값을 출력(홀수 출력)
	
	i = 1;
	while(i<=10) {
		System.out.print(i + " ");
		i += 2;
	}
	
	System.out.println();
	System.out.println("----------------------------------------------");
	
	i = 1;
	while(i<=10) {
		if(i%2==1) {
		System.out.println(i + " ");
		}
		i++; 
	}
	
	System.out.println("----------------------------------------------");
	
	//제어변수 i가 2~10까지 2씩 증가하면서 i값을 출력(짝수 출력)
	i = 2;
	while(i<=10) {
		System.out.println(i +" ");
		i += 2;
	}
	
	System.out.println("----------------------------------------------");

	i = 2;
	while(i<=10) {
		if(i%2==0) {
			System.out.println(i + " ");
		}
		i += 2;
	}
	
	System.out.println("----------------------------------------------");

	// 제어변수 i가 10~ 1 까지 1씩 감소하면서 i값을 출력(역순으로 출력)
	
	i = 10;
	while(i>=1) {
		System.out.println(i + " ");
		i -= 1;
	}
	
	System.out.println("----------------------------------------------");
	
	//증감식의 위치에 따라 초기식, 조건식이 바뀔 수 있다!
	
	i = 0;
	while(i<10) {
		i++;
		System.out.print(i+" ");
	
	}
	System.out.println();
	System.out.println("while 종료 후 i값 = " + i);
	
	
	
	
		
		
	}

}
