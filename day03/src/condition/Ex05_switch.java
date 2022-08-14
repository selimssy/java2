package condition;

import java.util.Scanner;

public class Ex05_switch {

	public static void main(String[] args) {
		
		// switch���� ����ؼ� A�������� F�������� ������
		// 90 ~ 100 : A
		// 80 ~ 89 : B
		// 70 ~ 79 : C
		// 60 ~ 69 : D
		// ������ : F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 100���� ������ �Է� : ");
		int score =  sc.nextInt();
		
		System.out.println("score / 10 �� �ԷµǴ� ��� : " + score / 10);
		System.out.println();
		// ������ �� �� ������ ���� �̿�!!
		
		switch(score / 10) {
		
			case 10:
			case 9 :
				System.out.println("A���� �Դϴ�.");
				break;
			case 8:
				System.out.println("B���� �Դϴ�.");
				break;
			case 7:
				System.out.println("C���� �Դϴ�.");
				break;
			case 6:
				System.out.println("D���� �Դϴ�.");
				break;
				
			default:
				System.out.println("F���� �Դϴ�.");
			
		}
		
		
		sc.close();
	}

}
