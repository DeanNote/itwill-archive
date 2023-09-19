package array_;

public class Stu_test4 {

	public static void main(String[] args) {
		/*
		 * 정수를 저장하는 2차원 배열 array를 생성
		 * 0행 : 95, 86
		 * 1행 : 83, 92, 96
		 * 2행 : 78, 83, 93, 87, 88 로 초기화
		 * 
		 * 모든 정수를 더한값 sum과 평균값 avg를 구하고 출력!
		 */
		
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum = 0;
		double avg = 0;
		int count = 0;		
		
		for(int i = 0; i< array.length; i++) {
			for(int j = 0; j< array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = (double)sum/count;
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}

}
