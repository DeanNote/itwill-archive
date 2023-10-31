package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 반복문 사용
		 */
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		
		for(int num : set) {
			System.out.println(num);
		}
		
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		Iterator<Integer> ite2 = set.iterator();
		while(ite2.hasNext()) {
			System.out.println(ite2.next());
			int num = ite2.next();
			System.out.println("set 객체에 " + num + "이 존재하는가?" + set.contains(num));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
