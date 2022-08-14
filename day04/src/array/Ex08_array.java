package array;

public class Ex08_array {
	
	public static void main(String[] args) {
		
		// 배열복사
		
		int[] scores = new int[] {77, 83, 98, 69, 87};
		
		
		
		// 향상된 for문
		for(int score : scores) {
			System.out.print(score + "  ");   // 77  83  98  69  87  
		}
		
		
		
		
		
		// 학생이 2명 더 늘어났다면
		// 배열은 한 번 생성하면 크기를 변경할 수 없어서 더 많은 공간이 필요하면 더 큰 배열을 만들고 이전 값들을 복사해와야!
		
		// 더 큰 배열 생성
		int[] newScores = new int[7];
		
		for(int i = 0; i < scores.length; i++) {
			newScores[i] = scores[i];
		}
		
		
		System.out.println();
		
		
		for(int i : newScores) {   // 향상된 for문에서는 newScores[i] 이런거 안한다! i만 해도 자동으로 값을 하나씩 꺼내온다!
			System.out.print(i + "  ");  // 77  83  98  69  87  0  0  
		}
		
		
		
		
	}
}
