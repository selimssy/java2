package exception;

public class Ex03 {

	public static void main(String[] args) {
		
		try {
			
			System.out.println(1 / 0);
			
		}catch(ArithmeticException e){
			
			e.printStackTrace(); // ���� �߻��� ȣ�⽺�ÿ� �ִ� �޼ҵ��� ������ ���� ������ ȭ�鿡 ������ִ� �޼ҵ�
			
			String msg = e.getMessage();  // �ν��Ͻ��� ����� �޼����� ���� �� �ִ� 
			System.out.println("�޼��� : " + msg);
		}
		
	}

}
