package condition;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 100까지 점수 하나 입력 : ");
		int score = sc.nextInt();
		
		// if문을 사용해서 A B C 등급 나누기
		// 점수가 80점 미만이라면 C등급
		// 80 ~ 89 이라면 B등급
		// 90 ~ 100 이라면 A등급
		
		if(score < 80) {
			System.out.println("C등급 입니다.");
		}else if(score < 90) {
			System.out.println("B등급 입니다.");
		}else{
			System.out.println("A등급 입니다.");
		}
		
		
		//각각의 if문으로 쓰려면 if(score >= 80 && score < 90이런식으로)
		
		
	}

}
