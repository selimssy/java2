package random;

public class Ex01_random {

	public static void main(String[] args) {
		
		double randomDouble = Math.random();  // 0.0���� 1�̸��� �� �ϳ��� ��ȯ
		System.out.println(randomDouble);
		
		int myDice = (int)(Math.random() * 6 + 1);  // 1���� 6������ ���� �ϳ� ��ȯ
		System.out.println(myDice);
		
		
		
	}

}
