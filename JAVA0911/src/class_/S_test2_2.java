package class_;

public class S_test2_2 {

	public static void main(String[] args) {
		
		Account2 b = new Account2();
		b.accounNo = "1234-1234-135";
		b.ownerName = "홍길동";
		b.balance = 3000000;
		
		b.showAccountInfo();
		b.deposit(500000);
		b.withdraw(900000);
		
		int money = b.withdraw(50000000);
		System.out.println("출금된 금액 : " + money + "원");
		
	}//main 끝

}//class 끝
class Account2 {
	String accounNo;
	String ownerName;
	long balance;
	
	public void showAccountInfo(){
		System.out.println("계좌번호 : " + accounNo );
		System.out.println("예금주명 : " + ownerName );
		System.out.printf("현재잔고 : %,d원\n",balance);
		System.out.println("-----------------------------------");
	}
	
	public void deposit(int amount) {
		balance += amount;
		System.out.printf("입금하신 금액 : %,d원\n",amount);
		System.out.printf("입금 후 현재 잔고 : %,d원\n",balance);
		System.out.println("-----------------------------------");
	}

	public int withdraw(int amount) {
		if(balance<amount) {
			System.out.println("잔고가 부족하여 출금이 불가능합니다");
			System.out.printf("출금할 금액 : %,d원 현재잔고 : %,d원\n",amount,balance);
			System.out.println("-----------------------------------");
			return 0;
		} else if(balance>=amount) {
			balance -= amount;
			System.out.printf("출금할 금액 : %,d원\n",amount);
			System.out.printf("출금 후 현재 잔고 : %,d원\n",balance);
			System.out.println("-----------------------------------");
			return 1;
		} return 2;
	}

}