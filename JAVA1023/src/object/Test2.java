package object;

import java.util.Objects;

public class Test2 {

	public static void main(String[] args) {
		Account acc = new Account("111-1111-111", "홍길동", 10000);
		System.out.println("acc 의 계좌 정보 : " + acc); // acc.toString() 와 같음
		
		Account acc2 = new Account("111-1111-111", "홍길동", 10000);
		
		if(acc.equals(acc2)) {
			System.out.println("두 계좌는 동일한 계좌입니다!");
		} else {
			System.out.println("두 계좌는 다른 계좌입니다!");
		}

	}

}

/*
 * Account 클래스 정의
 * - 멤버변수 : 계좌번호(accountNo, 문자열)
 * 				예금주명(ownerName, 문자열)
 * 				현재잔고(balance, 정수)
 * - 생성자 : 계좌번호, 예금주명, 현재잔고를 전달받아 초기화
 * - equals() 메서드 오버라이딩하여 계좌정보를 비교하도록 정의
 * - toString() 메서드 오버라이딩하여 계좌정보를 문자열로 리턴하도록 정의
 */

class Account { // class Account extends Object
	String accoutNo;
	String ownerName;
	int balance;
	
	// Alt + Shift + S -> O
	public Account(String accoutNo, String ownerName, int balance) {
		super();
		this.accoutNo = accoutNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	
	// Alt + Shift + S -> H
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accoutNo, other.accoutNo) && balance == other.balance
				&& Objects.equals(ownerName, other.ownerName);
	}

	// Alt + Shift + S -> S
	@Override
	public String toString() {
		return "Account [accoutNo=" + accoutNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
	
	
}









