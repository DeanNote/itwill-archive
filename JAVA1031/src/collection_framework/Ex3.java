package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 2. List 계열
		 ex) ArrayList, Vector, LinkedList
			
		 */
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
//		list.add(3.14); // 제네릭 타입 고정!
		
		System.out.println("list 객체가 비어있는가? " + list.isEmpty());
		System.out.println("list 객체에 저장된 요소 개수 : " + list.size());
		System.out.println("list 객체에 저장된 모든 요소 : " + list);
		
		System.out.println("중복 데이터 3 추가 가능한가? : " + list.add(3));
		System.out.println("list 객체에 저장된 모든 요소 : " + list);
		
		// Object get(int index) : index에 해당하는 요소 리턴
		
	}

}
