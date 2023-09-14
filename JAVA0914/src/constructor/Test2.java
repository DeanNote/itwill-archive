package constructor;

public class Test2 {
	public static void main(String[] args) {
		
		Account2 a = new Account2();
		a.accountNo ="122-112222-22";
		a.ownerName ="홍길동";
		a.balance = 5263;
		a.showPersonInfo();
		
	}//main 끝
	
	
}//test2 끝

/*
 * Account 클래스
 * - accountNo ownerName, balane
 * - 파라미터 생성자 생성
 *  1) 기본생성자(111-1111-111,홍길동,0) 
 *  2) 계좌번호를 파라미터로 전달받고 (홍길동,0)으로 초기화하는 생성자
 *  3) 계좌번호, 예금주 명을 파라미터로 전달받고 현재 잔고는 (0)으로 초기화하는 생성자
 *  4) 계좌번호, 예금주명, 현재잔고를 파라미터로 전달받아 초기화 하는 생성자
        Alt + Shift + S + O
        showAccountInfo() 메서드 정의
 */

class Account2{
	String accountNo;
	String ownerName;
	int balance ;
	
	public void Account(){
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 0;
	}
	public void Account(String a, String b){
		accountNo = "a";
		ownerName = "b";
		balance = 0;
	}
	public void Account(String a, String b, int c){
		accountNo = "a";
		ownerName = "b";
		balance = c;
	}
	
	public void showPersonInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
	
}