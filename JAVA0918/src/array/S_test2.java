package array;

public class S_test2 {

	public static void main(String[] args) {
		/*
		 * 배열의 최대값을 구하는 코드
		 * numbers = {3,2,14, 21, 100, 4 ,2 ,1{
		 * int max; int min; int sum ; int avg;
		 * 출력결과
		 * 최대값 :100
		 * 최소값 : 1
		 * 합계 :
		 * 평균 :
		 */
		
		int[] arr = {3,2,14,21,100,4,2,1};
		int max = arr[0];
		int min = arr[0];
		int sum = 0;


		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
			
			sum += arr[i];
			}
			double avg = (double)sum/arr.length;
		

		System.out.println("최대값 : " + max);		
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
	}//main 끝

}//test_2.class 끝
