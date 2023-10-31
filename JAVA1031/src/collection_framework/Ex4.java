package collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.standard.RequestingUserName;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 3. Map 계열
		 - key 와 value 한쌍 갖는 자료구조
		   Map.Entry 타입 객체로 관리됨
		 - 키는 중복 불가, 값은 중복 가능
		 - 대표적인 구현체 클래스 : HashSet, Properties
		 */
		
		Map map = new HashMap();
		//put(Object Key, Object value) :  key 에 해당하는 value 추가
		map.put(1, "자바");
		map.put(2, "JSP");
		map.put(3, "안드로이드");
		System.out.println(map);
		
		//키는 중복이 불가능! 존재하는 키를 지정할 경우 값을 덮어씀
//		map.put(3, "Spring framework");
		System.out.println("3을 키로 갖는 값 추가 : " + map.put(3, "Spring framework"));
		System.out.println(map);
		//키는 중복 불가 값은 중복 가능
		System.out.println();
		//키 값만 리턴
		System.out.println(map.get(2));
		
		Set Keyset = map.keySet();
		System.out.println(Keyset);
		
		// Collection values() : Map객체 내의 모든 값 리턴
//		List valueList = (List)map.values();
		List valueList = new ArrayList(map.values());
		System.out.println(valueList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
