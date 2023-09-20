package variable_arguments;

public class Stu_test {

	public static void main(String[] args) {

		variable_arguments va = new variable_arguments();
		va.print();
		va.print(0);
		va.print(1);
		va.print(1,2,3,4,5);
		va.print(1,2,3,4,5,6,7,8,9,10);
	}

}

/*
 * 클래스명 : VariableArgumentTest
 * 정수를 0개~무한대로 전달받아 출력하는 print ()메서드 오버로딩
 * 단, 정수를 0개 전달할 경우 "전달받은 정수 없음!"출력하고
 * 1개 이상을 전달 할 경우 전달받은 정수를 출력
*/
class variable_arguments{
	public void print() {
		System.out.println("전달받은 정수 없음!");
	}
	public void print(int...nums) {
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	//위의 두 메서드를 하나로 합치면
//	public void print(int...nums) {
//		if(nums.length == 0) {
//			System.out.println("전달받은 정수 없음!");
//		}else {
//			for(int i = 0; i<nums.length; i++) {
//				System.out.print(nums[i]+" ");
//			}
//			System.out.println();
//		}
//	}
}
