package stm.java.exam01;

public class OperEx1 {

	public static void main(String[] args) {
		int x = 10;
		int y = ++x; // =���� ++x(������)�� �켱������ ����!! �׷��� ++x�� ���� �Ǽ� 11�� �ȴ�!
		System.out.println("x = " + x);   // 11
		System.out.println("y = " + y);   // 11
		
		
		
		// �켱����ǥ ���� �ٽ� �غ��ڤ�
		int a = 10;
		int b = a++;
		System.out.println("a = " + a);  // 11
		System.out.println("b = " + b);  // 10
	}

}
