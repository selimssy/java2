package exception;

public class Ex01_exception {

	public static void main(String[] args) {
		
		
		// 맨앞 소문자로 하면 컴파일 자체가 안된다(컴파일 에러)
		//system.out.println();
		
		
		// 실행 에러 : 실행 중 발생
		//System.out.println(args[0]);
		
		
		try {
			
			// 예외가 발생할 가능성이 있는 코드
			System.out.println(args[0]);
			System.out.println("안녕하세요");  // 윗줄에서 예외 발생하면 그 밑에는 실행되지 않는다!
			
		}catch(Exception e){
			
			// 예외처리를 위한 코드
			System.out.println("예외가 발생되었습니다.");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}finally {
			
			// 예외 발생여부에 관계없이 항상 수행되어야 하는 코드
			System.out.println("항상 수행됩니다.");
			
		}
	}

}
