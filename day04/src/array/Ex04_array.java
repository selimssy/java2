package array;

public class Ex04_array {

	public static void main(String[] args) {
		
		int[] intArray = {10, 20, 30, 40, 50, 60};
		
		// �ݺ����� ����ؼ� �迭�� �� ��Ҹ� ����ϱ�
		// ���� : index�� 3�� ���� ������� �ʱ�
		
		for(int i = 0; i < intArray.length; i++) {
			if(i == 3) {
				continue;   // continue�� �̷��� ����� �ͺ��� ���� �;��ϴ� �� ����!(�ȱ׷� ��µǰ� continue�Ǽ� �ƹ� �ǹ̰� �����ϱ�)
			}
				
			System.out.println(intArray[i]);  // else ��� �ɵ�
			
		}
		
	}

}
