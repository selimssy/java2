package stm.java.exam06;

public class OperEx6 {
	public static void main(String[] args) {
		int a = 20, b = 30, max;
		max = a > b ? ++a : ++b;
		System.out.println("a = " + a); // a = 20
		System.out.println("b = " + b); // b = 31
		System.out.println("max = " + max); // max = 31
		
		
		// ���� +�ϰ� (�켱������ ����! �������ڤ�)
		int a2 = 20, b2 = 30, max2;
		max2 = a > b ? ++a : b++;
		System.out.println("a2 = " + a2); // a = 20
		System.out.println("b2 = " + b2); // b = 30
		System.out.println("max2 = " + max2); // max2 = 31
		
	}
}
