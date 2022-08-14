package random;

public class Ex02_random {

	public static void main(String[] args) {
		
		// Math.random()�� ����ؼ� �ζǹ�ȣ ��÷�ϱ�
		
		int[] lotto = new int[6];
		
		// �ζ� : 1 ~ 45 ������ ������ 6�� �̾� �迭�� �� ��ҿ� ����
		for(int i = 0; i < lotto.length; i++) {
			
			lotto[i] = (int)(Math.random() * 45) + 1;  // +1 ��ȣ �ۿ� ����
			
			// �ߺ������� �� ó��
			for(int j = 0; j < i; j++) {  // j�� i�� �Ʒ��������� �ݺ�
				if(lotto[i] == lotto[j]) {
					i--;
					break;   // ���� for�� Ż��
				}
			}
		}
		
		
		System.out.println("�ζ� ��÷�� �����մϴ�!!");
		System.out.println("�̹��� �ζ� ��ȣ��");
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "  ");
		}
		
	}

}
