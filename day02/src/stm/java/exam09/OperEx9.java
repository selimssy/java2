package stm.java.exam09;

import java.util.Scanner;

public class OperEx9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);   // util���� import
		System.out.print("����� ���̴� = ");
		int age = scan.nextInt();
		System.out.println(age + "�� �̱���.");
		

		System.out.print("����� �����Դ� = ");
		int weight = scan.nextInt();
		System.out.println(weight + "kg �̳׿�.");
		
		scan.close();
	}

}
