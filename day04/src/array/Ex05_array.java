package array;

import java.util.Scanner;

public class Ex05_array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String[] name = new String[3];
		
		
		// �Է¹ޱ�
		
		for(int i = 0; i < name.length; i++) {
			
			System.out.print(i+1 + "��° �̸��� �Է� : ");
			name[i] = sc.next();
			
		}
		
		
		
		// ����ϱ�
		
		for(int i = 0; i <name.length; i++) {
			System.out.println(i+1 + "��° �̸���: " + name[i]);
		}
		
		
		
		sc.close();
	}

}
