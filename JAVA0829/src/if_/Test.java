package if_;

public class Test {

	public static void main(String[] args) {
		//" 아이티윌로 걸어서 출발" 출력
		//  money 변수 선언, 초기값 2000(원)
		//  혜진씨가 돈이 5천원 이상 있다면 "택시타고 가기!" 출력
		//  만약 돈이 5천원 미만 이라면 "버스타고 가기!" 출력
		// "아이티윌에 도착" 출력
		System.out.println("아이티윌로 걸어서 출발");
		int money = 2000;
		if (money>=5000) {
			System.out.println("택시타고 가기!");
							
		}
		System.out.println("버스타고 가기!");
		System.out.println("아이티윌 도착");
	
		System.out.println("--------------------------------------------");
		
		//if문 조건식에 비교연산자, 논리연산자 등을 조합하여 사용
		// 1.나이(age)를 입력받아 (변수 초기화) 20인지를 판별
		// => 20대란? age가 20 이상이고 age가 29 이하인것
		// if문을 사용하여 나이가 20대일 경우 "당신은 20대 입니다!"출력
		
		int age =30;
		if (age>=20 && age<=29) {
			System.out.println("당신은 20대 입니다.");
						
		}
		System.out.println(age>=20 && age<=29 ? "":"당신은 20대가 아닙니다.");
		
		
		
		
		System.out.println("--------------------------------------------");
		
		/*
		 * 2.나이(age)를 입력받아 놀이동산 무료입장 여부 판별
		 * =>무료입장 대상 : age 5 미만 65이상
		 * if문을 사용하여 조건에 만족할 경우 "무료 입장 대상입니다!."출력
		 */
		
		int age2 = 7;
		if (age2<5 || age2>=65) {
			System.out.println("무료 입장 대상입니다!");
			
		}
		
		System.out.println(age2<5 || age2>=65 ? "":"무료 입장 대상자가 아닙니다.");
		
		
	}

}
