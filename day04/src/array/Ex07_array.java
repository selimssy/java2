package array;

import java.util.Scanner;

public class Ex07_array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		int[] rank = new int[3];
		
		
		
		// 학생 3명의 이름, 국어, 영어성적을 입력받고
		// 총점과 순위를 출력
		// rank의 0번 인덱스도 name 0번 사람의 순위
		
		
		// 데이터 입력받기(이름, 국어점수, 영어점수)
		for(int i = 0; i < name.length; i++) {
			
			System.out.print(i+1 + "번째 학생 이름 : ");
			name[i] = sc.next();
			
			System.out.print("국어점수 : ");
			kor[i] = sc.nextInt();
			
			System.out.print("영어점수 : ");
			eng[i] = sc.nextInt();
			
			total[i] = kor[i] + eng[i];
			
			rank[i] = 1;
		}
		
		
		
		// ★순위 구하기★
		// 우선 1등으로 초기화한 후 다른 학생 총점과 내 총점을 비교
		// 다른학생 총점보다 더 작다면 순위를 하나 올려준다. 
		// 이중 for문 사용
		
		for(int i = 0; i < name.length; i++) {
			// t는 rank[i] = 1 을 여기에 넣었다
			for(int j = 0; j < name.length; j++) {
				if(total[i] < total[j]) {
					rank[i]++;
				}
			}
		}
		
		
		
		
		// 출력
		for(int i = 0; i < name.length; i++) {
			//System.out.println(i+1 + "번째 학생 : " + name[i]);
			//System.out.println("총점 : " + total[i]);
			//System.out.println("순위 : " + rank[i]);
			
			System.out.printf("%s님의 총점은 %d점이고, 순위는 %d등 입니다.\n",
					name[i], total[i], rank[i]);
		}
		
		
		
		
		
		sc.close();
	}

}
