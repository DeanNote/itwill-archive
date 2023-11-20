package thread;

public class Test2 {

	public static void main(String[] args) {
		//
		SendMessage sm = new SendMessage("안녕하세요", 100);
		FileTransfer ft = new FileTransfer("a.java",1000);
		
		// 파일 전송을 먼저 시작한 후 메세지를 전송한다고 가정
//		ft.run();
//		sm.run();
		
		//==========================================================
		// 2, 멀티 쓰레드로 구현한 경우
		SendMessageMultiThread smm = new SendMessageMultiThread("＠메세지", 100);
		FileTransferMultiThred ftm = new FileTransferMultiThred("★파일", 100);
		ReceiveMessageMultiThread rmmt = new ReceiveMessageMultiThread("◆반갑",100);
		
		smm.start();
		ftm.start();
//		rmmt.start();
		
		Thread t = new Thread(rmmt);
		t.start();
		
		
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

class SendMessage {
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


/*
파일 전송 클래스
1. 싱글 쓰레드로 구현
- class명 : FileTransfer
 */

class FileTransfer {
	String fileName;
	int count;
	public FileTransfer(String fileName, int count) {
		super();
		this.fileName = fileName;
		this.count = count;
	}
	public void run() {
		//count 횟수만큼 fileName 문자열을 화면에 출력하는 반복문 작성
		//파일 전송 - 1 : a.java
		for(int i = 1; i <= count; i++) {
			System.out.println("파일전송 - " + i + " : " + fileName);
		}
	}
	
}

class SendMessageMultiThread extends Thread{
	String msg;
	int count;
	public SendMessageMultiThread(String msg, int count) {
		super();
		this.msg = msg;
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= count; i++) {
			System.out.println("파일전송 - " + i + " : " + msg);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
			
		}
	}
}

class FileTransferMultiThred extends Thread{
	String filename;
	int count;
	public FileTransferMultiThred(String filename, int count) {
		super();
		this.filename = filename;
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= count; i++) {
			System.out.println("파일전송 - " + i + " : " + filename);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
			
		}
	}
}

class ReceiveMessageMultiThread implements Runnable {
	String msg;
	int count;
	
	public ReceiveMessageMultiThread(String msg, int count) {
		super();
		this.msg = msg;
		this.count = count;
	}
	
	public void run() {
		for(int i = 1; i <= count; i++) {
			System.out.println("메세지 수신 - " + i + " : " + msg);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
			
		}
	}
	
}



















