package string;

import java.util.Scanner;

public class Ex01_StringClass {

	public static void main(String[] args) {

		
		
		// String�� Ŭ�����̴�.
		// ���ڿ��� ���α׷����� ������ ���� ���̱� ������ �ڹٿ����� String Ŭ������ �⺻���� ���� �������� �� �� �ֵ��� �صξ���.
		
		String str1 = "Hello";
		String str2 = "Hi";
		String str3 = "Hello";
		
		if(str1 == str2) {
			System.out.println("���� ��ü");
		}else {
			System.out.println("�ٸ� ��ü");     // �ٸ� ��ü
		}
		
		
		
		if(str1 == str3) {
			System.out.println("���� ��ü");    // ���� ��ü
		}else {
			System.out.println("�ٸ� ��ü");
		}

		
		
		
		String str4 = new String("java");
		String str5 = new String("java");
		
		System.out.println(str4 == str5);   // false
		System.out.println(str4.equals(str5));  // true
		
		// String Ŭ���������� equals()  : �������ڿ� ������ �񱳹��ڿ� ������ ���ڿ����� ���� �� �������ڿ��̸� true, �ٸ��� false ��ȯ
		
		
		
		System.out.println("�ƹ����� �ƹ������ �θ��� ���ϴ� �ι���?");
		
		// Scanner�� ����ؼ� ������ �Է¹��� ��
		// ���� "ȫ�浿"�̸� "�����Դϴ�." ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� : ");
			String anw = sc.next();
			
			if(anw.equals("ȫ�浿")) {
				System.out.println("�����Դϴ�.");
				break;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
		
		
		sc.close();
		
	}

}
