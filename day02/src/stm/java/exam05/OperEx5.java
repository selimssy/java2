package stm.java.exam05;

public class OperEx5 {

	public static void main(String[] args) {
		
		boolean a;
		boolean b;
		if((a=4>3 | (b=5>7))) {  // short circuit ���� : �̷��� ��Ʈ���� |�� ��������
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}
	}

}
