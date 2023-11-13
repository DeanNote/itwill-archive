package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Ex4 {

	public static void main(String[] args) {
		//람다식 응용
		String[] str = {"this", "is", "java", "world"};
		System.out.println(Arrays.toString(str));
		
		Arrays.sort(str);
		// 오름 차순 정렬 후 : [is, java, this, world]
		System.out.println(Arrays.toString(str));
		
		/*
		 새로운 정렬 기능을 만들려면?
		 - 내부적으로 Comparator 의 compare() 메서드를 사용
		   새로운 정렬 기능을 만들고 Arrays.sort()에 전달을 하면 됨
		   -> 자바에서는 함수만 전달할 수 있는 방법이 없다!
		      따라서, 해당 기능을 가지는 객체를 전달해야 한다.
		      일회용으로 정렬 기능을 작성하려면? (익명 내부 클래스 활용)
		 */
		
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// -1을 곱해서 내림차순으로 정렬한다.
				return  o1.compareTo(o2) * -1;
			}
		});
		// 내림차순 정렬 후 : [world, this, java, is]
		System.out.println(Arrays.toString(str));
		
	}

}
