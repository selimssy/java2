package array;

public class Ex08_array {
	
	public static void main(String[] args) {
		
		// �迭����
		
		int[] scores = new int[] {77, 83, 98, 69, 87};
		
		
		
		// ���� for��
		for(int score : scores) {
			System.out.print(score + "  ");   // 77  83  98  69  87  
		}
		
		
		
		
		
		// �л��� 2�� �� �þ�ٸ�
		// �迭�� �� �� �����ϸ� ũ�⸦ ������ �� ��� �� ���� ������ �ʿ��ϸ� �� ū �迭�� ����� ���� ������ �����ؿ;�!
		
		// �� ū �迭 ����
		int[] newScores = new int[7];
		
		for(int i = 0; i < scores.length; i++) {
			newScores[i] = scores[i];
		}
		
		
		System.out.println();
		
		
		for(int i : newScores) {   // ���� for�������� newScores[i] �̷��� ���Ѵ�! i�� �ص� �ڵ����� ���� �ϳ��� �����´�!
			System.out.print(i + "  ");  // 77  83  98  69  87  0  0  
		}
		
		
		
		
	}
}
