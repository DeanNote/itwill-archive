package access_modifier;

public class test {
		private String accountNo;
		private String ownerName;
		private int balance;
		
		//-------------------------------------------------------------------
		public String getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(String accountNo) {
			this.accountNo = accountNo;
		}
		//-------------------------------------------------------------------
		public String getOwnerName() {
			return ownerName;
		}
		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
		//-------------------------------------------------------------------
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		
		

}

/*
 *Account 클래스 정의
 *- 멤버변수 (private 접근제한자로 선언)
 *	accountNo(문자열), ownerName(문자열), balance(정수)
 *- Getter/Setter 메서드 정의(단축키 사용 가능) 
 */

