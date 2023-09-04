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
	}

}
