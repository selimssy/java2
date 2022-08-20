package pack01_access_modifier;

public class Ex02_ConstructorEx {

	
	// ��� ��Ű������ ������ ȣ��
	public Ex02_ConstructorEx() {
		System.out.println("public ������");
	}
		
	// ���� ��Ű���� �ڽ�Ŭ�������� ȣ�� ����
	protected Ex02_ConstructorEx(int a) {
		System.out.println("protected ������");
	}
		
	// ���� ��Ű������ ȣ�� ����
	Ex02_ConstructorEx(int a, int b){
		System.out.println("default ������");
	}
	
	
	// ������ Ŭ���� ���ο����� ������ ȣ�� ����
	private Ex02_ConstructorEx(int a, int b, int c) {
		System.out.println("private ������");
	}
	
	
	public static void main(String[] args) {
		
		Ex02_ConstructorEx ex1 = new Ex02_ConstructorEx();
		Ex02_ConstructorEx ex2 = new Ex02_ConstructorEx(1);
		Ex02_ConstructorEx ex3 = new Ex02_ConstructorEx(1, 2);
		Ex02_ConstructorEx ex4 = new Ex02_ConstructorEx(1, 2, 3);
	}
	

}
