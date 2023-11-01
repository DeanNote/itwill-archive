package exception;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 사용자에 의한 예외 발생(throw)
		 */
		
		try {
			printScore(111);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}//main end

	public static void printScore(int Score) throws Exception {
		if(Score < 0 || Score > 100) {
//			System.out.println(Score + "점 : 점수 입력 오류!");
			//throw 키워드를 사용
//			Exception e = new Exception("점수 입력 오류 - " + Score);
//			throw e;
			throw new Exception("점수 입력 오류 - " + Score);
		}
	}
	
}//Ex4 end

/*
사용자 정의 예외 클래스 작성
*/
 
class InvalidScoreException extends Exception {
	public InvalidScoreException(String message) {
		super(message);
	}
}
