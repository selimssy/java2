package method;

public class Ex03_method {
	
	// �޼ҵ� �����ε�
	// ���� : �Ű������� Ÿ��, ����, ������ �ϳ��� �޶�� �Ѵ�.
	
	
	
	public static void profile(String name) {
		System.out.println("�̸��� �����ҰԿ�. ���� �̸��� " + name + "�Դϴ�.");
	}
	
	
	
	public static void profile(int age) {
		System.out.println("���̸� �����ҰԿ�. ���̴� " + age + "���Դϴ�.");
	}
	
	
	
	public static void profile(String name, int age) {
		System.out.println("�̸��� " + name + "�̰� ���̴� " + age + "���Դϴ�.");
	}
	
	
	
	public static void profile(int age, String name) {
		System.out.println("���� ���� ��� : " + age + "��, �̸� : " + name);
	}
	
	

	
	
	
	
	
	public static void main(String[] args) {
		
		
		profile("ȫ�浿");   // �̸��� �����ҰԿ�. ���� �̸��� ȫ�浿�Դϴ�.
		
		profile(20);    // ���̸� �����ҰԿ�. ���̴� 20���Դϴ�.
		
		profile("ȫ�浿", 20);   // �̸��� ȫ�浿�̰� ���̴� 20���Դϴ�.
		
		profile(20, "ȫ�浿");   // ���� ���� ��� : 20��, �̸� : ȫ�浿
		
		
		
	}

}
