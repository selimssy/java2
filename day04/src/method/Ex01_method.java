package method;

public class Ex01_method {
	
	
	public static void method1() {
		for(int i = 0; i < 5; i++) {
			System.out.println("�ȳ��ϼ���");
		}
	}
	
	
	// ����� ����� �Լ� �� static �ٴ� ������ �� main{} �ȿ����� ��ü�� �����ؼ� �Լ��� �����ؾ� �ϴ� �ٵ� static�� Ŭ������ �����ϴµ� ���� ���� Ŭ���� ���̴ϱ� �׳� �޼ҵ� �̸����θ�?!!
	
	
	public static int method2() {
		System.out.println("����Ÿ���� int���� �޼ҵ�");
		byte b = 100;
		return b;   // �޴°� ȣ���� ������ �޴´�!     // byte�� int�� �ڵ�Ÿ�Ժ�ȯ �ǹǷ� �̷��� �ٷ� return b �ص� �ȴ�!
	}
	
	
	
	
	
	public static void method3() {
		for(int i = 0; i < 5; i++) {
			System.out.println("�ȳ��ϼ���");
			if(i == 1) {
				return;     // void �޼ҵ忡�� return ������ ��������    // �ᱹ "�ȳ��ϼ���" 2�� ����ϰ� �޼ҵ� �������� 
			}
		}
	}
	
	
	// ����) System.exit(0) : ���α׷� ��������
	
	
	
	

	public static void main(String[] args) {
		
		System.out.println("���θ޼ҵ� �Դϴ�.");
		
		method1();
		// method1() �޼ҵ��� static ���� �̷��� ��ü ���� ����, ȣ���ؾ�!
		//Ex01_method m = new Ex01_method();
		//m.method1();
		
		
		method2();
		
		method3();  // "�ȳ��ϼ���" 2�� ����ϰ� �޼ҵ� �������� 
		
		System.out.println();
		
		System.out.println(method2());  // �̷��� �ϸ� ����Ÿ���� int���� �޼ҵ� (�����ٿ�) 100 �̷���!
		
		System.out.println();
		
		int result = method2();  // int ����Ÿ�� �޼ҵ� ȣ��   // ���⼭ "����Ÿ���� int���� �޼ҵ�" �̰� ��µȴ�!!
		
		System.out.println();
		 
		System.out.println("method2���� ������ �� : " + result);  // method2���� ������ �� : 100
		
		System.out.println();
		System.out.println(result);  // 100
		System.out.println(result);  // 100
		System.out.println(result);  // 100
		
	}

}
