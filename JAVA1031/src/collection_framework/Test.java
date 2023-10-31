package collection_framework;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Set<Integer> myLotto = new TreeSet<Integer>();
		Set<Integer> thisWeekLotto = new TreeSet<Integer>();
		thisWeekLotto.add(7);
		thisWeekLotto.add(8);
		thisWeekLotto.add(11);
		thisWeekLotto.add(13);
		thisWeekLotto.add(15);
		thisWeekLotto.add(23);
		System.out.println("이번주 로또 당첨 번호 : " + thisWeekLotto);
		
		Random r = new Random();
		
		while(myLotto.size() < 6) {
			myLotto.add(r.nextInt(45) + 1);
		}
		
		System.out.println("나의 로또 번호 : " + myLotto);
		
		Object[] objArr = thisWeekLotto.toArray();
		
		int count = 0;
		for(Object i : objArr) {
			if(myLotto.contains(i)) {
				count++;
			}
		}
		
		switch(count) {
			case 1:
			case 2: System.out.println("꽝!"); break;
			case 3: System.out.println("4등!"); break;
			case 4: System.out.println("3등!"); break;
			case 5: System.out.println("2등!"); break;
			case 6: System.out.println("1등!"); break;
			
			default : System.out.println("꽝!");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
