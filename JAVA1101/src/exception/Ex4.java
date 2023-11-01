package exception;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 사용자에 의한 예외 발생(throw)
		 */
	}//main end

	public static void printScor(int Score) {
		if(Score < 0 || Score > 100) {
			System.out.println(Score + "점 : 점수 입력 오류!");
		}
	}
	
}//Ex4 end
