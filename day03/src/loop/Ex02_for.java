package loop;

public class Ex02_for {

	public static void main(String[] args) {
		
		int i;
		
		for(i = 1; i <= 5; i++) {
			System.out.println("for�� ���Դϴ�. i = " + i);
		}
		
		System.out.println("for���� ���Խ��ϴ�. i = " + i);  // ���⼭ i = 6�̴�!!�� (���� �� ���� �� ���� ������ i = 6���� ���������� �� loop�� �� ���� �������� ���� �˻��غ��ϱ� ���ǿ� ��߳��ϱ� ���⼭ ���ߴ� ��)
		
		
		
		
		// 2 4 6 8 10 ���
		int j;
		for(j = 2; j <= 10; j+=2) {
			System.out.print(j + " ");
		}
		
		System.out.println();
		System.out.println(j);  // 12
		
	}

}
