package test;

public class Ex3 {

	public static void main(String[] args) {

		Account account = new Account("123-45-6789", "홍길동", 10000);
		account.deposit(5000);
		System.out.println("-------------------------------------------");
		Account account2 = new Account("123-45-6789", "홍길동", 10000);
		account2.withdraw(5000);
		System.out.println("-------------------------------------------");
		Account account3 = new Account("123-45-6789", "홍길동", 10000);
		account3.withdraw(20000);
		
	}

}

class Account{
	String accountNo;
	String ownerName;
	int balance;
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금금액 : " + amount + "원 현재잔고 : " + balance + "원");
	}
	
	public void withdraw(int amount) {
		System.out.println("현재잔고 : " + balance + ", 출금금액 : " + amount);
		if(balance<amount) {
			System.out.println("잔고가 부족하여 출금할 수 없습니다.");
		}else {
			balance -= amount;
			System.out.println(amount+"원이 출금 되었습니다." + "(현재잔고 : " + balance + "원)");
		}
	}
	
	
}