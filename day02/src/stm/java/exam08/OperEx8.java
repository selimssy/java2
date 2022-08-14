
package stm.java.exam08;

public class OperEx8 {

	public static void main(String[] args) {
		
		double x = 10;   // 10에 가까운 수 
		double y = 0;    // 0에 가까운 수 이런 뜻이라서 나눗셈 가능
		System.out.println("x / y = " + (x / y));  // x / y = Infinity
		
		x = 0;
		y = 10;
		System.out.println("x / y = " + (x / y));  // x / y = 0.0

	}

}
