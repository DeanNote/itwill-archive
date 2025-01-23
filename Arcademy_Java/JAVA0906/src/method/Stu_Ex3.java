package method;

public class Stu_Ex3 {

	public static void main(String[] args) {
		//5. 파라미터 2개 이상 메서드 호출
		String snack = "에이스";
		int myMoney = 1000;
		System.out.println("동생아! 에이스랑 1000원 줄테니 몽쉘통통으로 바꿔와라!");
		String mySnack = sister_5(1000, "에이스");
		System.out.println("동생이 바꿔준 과자는 : " + mySnack);
		// 호출하는 순서에 따라 정의 되어야 함
		
	
	
	}//main 끝
	public static String sister_5(int money, String snack) { // 호출하는 순서에 따라 정의되어야 함 int String
		System.out.println("오빠가 준 과자 : " + snack);
		System.out.println("오빠가 준 돈 : " + money);
		System.out.println(snack + "를 몽쉘통통으로 교환했다!");
		snack = "몽쉘통통";
		return snack;
	}
	
	
}//class 끝
