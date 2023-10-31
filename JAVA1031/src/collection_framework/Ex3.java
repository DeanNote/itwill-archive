package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 2. List 계열
		 * - 저장 데이터의 순서 유지 O, 중복 허용 O
		 * - 저장되는 데이터는 저장 시점에서 자동으로 인덱스가 부여됨
		 *   => 배열과 동일하게 인덱스 번호가 0번부터 시작됨
		 * - 기본적인 메서드 대부분 Set 계열과 동일(= 부모가 동일하므로)
		 *   => 단, 인덱스를 활용하는 메서드가 많음
		 * - 대표적인 구현체 클래스 : ArrayList, Vector, LinkedList 등
		 * - Collection 클래스의 메서드를 통해 List 객체의 부가적인 처리 가능
		 *   (sort 및 shuffle 기능 등 제공)
		 */
		
		List<Integer> list = new ArrayList<Integer>();
		// => ArrayList 객체에 저장되는 데이터를 정수형으로 고정
		
		list.add(1);
		list.add(2);
		list.add(3);
//		list.add(3.14); // 제네릭 타입 고정으로 인해 정수 외에 추가 불가
		
		System.out.println("list 객체가 비어있는가? " + list.isEmpty());
		System.out.println("list 객체에 저장된 요수 개수 : " + list.size());
		System.out.println("list 객체에 저장된 모든 요소 : " + list);

		System.out.println("중복 데이터 3 추가 가능한가? : " + list.add(3));
		System.out.println("list 객체에 저장된 모든 요소 : " + list);
		
		// Object get(int index) : index 에 해당하는 요소 리턴
		// => 단, 제네릭 타입을 Integer 로 지정했으므로 리턴타입 Integer
		System.out.println("1번 인덱스에 저장된 요소 : " + list.get(1));
		// 배열과 마찬가지로 존재하지 않는 인덱스 지정할 경우
		// IndexOutOfBoudsException 예외 발생
//		System.out.println("4번 인덱스에 저장된 요소 : " + list.get(4));
		
		// int indexOf(Object o) : 특정 요소가 위치한 인덱스 리턴(앞에서부터 탐색)
		System.out.println("정수 3의 인덱스 : " + list.indexOf(3));
		System.out.println("정수 3의 인덱스 : " + list.lastIndexOf(3));
		
		// Object remove(int index) : index 에 해당하는 요소 삭제 후 요소 리턴
		// => 제네릭 타입에 따라 리턴타입 변함
		// => 주의! 요소가 정수 타입일 경우 정수 데이터를 지정하면
		//    정수 데이터가 아닌 인덱스로 취급되므로
		//    정수형 요소를 지정해야하는 경우 Object 타입으로 변홚 필요
//		System.out.println("정수 2 삭제 : " + list.remove(2));
//		System.out.println("list 객체에 저장된 모든 요소 : " + list);
//		// => 2번 인덱스로 지정되서 정수 2가 아닌 인덱스의 정수 3 삭제됨
//		System.out.println("정수 2 삭제 : " + list.remove( (Object)2 ));
//		System.out.println("list 객체에 저장된 모든 요소 : " + list);
		
		// 보통, 요소를 삭제해야할 경우 indexOf() 로 탐색된 인덱스 요소 삭제
		list.remove(list.indexOf(2));
		System.out.println("list 객체에 저장된 모든 요소 : " + list);
		
		// add(int index, Object o) : 특정 인덱스에 해당 요소(o) 를 추가
		// => 기존 데이터는 뒤로 밀려남
		list.add(1, 5); // 1번 인덱스에 5 추가(기존 1번 인덱스 데이터부터 뒤로 밀림)
		System.out.println("list 객체에 저장된 모든 요소 : " + list);
		
		// set(int index, Object o) : 특정 인덱스에 해당 요소(o) 를 덮어씀
		list.set(1, 10); // 1번 인덱스에 10 추가(기존 1번 데이터 덮어씀)
		System.out.println("list 객체에 저장된 모든 요소 : " + list);
		
		// List subList(int beginIndex, int endIndex)
		// => beginIndex 부터 endIndex-1 까지 부분 리스트 추출
		List subList = list.subList(1, 3); // 1 ~ 3-1 까지 추출
		System.out.println("추출된 부분 리스트 : " + subList);
		
		System.out.println("-----------------------------------------------");
		
		
		
	}

}











