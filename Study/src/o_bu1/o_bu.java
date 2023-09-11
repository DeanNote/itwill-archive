package o_bu1;

public class o_bu1 {

public static void main(String[] args) {
		import java.util.ArrayList; // 어레이리스트 사용 위해 import 함
		
		interface Observer{ // Observer 인터페이스 선언
		public void update(String msg);
		}
		class SooOb1 implements Observer { //SooOb1 클래스 선언
		public void update(String msg){ //update 메소드 구현
		System.out.println("Soojebi Observer1:" + msg); // msg 출력
		}
		}
		class SooOb2 implements Observer { //SooOb2 클래스 선언
		public void update(String msg){ //update 메소드 구현
		System.out.println("Soojebi Observer2:" + msg); // msg 출력
		}
		}
		interface Subject { // Subject 인터페이스 선언
		public void register(Observer o); // 옵저버 등록(register) 메서드
		public void remove(Observer o); // 옵저버 제거(remove) 메서드
		public void notify(String msg); // 옵저버 알림(notify) 메서드
		}
		class SoojebiData implements Subject { // SoojebiData 클래스
		private ArrayList<Observer> observers; // 옵저버 선언
		public SoojebiData(){
		observers = new ArrayList<Observer>(); //옵저버 객체 생성
		}
		public void register(Observer o){ // 옵저버 등록 구현
		observers.add(o); // 리스트 add
		}
		public void remove(Observer o){ // 옵저버 제거 구현
		observers.remove(o); // 리스트 remove
		}
		public void notify(String msg){ // 옵저버 알림 구현
		for(Observer o : observers){ // 모든 옵저버 msg 전달하여 업데이트
		o.update(msg);
		}
		}
		}
		class Soojebi{
		public static void main(String[] args){
		SoojebiData sd = new SoojebiData(); // SoojebiData 클래스의 객체 sd 선언 및 생성
		Observer o1 = new SooOb1(); // 옵저버 o1 객체 선언 및 생성
		Observer o2 = new SooOb2(); // 옵저버 o2 선언 및 생성
		sd.register(o1); //o1 등록
		sd.register(o2); //o2 등록
		sd.remove(o1); //o1 제거
		sd.notify("notify msg"); //msg 를 옵저버에 전달
		sd.remove(o2); // o2 제거
		}
		}
	}
}

