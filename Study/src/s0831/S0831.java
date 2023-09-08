package s0831;

import java.util.Iterator;

public class S0831 {
	
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
		public  class soojebi {
			public static void main(String[] args) {
				B b = new B();
				b.fnA();
			}
		}
	
	
		
		
		
	}		
}	

