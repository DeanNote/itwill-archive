package access_modifier;

public class test {
	
	public static void main(String[] args) {
		
		
	}

}

/*
 *Account 클래스 정의
 *- 멤버변수 (private 접근제한자로 선언)
 *	accountNo(문자열), ownerName(문자열), balance(정수)
 *- Getter/Setter 메서드 정의(단축키 사용 가능) 
 */

class Account{
	// Account 클레스의 멤버변수 private 접근제한자로 선언
	private String accountNo;
	private String ownerName;
	private int balance;
	
	//-------------------------------------------------------------------
	// 1. String owerName 변수에 대한 Getter/Setter
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String newAccountNo) {
		this.accountNo = newAccountNo;
	}
	//-------------------------------------------------------------------
	// 2. String owerName 변수에 대한 Getter/Setter
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String newOwnerName) {
		this.ownerName = newOwnerName;
	}
	//-------------------------------------------------------------------
	// 3. int balance 변수에 대한 Getter/Setter

	public int getBalance() {
		return balance;
	}
	public void setBalance(int newBalance) {
		this.balance = newBalance;
	}
}
