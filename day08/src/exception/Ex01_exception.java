package exception;

public class Ex01_exception {

	public static void main(String[] args) {
		
		
		// �Ǿ� �ҹ��ڷ� �ϸ� ������ ��ü�� �ȵȴ�(������ ����)
		//system.out.println();
		
		
		// ���� ���� : ���� �� �߻�
		//System.out.println(args[0]);
		
		
		try {
			
			// ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�
			System.out.println(args[0]);
			System.out.println("�ȳ��ϼ���");  // ���ٿ��� ���� �߻��ϸ� �� �ؿ��� ������� �ʴ´�!
			
		}catch(Exception e){
			
			// ����ó���� ���� �ڵ�
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}finally {
			
			// ���� �߻����ο� ������� �׻� ����Ǿ�� �ϴ� �ڵ�
			System.out.println("�׻� ����˴ϴ�.");
			
		}
	}

}
