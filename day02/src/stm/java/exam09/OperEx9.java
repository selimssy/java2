package stm.java.exam09;

import java.util.Scanner;

public class OperEx9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);   // util에서 import
		System.out.print("당신의 나이는 = ");
		int age = scan.nextInt();
		System.out.println(age + "세 이군요.");
		

		System.out.print("당신의 몸무게는 = ");
		int weight = scan.nextInt();
		System.out.println(weight + "kg 이네요.");
		
		scan.close();
	}

}
