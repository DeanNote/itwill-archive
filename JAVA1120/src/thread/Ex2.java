package thread;

public class Ex2 {
	
	public static void main(String[] args) {
		MyThread myThread1 = new MyThread("★A작업★", 100);
		MyThread myThread2 = new MyThread("○B작업○", 50);
		MyThread myThread3 = new MyThread("→C작업←", 100);
		
		Thread t = new MyThread("→C작업←", 1000000);//업캐스팅
		
		// 멀티 쓰레딩 코드 실행(쓰레드 시작)
		// => run()메서드를 직접 호출 시
		myThread1.run();
		myThread2.run();
		myThread3.run();
		// 반드시 run()메서드가 아닌 start()메서드를 호출해야함
		myThread1.start();
		myThread2.start();
		myThread3.start();
		
		
		
	}


}

// Thread 클래스를 상속 받는 서브클래스를 정의하는 방법
class MyThread extends Thread{
	String name;
	int count;
	
	public MyThread(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}

	@Override
	public void run() {
		for(int i = 1; i <= count; i++) {
			System.out.println(name + " : " + i);
		}
	}
	
	
	
}