package anonymous;

public class Ex3 {

	public static void main(String[] args) {

		Window w = new Window();
		w.button1.touch();
		w.button2.touch();
		
	}// main end

}//Ex3 end

class Button{
	static interface OnClickListener{
		void onClick();
	}
	
	OnClickListener listener;
	
	public void setOnClickListener(OnClickListener listener) {
		//매개 변수의 다형성
		this.listener = listener;
	}
	
	public void touch() {
		listener.onClick();
	}
	
}

//window 클래스 선언
class Window{
	//버튼 2개 생성
	Button button1 = new Button();
	Button button2 = new Button();
	
	//필드 초기값을 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.!");
		}
	};
	
	//생성자 정의
	public Window() {
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
}




