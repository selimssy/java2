package loop;

public class Ex06_for {

	public static void main(String[] args) {
		
//		for(int i = 1; i < 10; i++) {
//			System.out.printf("2 X %d = %d\n", i, 2*i);
//		}
//		
		
		
		
		// ��ø for���� ����ؼ� ������ 2�� ~ 9�ܱ��� ���
		int dan;
		int num;
		
		for(dan = 2; dan < 10; dan++) {
			for(num = 1; num < 10; num++) {
				System.out.printf("%d X %d = %d\n", dan, num, dan*num);
			}
			System.out.println();
		}
		
		
		
		//t���
		int dan22;
		int num22;
		
		for(num22 = 1; num22 < 10 ; num22++) {
			for(dan22 = 2 ;dan22 < 10 ; dan22++) {
				System.out.printf("%d X %d = %d\t", dan22, num22, dan22*num22);
			}
			System.out.println();
		}
		
		
		
	}

}
