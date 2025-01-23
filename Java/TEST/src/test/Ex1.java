package test;

public class Ex1 {
	public static void main(String[] args) {
		int pee = 50000;
		int age = 16;
		
		if(age<5 || age>=65) {
			pee -= 25000;
			System.out.println("나이 : " + age + " 입장료 : " + pee);
		}else if(age>5 && age<=19) {
			pee -= 15000;
			System.out.println("나이 : " + age + " 입장료 : " + pee);
		}else {
			System.out.println("나이 : " + age + " 입장료 : " + pee);
		}
		
		
	}// main end

}// Ex end
