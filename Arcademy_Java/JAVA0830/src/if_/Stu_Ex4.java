package if_;

public class Stu_Ex4 {

	public static void main(String[] args) {
		/* 5교시 
		 * 중첩 if 문
		 * test3 마지막 문제 변형
		 */
		
//		int score = 150;
//		String grade = "";
//		
		//입력받은 점수가 -~100사이일 경우 "점수 입력 완료!" 출력하고
		//아니면 "점수 입력 오류!" 출력
//		if (score>=0 && score<=100) {
//			System.out.println("점수 입력 완료!");
//			
//			if (score>=90 && score<=100) {
//				grade = "A"; 
//			}else if (score>=80 && score<89) {
//				grade = "B"; 
//			}else if (score>=70 && score<=79) {
//				grade = "C";
//			}else if (score>=60 && score<=69) {
//				grade = "D"; 
//			}else if (score>=0 && score<=59) {
//				grade = "F"; 
//			}
//			System.out.println(score + "점의 학점 : " + grade);	
//			
//		}else {
//			System.out.println("점수 입력 오류!");
//		}
//		
//		System.out.println("--------------------------------------------");

		
		int score = 70;
		String grade = "";
		
		if (score>=0 && score<=100) {
			System.out.println("점수 입력 완료!");
			
			if (score>=90) { //90 이상일 때 자동으로 100 이하가 적용됨 
				grade = "A"; 
			}else if (score>=80) { 
				// 위의 조건이 거짓이면 자동으로 89 이하(80 ~ 89)
				grade = "B"; 
			}else if (score>=70 && score<=79) {
				// 위의 조건이 거짓이면 자동으로 79 이하(70 ~ 79)
				grade = "C";
			}else if (score>=60 && score<=69) {
				// 위의 조건이 거짓이면 자동으로 69 이하(60 ~ 69)
				grade = "D"; 
			}else  {
				// 위의 조건이 거짓이면 자동으로 59 이하(0 ~ 59)
				// 이미 첫 번째 if문의 조건식에서 0~100사이 점수만 입력
				// 가능하므로 0이상 59이하의 점수만 입력
				grade = "F"; 
			}
			System.out.println(score + "점의 학점 : " + grade);	
			
		}else {
			System.out.println("점수 입력 오류!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
