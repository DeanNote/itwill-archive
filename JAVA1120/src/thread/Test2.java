package thread;

public class Test2 {

	public static void main(String[] args) {
		//
	}

}

//--

/*
메세지 전송 클래스
1. 싱글쓰레드로 구현
- class 명 : SendMessage
- 멤버변수 : 메세지(msg,문자열), 카운트(count,정수형)
- 파라미터 생성자 (String, int)
- run() 메서드 : 리턴값 없음, 파라미터 없음, count 만큼 msg 출력
  ex) 메세지 전송 -1 : 안녕하세요
      메세지 전송 -2 : 안녕하세요
      
 */

class SendMessage{
	String msg; //메세지 저장 변수
	int count; // 카운트 저장 변수
	
	public SendMessage(String msg, int count) {
		super();
		this.msg = msg;
		this.count = count;
	}
	
	public void run() {
		for(int i = 1; i <= count; i++) {
			System.out.println("메세지 전송 - " + i + " : " + msg);
		}
	}
}

class SendFile