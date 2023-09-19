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
		System.out.println("=================================================================");
		
		String[] names = {"홍길동","이순신","강감찬","조혜진","이민석"};
		int[][] score = {
				{80,70,80},
				{90,90,90},
				{50,60,77},
				{100,100,100},
				{80,80,60}
		};	
			System.out.println("    <학생 점수표>");
			System.out.printf("        %s %s %s\n","국어","영어","수학");
			for(int i = 0; i < score.length; i++) {
				System.out.print(names[i] + " ");
				for(int j = 0; j < score[i].length; j++) {
//					System.out.print(score[i][j] + " ");
					System.out.printf(" %3d ",score[i][j]);
				}
				System.out.println();
			}
		
			System.out.println("=====================");
			
			int[] studentTotal = new int[5];
			
			
			int total = 0;
			for(int i = 0; i < score.length; i++) {
				System.out.print(names[i] + " : ");
				for(int j = 0; j < score[i].length; j++) {
					total += score[i][j];
				}
				System.out.print(total + " ");
				studentTotal[i] = total;
				total = 0;
				System.out.print("studentToal["+i+"] : "+studentTotal[i] + " ");
				System.out.println();
			}
		
		
		
	}

}
