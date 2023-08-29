package if_;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("아이티윌로 걸어서 출발");
		int money = 2000;
		if (money>=5000) {
			System.out.println("택시타고 가기!");
		} else {
			System.out.println("버스타고 가기!");	
		}
		System.out.println("아이티윌 도착");
	
		System.out.println("--------------------------------------------");
		
		int age =30;
		if (age>=20 && age<=29) {
			System.out.println("당신은 20대 입니다.");
		} else {
			System.out.println("당신은 20대가 아닙니다.");	
		}
		
		System.out.println("--------------------------------------------");
		
		int age2 = 7;
		if (age2<5 || age2>=65) {
			System.out.println("무료 입장 대상입니다!");
			
		}else {
			System.out.println("무료 입장 대상자가 아닙니다.");
		}
		System.out.println("--------------------------------------------");

		// 문자 ch가 대문자일 때 "대문자!" 출력, 아니면 "대문자 아님!"출력
		//=> 대문자란? 'A'(65)이상이고 'Z'(90) 이하인 문자
		
		char ch ='B';
		if (ch>=65 && ch<=90) {
			System.out.println(ch +"는 대문자");
		} else {
			System.out.println(ch +"는 대문자 아님");
		}
		System.out.println("--------------------------------------------");
		// 문자 ch가 소문자 일 때 "소문자!"를 출력하고 대문자로 변환 후 출력
		//아니면, "소문자 아님!" 출력
		// => 소문자란? 'a'(97)이상이고 'z'(122)이하인 문자
		// => 대문자란? 'A'(65)이상이고 'Z'(90) 이하인 문자
		
		char ch2 ='b';
		if (ch2>='a' && ch2<='z') {
			System.out.println((char)(ch2-32));
		}else {
			System.out.println(ch2 + " : 소문자 아님");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

