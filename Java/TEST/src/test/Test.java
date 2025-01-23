package test;

public class Test {

	public static void main(String[] args) {
		int age = 10;	
		int pee = 50000;
		
		
		if(age < 5 || age >= 65) {
			System.out.println("나이가 " + age + "세이므로 입장료는 " + pee/2 + "원입니다." );
		} else if (age >= 5 && age <= 19) {
			System.out.println("나이가 " + age + "세이므로 입장료는 " + pee*7/10 + "원입니다." );
		} else {
			System.out.println("나이가 " + age + "세이므로 입장료는 " + pee + "원입니다." );
		}

	}

}
