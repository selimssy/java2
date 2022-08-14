package array;

import java.util.Scanner;

public class Ex06_array {

	public static void main(String[] args) {
		
		// 배열과 for문을 사용해서 5명의 자바점수를 입력받고
		// 각 학생의 자바점수를 출력하고
		// 총 자바점수의 합과 평균 구하기
		
		
		int[] java = new int[5];
		int sum = 0;
		double avg = 0.0;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		// 입력받기
		for(int i = 0; i < java.length; i++) {
			
			System.out.print(i+1 + "번째 학생 점수 : ");
			java[i] = sc.nextInt();
			
			// 합계
			sum += java[i];
		}
		
		
		// 출력하기
		for(int i = 0; i < java.length; i++) {
			System.out.println(i+1 + "번째 학생 점수 : " + java[i]);
		}
		
		
		// 합과 평균 구해서 출력하기
		// 합계: sum
		
		// 평균
		avg = sum / java.length;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		
		sc.close();
	}

}
