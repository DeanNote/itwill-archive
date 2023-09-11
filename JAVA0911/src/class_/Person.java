package class_;

public class Person {

		String name;
		int age;
		boolean isHungry;
		
		public void eat(String menu) {
			System.out.println(menu + "먹기!");
			isHungry = false;
		}
	
		public void talk() {
			System.out.println("말하기!");
			isHungry = true;

		}
}
