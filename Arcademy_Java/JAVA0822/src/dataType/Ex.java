package dataType;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 데이터타입(Data type) = 자료형
		 *  사용할 데이터의 종류를 구분해 놓은 것
		 *  기본 데이터 타입(Primitive type = 기본형)
		 *  참조 데이터 타입(Reference type = 참조형)
		 *  
		 *  1. 기본데이터타입(8가지)
		 *  -----------------------------------------------------------------------------------
		 *         1Byte(8bit)  2Byte(16bit)  4Byte(32bit)  8Byte(64bit)
		 *  -----------------------------------------------------------------------------------
		 *  논리형 boolean
		 *  정수형 byte           short           int         long
		 *  실수형                               float       double
		 *  문자형                char
		 * -----------------------------------------------------------------------------------
		 * 
		 * <정수형 데이터타입 표현 범위>
		 * - 메모리 크기에 따라 표현 가능한 정수의 범위가 달라짐
		 * - byte  (1Byte = 8bit) : 2^8 = 256가지 = -128~127
		 *   short (2Byte = 16bit)
		 *   int   (4Byte = 32bit)
		 *   long  (8Byte = 64bit)
		 * 
		 * 
		 */
		
		// byte 타입 변수 b 선언
		// 변수 선언 방법 : 데이터타입 변수명
		
//		byte b;
		
		// byte 타입 변수 b에 정수 100 저장
		// 변수의 초기화 : 변수명 = 데이터
//		b = 100;
		
		//위의 두 문장(선언 및 초기화)을 한 문장으로 결합
		byte b = 100;

		//byte 타입 변수 b의 값을 화면에 출력
		 System.out.println(b);
		
		 b = 127;
//		 b=128; 오류발생! byte 타입에 저장 가능한 수 -128 ~ 127까지
		 b = -128;
		 
		 System.out.println(b);
		 
		 short s =128;
		 System.out.println(s);
		 
		 long l = 214748368L;
//		 i = 2147483648L;
		 
		 //실수 데이터 타입
		 double d = 3.14; //실수형 데이터타입 (double) 변수 d에 3.14 초기화
//		 float f = 3.14; //오류발생
		 
		
		
	}

}
