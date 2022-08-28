package exception;

public class Ex04_exception {
	
	
	public static void myMethod() throws ClassNotFoundException{
		
		// throws : 호출한 곳에서 예외처리해라!
		
		Class.forName("exception.Ex04_2");
	}
	
	

	public static void main(String[] args) {
		
		try {
			myMethod();
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾을 수 없습니다.");
		} finally {
			System.out.println("항상 실행");
		}
		
	}

}
