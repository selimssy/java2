package condition;

import java.util.Scanner;

public class Ex06_switch {

	public static void main(String[] args) {
		
		// �ֹι�ȣ�� �Է¹޾� ���� ���߱�
		char gender = ' ';   // ����
		String ssn = "";   // �ֹι�ȣ
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� �ֹι�ȣ�� �Է��ϼ���.");
		System.out.println("��: 123456-1234567");
		
		ssn = sc.next();   // ���� ������ ���ڿ� �о�´�.
		
		// charAt�� (String Ŭ������ �޼ҵ�) // Ÿ��: char�� ��ȯ
		gender = ssn.charAt(7);  // ���� �� 0���� �����ؼ� 7��° ���ڸ� ��ȯ!!
		
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("�����Դϴ�.");
			break;
			
		case '2':
		case '4':
			System.out.println("�����Դϴ�.");
			break;
			
		default:
			System.out.println("��ȿ���� ���� �ֹι�ȣ�Դϴ�.");
		}
		
		sc.close();
	}

}
