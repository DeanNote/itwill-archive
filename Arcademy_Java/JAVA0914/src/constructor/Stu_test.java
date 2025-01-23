package constructor;

public class Stu_test {

	public static void main(String[] args) {

		Account a = new Account();
	
		a.showAccountInfo();
		
		Account b = new Account();

		b.showAccountInfo();
		
	}//main끝
	

}//test끝

/*
Account 클래스 정의
- accountNo, owerName. balance
- showAccountInfo() 메서드
인스턴스 생성시 
"Account()생성자 호출됨!" 출력
accountNo에 "111-1111-111-"출력,ownerName="홀길동".balance = 10000초기값 설정
*/
class Account {
	//멤버변수
	String accountNo;
	String owerName;
	int balance;	
	
	//생성자(없으면 자바가 만들어줌)
	//생성자 정의
	public Account() {
		System.out.println("Account()생성자 호출됨!");
		accountNo = "111-1111-111";
		owerName = "홍길동";
		balance = 10000;
	}
	
	
	//메서드
	//계좌 정보를 출력하는 showAccountInfo()메서드 정의
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo );
		System.out.println("예금주명 : " + owerName );
		System.out.println("현재잔고 : " + balance );
	}
}



