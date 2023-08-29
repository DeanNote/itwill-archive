package if_;

public class Test3 {

	public static void main(String[] args) {
	/*  문자 ch에 대해 대문자, 소문자, 숫자 판별
	 * => 위의 모든 조건이 false일 때 "기타 문자" 출력
	 * 
	 */
	char ch = '*';
	
	if (ch>='A' && ch<='Z') {
		System.out.println(ch + " : 대문자");
		
	}else if (ch>='a' && ch<='z') {
		System.out.println(ch + " : 소문자");
		
	}else if (ch>='0' && ch<='9') {
		System.out.println(ch + "숫자");
		
	}else {
		System.out.println(ch + " : 기타문자");
		
	}
		
	System.out.println("=================================================");

	
	//문자 ch가 대문자일 때 소문자로 변환하고, 소문자일 때 대문자로 변환
	//=> 대문자, 소문자가 아닌경우"변환 불가!" 출력
	ch = 'a';
	if (ch>='A'&&ch<='Z') {
		System.out.println(ch+" : 대문자입니다.");
		ch+=32;
		System.out.println(ch+" : 소문자로 변환");
		
	}else if (ch>='a'&&ch<='z') {
		System.out.println(ch+" : 소문자 입니다.");
		ch-=32;
		System.out.println(ch+" : 대문자로 변환");
	}else {
		System.out.println("변환불가!");
	}
			
  }

}
