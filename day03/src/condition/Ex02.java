package condition;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 100���� ���� �ϳ� �Է� : ");
		int score = sc.nextInt();
		
		// if���� ����ؼ� A B C ��� ������
		// ������ 80�� �̸��̶�� C���
		// 80 ~ 89 �̶�� B���
		// 90 ~ 100 �̶�� A���
		
		if(score < 80) {
			System.out.println("C��� �Դϴ�.");
		}else if(score < 90) {
			System.out.println("B��� �Դϴ�.");
		}else{
			System.out.println("A��� �Դϴ�.");
		}
		
		
		//������ if������ ������ if(score >= 80 && score < 90�̷�������)
		
		
	}

}
