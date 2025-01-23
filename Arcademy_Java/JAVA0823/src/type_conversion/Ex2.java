package type_conversion;

public class Ex2 {
	public static void main(String[] args) {
		/* char 타입과 byte&short 타입 간의 관계
		 * byte 타입(1Byte = 8bit) : -128 ~ +127
		 * short 타입(2Byte = 16bit) : -32768 ~ +32767
		 * char 타입(2Byte = 16bit) : 0 ~ +65535
		 * char 타입의 경우 문자 표현을 위해 양수로만 표현하므로
		 * byte 타입과 short타입은 음수까지 표현 범위가 크다
		*/
		
		byte b =100;
		short s = 65;
		
		char ch;
		
//		ch = b; 오류발생! byte<->char 명시적(강제형변환)필수!
		ch = (char)b; //char 타입으로 강제형변환
		System.out.println(ch);		
		
//		char 타입 -> byte 타입으로 변환
//		b = ch; 오류발생! byte<->char 명시적(강제형변환)필수!
		b = (byte)ch; //byte 타입으로 강제형변환
		System.out.println(b);		
		
		System.out.println("------------------------------------------");

		// short 타입 -> char 타입으로 변환
//		ch = s; 오류발생! short<-> char 명시적 형변환 필수
		ch = (char)s;//char 타입으로 강제 형변환
		System.out.println(ch);		
       
		// char 타입 -> short타입
//		s = ch;
		s =(short)ch;//short 타입으로 강제 형변환
		System.out.println(s);		
		
//		int형 타입은 char 타입 데이터를 온전히 담을 수 있다.
//		int형 변수i에 변수ch값 저장
		int i = ch; // char < int
		System.out.println(i);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
