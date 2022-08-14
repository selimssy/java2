package stm.java.exam10;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.next();
		
		System.out.print("국어: ");
		int korean = sc.nextInt();
		
		System.out.print("영어: ");
		int eng = sc.nextInt();
		
		System.out.print("수학: ");
		int math = sc.nextInt();
		
		System.out.println(name + "님의 성적표");
		
		
	}

}
