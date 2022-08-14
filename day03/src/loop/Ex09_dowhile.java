package loop;

public class Ex09_dowhile {

	public static void main(String[] args) {
		
		// do ~ while문
		// 처음 한 번은 우선 실행하고 그 다음에 조건을 따진다(true면 올라와서 다시 실행, false면 중지)
		
		int a = 100;
		
		do {
			System.out.println("처음 한 번은 우선 실행");
		}while(a == 200); // 세미클론 붙여야
		
		
	}

}
