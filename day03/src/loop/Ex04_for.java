package loop;

public class Ex04_for {

	public static void main(String[] args) {
		
		// 0���� 90���� 10������ ����ϱ�
		// 0, 10, 20, 30, ... 90
		
		
		// for �ȿ� if �־ �� �ڿ� , ����¹�!!��
		for(int i = 0; i <= 90; i += 10) {
			if(i == 90) {   // t�� if(i != 90 �̷��� �ߴ�)
				System.out.print(i);
			}else {
				System.out.print(i + ", ");
			}
		}
		
	}

}
