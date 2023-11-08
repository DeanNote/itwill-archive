package lambda;

public class Test {

	public static void main(String[] args) {
		/*
		 * 문자열을 입력받아 두 문자열을 연결하여 출력하는 프로글매 정의
		 * 람다식을 사용하여 구현
		 * ex) hello 와 World를 매개변수값으로 전달하면 
		 * 	  "Hello, World"가 출력
		 * 
		 */
		Word word = new AddWord();
		System.out.println(word.getWord("자", "바"));
		Word word2 = (x, y) -> {return x + ", "+ y;};
		System.out.println(word2.getWord("Hello", "World!"));
		
	}

}

@FunctionalInterface
interface Word{
	String getWord(String word1, String word2);
}

class AddWord implements Word{

	@Override
	public String getWord(String word1, String word2) {
		String result = word1 + ", " + word2;
		return result;
	}
	
}
