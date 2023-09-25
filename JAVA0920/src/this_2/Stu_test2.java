package this_2;
// 9/25(월)
public class Stu_test2 {

	public static void main(String[] args) {

		Account acc = new Account();
		System.out.printf("%s %s %d\n",acc.accountNo,acc.ownerName,acc.balance);
		
		Account acc2 = new Account("333-3333-333");
		System.out.printf("%s %s %d\n",acc2.accountNo,acc2.ownerName,acc2.balance);
		
		Account acc3 = new Account("333-3333-333","최우식");
		System.out.printf("%s %s %d\n",acc3.accountNo,acc3.ownerName,acc3.balance);
	
		Account acc4 = new Account("333-3333-333","최우식",159000);
		System.out.printf("%s %s %d\n",acc4.accountNo,acc4.ownerName,acc4.balance);
		acc4.showAccountInfo();
		
	}
		
}


/*
Account 클래스 생성
- 멤버변수 : accountNo, ownerName, balance 선언
- 생성자 오버로딩(래퍼런스 this와 생성자 this() 활용)
1) 기본 생성자 ("11-1111-111", "홍길동", 0)
2) 계좌번호를 전달받아 초기화하는 생성자
3) 계좌번호, 예금주 명을 전달받아 초기화하는 생성자
4) 계좌번호, 예금주명, 현재잔고를 전달받아 초기화하는 생성자
 	-> 초기화 작업을 수행하는 생성자
- showAccountInfo()메서드 정의 -> 계좌번호, 예금주명, 현재잔고 출력

*/
class Account{
	String accountNo;
	String ownerName;
	int balance;
	
	public Account() {
		this("11-1111-111", "홍길동", 0);
	}
	
	public Account(String accountNo) {
		this(accountNo,"홍길동", 0);
	}
	
	public Account(String accountNo, String ownerName) {
		this(accountNo,ownerName, 0);
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
	
	
}