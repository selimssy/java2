package stm.java.exam02;

public class OperEx2 {
	public static void main(String[] args) {
		short a, b;
		a = b = 10; 
		short c = (short)(a + b);   // �ڹٿ��� �������� ��Ģ������ ����� int�� ��������ȯ �����
		// (short)(a + b); �̷��� ���� �� �𸣰ٴ�
		System.out.println("c = " + c);  // c = 20
	}
}
