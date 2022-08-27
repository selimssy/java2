package api;

import java.util.Scanner;

public class Ex01_SystemClass {

	public static void main(String[] args) {
		
		// System.currentTimeMillis() : ����ð��� �о �и������尪�� long���� �ش�
		long time1 = System.currentTimeMillis();
		System.out.println(time1);
		
		
		
		// System.nanoTime() : ����ð��� �о ���뼼���尪�� long���� �ش�
		long time2 = System.nanoTime();
		System.out.println(time2);
		
		
		
		
		// for�� 10000�� ���� �ð� ���ϱ�
		long start_time = System.nanoTime();
		for(int i = 0; i < 10000; i++) {}
		long end_time = System.nanoTime();
		System.out.println("�ҿ�ð� : " + (end_time - start_time) + " ns");
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("�ý��� �����ұ��? 1. YES  |  2. NO");
			System.out.print("���� : ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				//System.exit(0);
				break;
			}else {
				System.out.println("�ý����� ��� ���ư��ϴ�.");
			}
			
		}
		
		System.out.println("break�� �̰� ��µǴµ� exit(0)�� ��� �ȵȴ�!");
	}

}
