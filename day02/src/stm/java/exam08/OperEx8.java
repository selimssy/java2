
package stm.java.exam08;

public class OperEx8 {

	public static void main(String[] args) {
		
		double x = 10;   // 10�� ����� �� 
		double y = 0;    // 0�� ����� �� �̷� ���̶� ������ ����
		System.out.println("x / y = " + (x / y));  // x / y = Infinity
		
		x = 0;
		y = 10;
		System.out.println("x / y = " + (x / y));  // x / y = 0.0

	}

}
