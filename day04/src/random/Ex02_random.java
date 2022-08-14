package random;

public class Ex02_random {

	public static void main(String[] args) {
		
		// Math.random()을 사용해서 로또번호 추첨하기
		
		int[] lotto = new int[6];
		
		// 로또 : 1 ~ 45 까지의 정수를 6개 뽑아 배열의 각 요소에 저장
		for(int i = 0; i < lotto.length; i++) {
			
			lotto[i] = (int)(Math.random() * 45) + 1;  // +1 괄호 밖에 하쟈
			
			// 중복나왔을 때 처리
			for(int j = 0; j < i; j++) {  // j는 i의 아랫수까지만 반복
				if(lotto[i] == lotto[j]) {
					i--;
					break;   // 안쪽 for문 탈출
				}
			}
		}
		
		
		System.out.println("로또 추첨을 시작합니다!!");
		System.out.println("이번주 로또 번호는");
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "  ");
		}
		
	}

}
