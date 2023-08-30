package switch_;

public class Stu_Ex2 {

	public static void main(String[] args) {
		/*
		 * 입력받은 월(month)이 다음과 같을 때 월의 일수 출력
		 * - 1, 3, 5, 7, 8, 10, 12월일 경우 : "한달은 31일" 출력
		 * - 4, 6, 9, 11월일 경우: "한달은 30일"출력
		 * - 2월일 경우 : "한달은 28일"출력 '
		 * 윤달<4로 나눠 떨어지는 것들에 100으로 나누어 떨어지면 윤달에서 빼고 400으로 나누어 나머지가 0인 것들?? 어려우니까 그냥 하자 하심>
		 */
		int month = 1;
		switch(month) {
			case 1 : System.out.println(month+ "월 한달은 31일"); break;
			case 3 : System.out.println(month+ "월 한달은 31일"); break;
			case 5 : System.out.println(month+ "월 한달은 31일"); break;
			case 7 : System.out.println(month+ "월 한달은 31일"); break;
			case 8 : System.out.println(month+ "월 한달은 31일"); break;
			case 10 : System.out.println(month+ "월 한달은 31일"); break;
			case 12 : System.out.println(month+ "월 한달은 31일"); break;
		
			case 4 : System.out.println(month+ "월 한달은 30일"); break;
			case 6 : System.out.println(month+ "월 한달은 30일"); break;
			case 9 : System.out.println(month+ "월 한달은 30일"); break;
			case 11 : System.out.println(month+ "월 한달은 30일"); break;
		
			case 2 : System.out.println(month+ "월 한달은 28일"); break;
		
		}
		System.out.println("-----------------------------------------------------");

		month = 8;
		switch(month) {
			case 1 : // 결과값이 1, 3, 5, 7, 8, 10 ,12일 때
			case 3 : // 모든 case 문에서 "한달은 31일" 문자열을 출력하는데
			case 5 : // 출력문이 중복이므로
			case 7 : // 각 case문에서 모두 출력하지 않고
			case 8 : // 마지막 case 문에서만 출력하고 나머지는 비워두면
			case 10 :// break 문이 없으므로 12월까지 내려가서 출력문을 수행
			case 12 :System.out.println(month+ "월 한달은 31일"); break;
			case 4 : // 결과값이 4, 6, 9, 11 일때 출력문이 중복되므로 마지막 11월에서만 출력문을 실행하면 된다
			case 6 : 
			case 9 : 
			case 11 :System.out.println(month+ "월 한달은 30일"); break;
			case 2 : System.out.println(month+ "월 한달은 28일"); break;
		}
//		switch(month) {
//		case 1 : case 3 : case 5 :case 7 :case 8 :case 10 :
//		case 12 :System.out.println(month+ "월 한달은 31일"); break;
//		원래 이렇게 표기
		
		
		
		
		
		
		
		
		
		
		
	}

}
