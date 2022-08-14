package stm.java.exam01;

public class OperEx1 {

	public static void main(String[] args) {
		int x = 10;
		int y = ++x; // =보다 ++x(전위형)가 우선순위가 높다!! 그래서 ++x이 먼저 되서 11이 된다!
		System.out.println("x = " + x);   // 11
		System.out.println("y = " + y);   // 11
		
		
		
		// 우선순위표 보고 다시 해보자ㅠ
		int a = 10;
		int b = a++;
		System.out.println("a = " + a);  // 11
		System.out.println("b = " + b);  // 10
	}

}
