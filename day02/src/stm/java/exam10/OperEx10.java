package stm.java.exam10;

import java.util.Scanner;

public class OperEx10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �̸���: ");
		String name = sc.next();
		
		System.out.print("����� �ּҴ�: ");
		String address = sc.next();
		
		System.out.println(name + "���� " + address + "�� ��ô±���.");
		
		sc.close();
	}

}
