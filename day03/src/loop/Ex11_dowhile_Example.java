package loop;

import java.util.Scanner;

public class Ex11_dowhile_Example {

	public static void main(String[] args) {
		
		// Ŀ�Ǽ� �ֹ��ޱ�
		
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		do {
			
			System.out.println("�մ� �ֹ��Ͻðڽ��ϱ�?");
			System.out.println("1.�Ƹ޸�ī�� 2.ī��� 3.ī���ī 4.���̽�Ƽ 5.�ֹ�����");
			
			System.out.print("�޴���ȣ : ");
			menu = sc.nextInt();
			
			switch(menu) {
			
				case 1:
					System.out.println("**�Ƹ޸�ī�� �ֹ� �޾ҽ��ϴ�.**");
					System.out.println("**�Ƹ޸�ī�� ���Խ��ϴ�~ ���ְ� �弼��!**");
					break;
					
				case 2:
					System.out.println("**ī��� �ֹ� �޾ҽ��ϴ�.**");
					System.out.println("**ī��� ���Խ��ϴ�~ ���ְ� �弼��!**");
					break;
				
				case 3:
					System.out.println("**ī���ī �ֹ� �޾ҽ��ϴ�.**");
					System.out.println("**ī���ī ���Խ��ϴ�~ ���ְ� �弼��!**");
					break;
				
				case 4:
					System.out.println("**���̽�Ƽ �ֹ� �޾ҽ��ϴ�.**");
					System.out.println("**���̽�Ƽ ���Խ��ϴ�~ ���ְ� �弼��!**");
					break;
					
				case 5:
					System.out.println("�̿����ּż� �����մϴ�.");
					break;
					
				default:
					System.out.println("�߸��� ��ȣ�Դϴ�.");
			}
			
		}while(menu != 5);
		
		
		
		sc.close();
	}

}
