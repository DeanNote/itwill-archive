package array;

public class S_test {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
//		arr[4] = 5; 초기화 하지 않을 경우 0으로 자동 초기화 됨
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번 인덱스 데이터 : " + arr[i]);
		}
		
		System.out.println("===========================================");
		
		// boolean 타입 배열 3개 생성하고
		// 임의의 boolean 타입 데이터 초기화 후 출력
		// 2번 인덱스만 true 값으로 초기화
		
		boolean[] arr2 = new boolean[3];
		arr2[2] = true;

		for(int i = 0; i < arr2.length; i++) {
			System.out.println(i + "번 인덱스 데이터 : " + arr2[i]);
		}
		
		System.out.println("===========================================");
		
		// String 타입 배열 3개를 생성하고
		// 0 번 홍길동 1번 이순신 문자열로 초기화 한 후 출력
		
		String[] arr3 = new String[3];
		arr3[0] = "홍길동";
		arr3[1] = "이순신";
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(i + "번 인덱스 데이터 : " + arr3[i]);
		}
		
		System.out.println("===========================================");
		
		double[] arr4 = new double[5];
		arr4[0] = 0.1;
		arr4[1] = 0.2;
		arr4[2] = 0.3;
		arr4[3] = 0.4;
//    	arr4[4]
		for(int i = 0; i < arr4.length; i++) {
			System.out.println(i + "번 인덱스 데이터 : " + arr4[i]);
		}
		
		System.out.println("===========================================");
		
		// double 타입 데이터 5개를 저장하는 배열 생성 후
		// 임의의 4개의 실수로 초기화 후 전체 데이터 차례대로 출력
		// 단, 마지막 인덱스 번호는 값을 비워둔다
		
		
		
		
	}

}
