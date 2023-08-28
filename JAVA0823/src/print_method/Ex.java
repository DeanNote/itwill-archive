package print_method;

public class Ex {

	public static void main(String[] args) {
     /*
      *  print(), printf(), println()
      * System.out.XXX() 메서드 형태로 사용
      */
     
	System.out.println("Hello, World!");
	System.out.println("이민석");
	
	int age = 30;
	System.out.println("나이는 age세 입니다.");
	// age가 문자열로 취급됨
	System.out.println();
	// 줄바꿈
	System.out.println("나이는"+ age +"세입니다.");
	
	System.out.println("---------------------------");
	//"----------"출력후 줄바꿈
	
	System.out.print("Hello, World!");
	System.out.println();  //줄바꿈수행(엔터키 역할)
	System.out.print("이민석");
	System.out.println();  //줄바꿈수행(엔터키 역할)
//	System.out.print();
	// ()안에 내용을 반드시 넣어야 함! 그렇지 않으면 오류 발생
	System.out.println("---------------------------");
	
	System.out.printf("Hello, World!");
	System.out.printf("이민석");
//	System.out.printf(1);
	//The method printf(String, Object...) in the type PrintStream is not applicable for the arguments (int)
	
	System.out.println();  //줄바꿈수행(엔터키 역할)
	//형식 지정 문자를 사용한  printf () 메서드
	// %d   : 10진수 1개를 표현
	// %xd  : x자리수만큼의 자리를 차지
	// %0xd : x자리수만큼의 자리를 차지하고 빈자리를 0으로 채움
	System.out.printf("%02d",1);
	System.out.println();  //줄바꿈
	
//	System.out.println("나이는"+ age +"세입니다.");
	System.out.printf("나이는 %d세 입니다.\n", 20);
	System.out.printf("나이는 %d세 입니다.", age);
	    	
	System.out.println();  //줄바꿈
	System.out.printf("현재 시각은\n %02d시 %d분 %2d초 입니다.\n", 14,40,05);  
	System.out.printf("오늘날짜는 %d년 %d월 %d일 입니다.\n", 2023,8,23);  
	//=> %d 기호가 3개 이므로, 데이터 3개가 순서대로 대입됨.
	

//  	%f   : 실수표현
//    %.xf : 실수표현(소수점 x 자리만큼만 표시)
 
	System.out.printf("평균 나이는 %.1f 세입니다.\n",27.55);
//     %c : 문자표현
	System.out.printf("정수 65에 해당하는 문자는 %c 입니다.\n",'A');
	System.out.printf("정수 65에 해당하는 문자는 %c 입니다.\n",97);
		
//		char 타입 변수 ch 에 문자 'r' 저장
	char ch = 'r';
	System.out.printf("%c\n",ch);
	
//	%s : 문자열 표현
	String str = "아이티윌 부산교육센터";
	System.out.printf("교육기관명 : %s\n", str);
		
		
		
		

	}

}
