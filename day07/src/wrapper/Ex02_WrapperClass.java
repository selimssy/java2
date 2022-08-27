package wrapper;

public class Ex02_WrapperClass {

	public static void main(String[] args) {
		
		printDouble(new Double(3.14));  // 3.14
		
		printDouble(3.141592); // �ڵ��ڽ̵Ǽ� Double ���尴ü�� ����!!   // 3.141592
		
	}

	
	public static void printDouble(Double obj) {
		System.out.println("�ڵ��ڽ� : " + obj.doubleValue());   // �ڵ��ڽ� : 3.141592
		
		double value = obj;   // �ڵ���ڽ�
		System.out.println("�ڵ� ��ڽ� : " + value);  // �ڵ� ��ڽ� : 3.141592
	}
	
}
