package loop;

public class Ex02_for {

	public static void main(String[] args) {
		
		int i;
		
		for(i = 1; i <= 5; i++) {
			System.out.println("for문 안입니다. i = " + i);
		}
		
		System.out.println("for문을 나왔습니다. i = " + i);  // 여기서 i = 6이다!!★ (조건 → 실행 → 증감 순서라서 i = 6으로 증가까지가 한 loop고 그 다음 루프에서 조건 검사해보니까 조건에 어긋나니까 여기서 멈추는 것)
		
		
		
		
		// 2 4 6 8 10 출력
		int j;
		for(j = 2; j <= 10; j+=2) {
			System.out.print(j + " ");
		}
		
		System.out.println();
		System.out.println(j);  // 12
		
	}

}
