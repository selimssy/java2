package exception;

public class Ex04_exception {
	
	
	public static void myMethod() throws ClassNotFoundException{
		
		// throws : ȣ���� ������ ����ó���ض�!
		
		Class.forName("exception.Ex04_2");
	}
	
	

	public static void main(String[] args) {
		
		try {
			myMethod();
		} catch (ClassNotFoundException e) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�.");
		} finally {
			System.out.println("�׻� ����");
		}
		
	}

}
