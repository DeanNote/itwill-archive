package for_;

public class Stu_Test2 {

	public static void main(String[] args) {
		// 정수 1~100까지의 합을 누적변수 total에 누적 후 출력
		// 누적변수 선언 및 초기화
		// for문
		// 누적변수 출력
		int total = 0;
		for(int i = 1; i<=100; i++) {
			total += i; // total = total + i
		}
		System.out.println(total);
		System.out.println("------------------------------------");
		
		//1~10까지 1씩 증가하면서, 정수 중 짝수의 합만 계산
		//누적 변수 선언 및 초기화
		//forans
		//힌트) for문 내에서 짝수인지 판별
		
		int sum = 0;
		for(int i=1; i<=10; i++){
			if(i%2==0){
				sum = sum + i;
			}
	    }
		System.out.println("짝수 합의 값은 : " + sum);

		System.out.println("------------------------------------");
		
		sum = 0;
		for(int i = 0; i<=10; i++) {
			if(i%2==1) {
				sum = sum + i;
			}
		}
		System.out.println("홀수 합의 값은 : " + sum);
		
		System.out.println("------------------------------------");

		
		
		
	}
}
