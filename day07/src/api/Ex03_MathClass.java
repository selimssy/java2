package api;

public class Ex03_MathClass {

	public static void main(String[] args) {
		
		// abs : ���� ��ȯ
		int a = Math.abs(-10);
		System.out.println(a);  // 10
		
		// �� �� �� ū ���� ��ȯ
		int b = Math.max(1, 9);
		System.out.println(b);  // 9
		
		// �� �� �� ���� ���� ��ȯ
		int c = Math.min(1, 9);
		System.out.println(c);  // 1
		
		// random() : 0.0 �� 1.0 ������ double Ÿ�� ���� ��ȯ
		double d = Math.random();
		System.out.println(d);  // 1619328205193592
		
		// ceil : �����͸� �ø��ؼ� double Ÿ������ ��ȯ
		double e = Math.ceil(1.1);  
		System.out.println(e);  // 2.0
		
		// floor : �����͸� �����ؼ� double Ÿ������ ��ȯ
		double f = Math.floor(1.1);
		System.out.println(f);  // 1.0
		
		
		// round : �����͸� �ݿø��ؼ� long Ÿ������ ��ȯ
		long g = Math.round(5.3);
		long h = Math.round(5.7);
		System.out.println(g);  // 5
		System.out.println(h);  // 6
	}

}
