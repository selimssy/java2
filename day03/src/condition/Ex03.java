package condition;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		// ���� 3���� �Է¹޾� �ִ�, �ּҰ�, ��� ���ϱ�
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		int max, min;
		double avg;
		
		System.out.print("ù ��° ���� �Է� : ");
		num1 = scan.nextInt();
		
		System.out.print("�� ��° ���� �Է� : ");
		num2 = scan.nextInt();
		
		System.out.print("�� ��° ���� �Է� : ");
		num3 = scan.nextInt();
		
		
		
		// if ~ else���� ����ؼ� 
		// 3���� ���� �� �ִ밪�� ã�� max ������ �����ϱ�
		// 3���� ���� �� �ּҰ��� ã�� min ������ �����ϱ�
		// ����� ���� �� avg ������ �����ϱ�
		
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
		
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		System.out.println("��� : " + avg);
		
		
		
		
	}

}
