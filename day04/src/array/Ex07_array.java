package array;

import java.util.Scanner;

public class Ex07_array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		int[] rank = new int[3];
		
		
		
		// �л� 3���� �̸�, ����, ������� �Է¹ް�
		// ������ ������ ���
		// rank�� 0�� �ε����� name 0�� ����� ����
		
		
		// ������ �Է¹ޱ�(�̸�, ��������, ��������)
		for(int i = 0; i < name.length; i++) {
			
			System.out.print(i+1 + "��° �л� �̸� : ");
			name[i] = sc.next();
			
			System.out.print("�������� : ");
			kor[i] = sc.nextInt();
			
			System.out.print("�������� : ");
			eng[i] = sc.nextInt();
			
			total[i] = kor[i] + eng[i];
			
			rank[i] = 1;
		}
		
		
		
		// �ڼ��� ���ϱ��
		// �켱 1������ �ʱ�ȭ�� �� �ٸ� �л� ������ �� ������ ��
		// �ٸ��л� �������� �� �۴ٸ� ������ �ϳ� �÷��ش�. 
		// ���� for�� ���
		
		for(int i = 0; i < name.length; i++) {
			// t�� rank[i] = 1 �� ���⿡ �־���
			for(int j = 0; j < name.length; j++) {
				if(total[i] < total[j]) {
					rank[i]++;
				}
			}
		}
		
		
		
		
		// ���
		for(int i = 0; i < name.length; i++) {
			//System.out.println(i+1 + "��° �л� : " + name[i]);
			//System.out.println("���� : " + total[i]);
			//System.out.println("���� : " + rank[i]);
			
			System.out.printf("%s���� ������ %d���̰�, ������ %d�� �Դϴ�.\n",
					name[i], total[i], rank[i]);
		}
		
		
		
		
		
		sc.close();
	}

}
