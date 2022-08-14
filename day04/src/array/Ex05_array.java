package array;

import java.util.Scanner;

public class Ex05_array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String[] name = new String[3];
		
		
		// 입력받기
		
		for(int i = 0; i < name.length; i++) {
			
			System.out.print(i+1 + "번째 이름을 입력 : ");
			name[i] = sc.next();
			
		}
		
		
		
		// 출력하기
		
		for(int i = 0; i <name.length; i++) {
			System.out.println(i+1 + "번째 이름은: " + name[i]);
		}
		
		
		
		sc.close();
	}

}
