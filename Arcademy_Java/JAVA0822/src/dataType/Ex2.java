package dataType;

public class Ex2 {

	public static void main(String[] args) {
		
		int num = 10;
		System.out.println(num);
	
		num = 0b1010;
		System.out.println(num);
	   
//		num = 0b1012;  오류발생!
		
//		3. 8진수 : 0~7 사이의 숫자만 사용, 접두사 0
		num=012; // 8진수 -> 10진수로 변환하여 저장됨
		System.out.println(num);
//	    num=018; 오류발생! 8 사용불가
		
//		4. 16진수 : 0~9 사이의 숫자와 A~F 사이의 알파벳 사용 (0~15)
//		                   접두사 0x 붙임
       num=0xA;
       num=0xa;//16진수에서는 알파벳 대소문자 구문x
       System.out.println(num);
       
//       num=0xgG; 오류발생! A~F까지만 사용가능
	
	
	
	
	
	
	
	
	
	
	}

}
