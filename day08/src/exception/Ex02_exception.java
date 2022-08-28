package exception;

public class Ex02_exception {

	public static void main(String[] args) {
		
		
		try {
			
			System.out.println(1 / 0);  // 0으로 나누면 예외발생!
			
			System.out.println(args[0]);
			
		}catch(ArithmeticException ae) {
			
			System.out.println("ArithmeticException 예외 발생!");
			
		}catch(ArrayIndexOutOfBoundsException aie){
			
			System.out.println("ArrayIndexOutOfBoundsException 예외 발생!");
			
		}catch(Exception e){
			// 상위 예외클래스가 하위 예외클래스보다 아래쪽에 위치해야 한다!
			System.out.println("Exception 예외 발생!");
		}
		
		
		
		
		
		
	}

}
