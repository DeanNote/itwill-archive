package collection_framework;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		/*
		 * Set 계열 객체를 활용하여 로또 번호 생성기 작성(정렬은 선택)
		 * 1. Set 타입 객체 myLotto 생성
		 * 2. 1 ~ 45 사이의 중복되지 않는 난수(로또번호) 6개를 Set 객체에 저장
		 *    => ex) "나의 로또 번호 : 1 10 11 15 23 41 43" 출력
		 * --------------------------------------------------------------------
		 * 
		 */
		
		// 1. Set 타입 객체 myLotto 생성
		Set<Integer> myLotto = new TreeSet<Integer>();
		
		// 2. 1 ~ 45 사이의 중복되지 않는 난수(로또번호) 6개를 Set 객체에 저장
		// => 1) for문 사용 시 중복을 허용하지 않으므로 중복이 발생하면
		//       저장 없이 반복 횟수만 증가함
		//       따라서, 중복이 발생했을 시 제어변수의 반복횟수의 조정이 필요
		// => 2) while문 사용 시 Set 계열의 메서드를 사용하여 6개의 번호가 
		//       만들어지지 않으면 계속 반복하도록 설정
		// => 난수는 Random 클래스를 활용
		
		// Random 클래스의 메서드를 사용하기 위해 인스턴스 생성
		Random r = new Random();
		
//		for(int i = 1; i <= 6; i++) {
//			int rNum = r.nextInt(45) + 1;
//			// => int rNum = (int)(Math.random() * 45 +1);
//			
//			if(myLotto.contains(rNum)) {
//				System.out.println("중복되는 번호 발생! - " + rNum);
//				// 중복 번호가 발생했으므로 카운팅을 하지 않도록 i 값을 1감소
//				i--;
//			} else {
//				myLotto.add(rNum);
//			}
//			
//			// ----------------------------------------------------
//			
////			if( !(myLotto.add(rNum)) ) {
////				System.out.println("중복되는 번호 발생! - " + rNum);
////				i--;
////			} else {
////				myLotto.add(rNum);
////			}
//		}
		
//		for(; myLotto.size() < 6;) {
//			myLotto.add(r.nextInt(45) + 1);
//		}
		
		while(myLotto.size() < 6) {
			myLotto.add(r.nextInt(45) + 1);
		}
		
		System.out.println("나의 로또 번호 : " + myLotto);
		

	}

}
