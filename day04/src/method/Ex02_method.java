package method;

public class Ex02_method {

	
	public static void profilePrint(String name, int age) {
		System.out.println("�̸��� : " + name);
		System.out.println("���̴� : " + age);
	}
	
	
	public static void main(String[] args) {
		
		profilePrint("ȫ�浿", 20);
		
		
		String name = "������";
		int age = 22;
		
		profilePrint(name, age);
	}

}
