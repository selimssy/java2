package condition;

import java.util.Scanner;

public class Ex05_switch {

	public static void main(String[] args) {
		
		// switch문을 사용해서 A학점부터 F학점까지 나누기
		// 90 ~ 100 : A
		// 80 ~ 89 : B
		// 70 ~ 79 : C
		// 60 ~ 69 : D
		// 나머지 : F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 100까지 점수를 입력 : ");
		int score =  sc.nextInt();
		
		System.out.println("score / 10 이 입력되는 결과 : " + score / 10);
		System.out.println();
		// 나눴을 때 몫만 나오는 것을 이용!!
		
		switch(score / 10) {
		
			case 10:
			case 9 :
				System.out.println("A학점 입니다.");
				break;
			case 8:
				System.out.println("B학점 입니다.");
				break;
			case 7:
				System.out.println("C학점 입니다.");
				break;
			case 6:
				System.out.println("D학점 입니다.");
				break;
				
			default:
				System.out.println("F학점 입니다.");
			
		}
		
		
		sc.close();
	}

}
