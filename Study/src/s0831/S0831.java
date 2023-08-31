package s0831;

import java.util.Iterator;

public class S0831 {
//6-110 자바 클래스 상속
	public static void main(String[] args) {
		class A{
			public void fnA() {
				System.out.println("A");
			}			
		}
		class B extends A{
			public void fnB() {
				System.out.println("B");
			}
		}
		class soojebi {
			public void main(String[] args) {
				B b = new B();
				b.fnA();
				b.fnB();
			}
		}
	
	
		
		
		
		
	}	
}
