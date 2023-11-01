package scanner;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		if(a.isEmpty()) {
			System.out.println("이름을 입력하세요!");
		}else {
			System.out.printf("%s님 환영합니다.\n",a);
		}
		
	}

}
