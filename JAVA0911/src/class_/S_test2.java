package class_;

public class S_test2 {

	public static void main(String[] args) {

		Account a = new Account();
		a.accounNo = "1234-1234-123";
		a.ownerName = "이순신";
		a.balance = 100000000000000000l;
		
		a.showAccountInfo();
		
		
	}//main끝

}//class끝

/*
 * 은행계좌(Account) 클래스 정의
 * 멤버변수
 * - 계좌번호 (accounNo, 문자열)
 * - 예금주명 (ownerName, 문자열)
 * - 현재잔고 (balance, 정수)
 * 
 * 메서드
 * - showAccountInfo()=> 리턴값없음, 매개변수 없음
 * => 계좌번호, 예금주명, 현재잔고를 출력하는 메서드 정의
 * ex) 계좌번호 : 1111-1111-111
 * 	   예금주명 : 홍길동
 *     현재잔고 : 100000원
 * 
*/

class Account {
	String accounNo;
	String ownerName;
	long balance;
	
	public void showAccountInfo(){
		System.out.println("계좌번호 : " + accounNo );
		System.out.println("예금주명 : " + ownerName );
		System.out.printf("현재잔고 : %,d원",balance);
	}
}