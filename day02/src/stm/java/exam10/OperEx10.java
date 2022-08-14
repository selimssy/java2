package stm.java.exam10;

import java.util.Scanner;

public class OperEx10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은: ");
		String name = sc.next();
		
		System.out.print("당신의 주소는: ");
		String address = sc.next();
		
		System.out.println(name + "님은 " + address + "에 사시는군요.");
		
		sc.close();
	}

}
