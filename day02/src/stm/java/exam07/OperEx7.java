package stm.java.exam07;

public class OperEx7 {

	public static void main(String[] args) {
		
		int a = 10;
		int res = 0;
		res += a;
		System.out.println(res);  // 10
		
		res *= a;
		System.out.println(res);  // 100
		
		res -= a; 
		System.out.println(res);  // 90
		
		res %= a;
		System.out.println(res);   // 0
	}

}
