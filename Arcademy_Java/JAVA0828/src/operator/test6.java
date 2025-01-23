package operator;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		// 나이(age) 변수 선언
		// age가 10살 이상이고 19살 이하를 연산자로 표현 
		// age가 5세 미만이거나 65세 이상을 연산자로 표현
		
		int age;
		    age = 20;
		System.out.println((age>=10)&&(age<=19));
		System.out.println((age<5)||(age>=65));
		
	}

}
