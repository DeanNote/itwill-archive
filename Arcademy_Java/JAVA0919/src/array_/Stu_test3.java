package array_;

public class Stu_test3 {

	public static void main(String[] args) {
		/*
		 * 거스름돈을 몇 개의 동전으로 지불할 수 있는지 계산하는 문제
		 * 변수 money의 금액을 동전으로 바꾸었을 때
		 * 각각 몇 개의 동전이 필요핮니 계산해서 출력해보자
		 * 단, 가능한 한 적은 수의 동전으로 거슬러 주어야 한다!
		 * (힌트) 나눗셈 연산자와 나머지 연산자를 사용
		 * 
		 * [출력 예시]
		 * money = 2680;
		 * 500원 = 5개
		 * 100원 = 1개
		 * 50원 = 1개
		 * 10원 = 3개
		 * 
		 * 
		 */
		
		int money  = 2680;
		int[] moneyChange = {500,100,50,10};
			System.out.println("money는" + money + "원");
			
		for(int i = 0; i < moneyChange.length; i++) {
			int jandon = money/moneyChange[i];
			money -= jandon*moneyChange[i];
			System.out.println(moneyChange[i]+"원 "+jandon+"개");
		}
		
		
	}

}
