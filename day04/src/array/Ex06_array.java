package array;

import java.util.Scanner;

public class Ex06_array {

	public static void main(String[] args) {
		
		// �迭�� for���� ����ؼ� 5���� �ڹ������� �Է¹ް�
		// �� �л��� �ڹ������� ����ϰ�
		// �� �ڹ������� �հ� ��� ���ϱ�
		
		
		int[] java = new int[5];
		int sum = 0;
		double avg = 0.0;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		// �Է¹ޱ�
		for(int i = 0; i < java.length; i++) {
			
			System.out.print(i+1 + "��° �л� ���� : ");
			java[i] = sc.nextInt();
			
			// �հ�
			sum += java[i];
		}
		
		
		// ����ϱ�
		for(int i = 0; i < java.length; i++) {
			System.out.println(i+1 + "��° �л� ���� : " + java[i]);
		}
		
		
		// �հ� ��� ���ؼ� ����ϱ�
		// �հ�: sum
		
		// ���
		avg = sum / java.length;
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		
		
		sc.close();
	}

}
