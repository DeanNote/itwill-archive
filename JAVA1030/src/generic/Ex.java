package generic;

public class Ex {

	public static void main(String[] args) {

		NormalIntegetClass nic = new NormalIntegetClass();
		
		nic.data = 10;
//		nic.data = 3.14;
//		nic.data = "홍길동";
		
		NormalObjectClass noc = new NormalObjectClass();
		
		noc.data = 10;
		noc.data = 3.14;
		noc.data = "홍길동";
		
	}//메인 끝

}//EX 끝

class NormalIntegetClass{
	int data;// data 변수에는 정수형 데이터만 저장 가능함

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}

class NormalObjectClass{
	Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}