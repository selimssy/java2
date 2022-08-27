package api;

public class Ex03_MathClass {

	public static void main(String[] args) {
		
		// abs : 절댓값 반환
		int a = Math.abs(-10);
		System.out.println(a);  // 10
		
		// 둘 중 더 큰 수를 반환
		int b = Math.max(1, 9);
		System.out.println(b);  // 9
		
		// 둘 중 더 작은 수를 반환
		int c = Math.min(1, 9);
		System.out.println(c);  // 1
		
		// random() : 0.0 과 1.0 사이의 double 타입 난수 반환
		double d = Math.random();
		System.out.println(d);  // 1619328205193592
		
		// ceil : 데이터를 올림해서 double 타입으로 반환
		double e = Math.ceil(1.1);  
		System.out.println(e);  // 2.0
		
		// floor : 데이터를 버림해서 double 타입으로 반환
		double f = Math.floor(1.1);
		System.out.println(f);  // 1.0
		
		
		// round : 데이터를 반올림해서 long 타입으로 반환
		long g = Math.round(5.3);
		long h = Math.round(5.7);
		System.out.println(g);  // 5
		System.out.println(h);  // 6
	}

}
