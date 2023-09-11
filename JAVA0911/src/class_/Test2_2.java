package class_;

public class Test2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 * 은행계좌(Account2) 클래스 정의
 * 멤버변수
 * - 계좌번호(accountNo, 문자열)
 * - 예금주명(ownerName, 문자열)
 * - 현재잔고(balance, 정수)
 * 
 * 메서드
 * - showAccountInfo() => 리턴값 없음, 매개변수 없음
 * => 계좌번호, 예금주명, 현재잔고를 출력하는 메서드 정의
 * ex) 계좌번호 : 111-1111-111
 *     예금주명 : 홍길동
 *     현재잔고 : 10000원
 *     
 * - 입금 기능을 수행하는 deposit() 메서드
 * => 입금할 금액(amount, 정수)을 전달받아 현재잔고(balance)에 누적한 후
 *    입금된 금액과 입금 후 현재잔고를 출력
 *    ex) "입금하신 금액	: XXXX원"
 *        "입금 후 현재잔고 : XXXX원"
 * => 단, 리턴값은 없음
 * 
 * - 출금 기능을 수행하는 withdraw() 메서드
 * => 출금될 금액(amount, 정수)를 전달받아 현재잔고(balance)에서 차감 후
 *    출금될 금액과 출금 후 현재잔고를 출력
 *    ex) "출금할 금액		: XXXX원"
 *        "출금 후 현재잔고 : XXXX원"
 * => 단, 출금 기능을 수행하기 전 현재잔고와 출금할 금액을 비교하여
 *    현재잔고가 출금할 금액보다 적을 경우 출금을 수행하지 않고 다음과 같이 출력
 *    ex) "잔고가 부족하여 출금이 불가능합니다."
 *        "출금할 금액 : XXXX원, 현재잔고 : XXXX원"
 * => 리턴값 있음(출금할 금액에 해당하는 금액 리턴)
 *        
 * 
 */










