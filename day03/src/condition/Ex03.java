package condition;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		// 정수 3개를 입력받아 최댓값, 최소값, 평균 구하기
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		int max, min;
		double avg;
		
		System.out.print("첫 번째 정수 입력 : ");
		num1 = scan.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		num2 = scan.nextInt();
		
		System.out.print("세 번째 정수 입력 : ");
		num3 = scan.nextInt();
		
		
		
		// if ~ else문을 사용해서 
		// 3개의 정수 중 최대값을 찾아 max 변수에 저장하기
		// 3개의 정수 중 최소값을 찾아 min 변수에 저장하기
		// 평균을 구한 후 avg 변수에 저장하기
		
//		max = num1;
//		if(max < num2) {
//			max = num2;
//		}else {
//			max = max;
//		}
//		
//		if(max < num3) {
//			max = num3;
//		}else {
//			max = max;
//		}
//		
//		
//		
//		min = num1;
//		if(min > num2) {
//			min = num2;
//		}else {
//			min = min;
//		}
//		
//		if(min > num3) {
//			min = num3;
//		}else {
//			min = min;
//		}
		 
		
		
		if(num1 > num2 && num1 > num3) {
			max = num1;
		}else if(num2 > num3) {
			max = num2;
		}else {
			max = num3;
		}
		
		
		if(num1 < num2 && num1 < num3) {
			min = num1;
		}else if(num2 < num3) {
			min = num2;
		}else {
			min=  num3;
		}
		
		
		
		avg = (num1 + num2 + num3) / 3.0;
		
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("평균 : " + avg);
		
		
		
		
	}

}
