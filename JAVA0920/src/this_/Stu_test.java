package this_;

public class Stu_test {

	public static void main(String[] args) {

		Account a = new Account();
		a.setAccountNo("443212312312");
		a.setOwnerName("김종국");
		a.setBalance(9999999);
		a.showAccountInfo();
		
	}

}

/*
 * Account 클래스 생성
 * - 멤버 변수 : accountNo, ownerName, balance 선언 (private 접근 제한자 사용)
 * - 파라미터 3개를 전달받아 초기화 하는 파라미터 생성자 정의
 * - Getter/Setter 메서드 정의
 * - showAccountInfo()메서드 정의 -> 계좌번호, 예금주명, 현재잔고 출력
 */
class Account{
	private String accountNo;
	private String ownerName;
	private int balance;
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void showAccountInfo(){
		System.out.println("계좌번호 " + accountNo);
		System.out.println("예금주명 " + ownerName);
		System.out.println("현재잔고 " + balance);
	}
	
	
}