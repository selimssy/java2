package exception;

public class Ex02_exception {

	public static void main(String[] args) {
		
		
		try {
			
			System.out.println(1 / 0);  // 0���� ������ ���ܹ߻�!
			
			System.out.println(args[0]);
			
		}catch(ArithmeticException ae) {
			
			System.out.println("ArithmeticException ���� �߻�!");
			
		}catch(ArrayIndexOutOfBoundsException aie){
			
			System.out.println("ArrayIndexOutOfBoundsException ���� �߻�!");
			
		}catch(Exception e){
			// ���� ����Ŭ������ ���� ����Ŭ�������� �Ʒ��ʿ� ��ġ�ؾ� �Ѵ�!
			System.out.println("Exception ���� �߻�!");
		}
		
		
		
		
		
		
	}

}
