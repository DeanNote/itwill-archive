package constructor;

public class Test {

	public static void main(String[] args) {
		// Account 인스턴스 생성		
		Account0914 acc = new Account0914();
		
//		acc.accountNo = "111-1111-111";
//		acc.ownerName = "홍길동";
//		acc.balance = 10000;
		
		acc.showAccountInfo();
		
		Account0914 acc2 = new Account0914();
		acc2.showAccountInfo();

	}

}

/*
 * Account 클래스 정의
 * - accountNo, ownerName, balance
 * - 인스턴스 생성 시
 *   "Account() 생성자 호출됨!" 출력
 *   accountNo 에 "111-1111-111", ownerName = "홍길동", balance = 10000
 *   초기값 설정
 * 
 * - showAccountInfo() 메서드 : 계좌번호, 예금주명, 현재잔고 출력 
 *   계좌번호 : 111-1111-1111
 *   예금주명 : 홍길동
 *   현재잔고 : 10000원
 */

class Account0914 {
	// 멤버변수
	String accountNo;
	String ownerName;
	int balance;
 
//	public Account() {} // 기본 생성자
	
	// 생성자 정의
	public Account0914() {
		System.out.println("Account() 생성자 호출됨!");
		
		// 인스턴스 생성 시 기본값으로 가져야할 데이터를 멤버변수 저장
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 10000;
	}
	
	// 메서드 정의
	// 계좌 정보를 출력하는 showAccountInfo() 메서드 정의
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
}











