package exception;

public class Ex03 {

	public static void main(String[] args) {
		
		try {
			
			System.out.println(1 / 0);
			
		}catch(ArithmeticException e){
			
			e.printStackTrace(); // 예외 발생시 호출스택에 있던 메소드의 정보와 예외 정보를 화면에 출력해주는 메소드
			
			String msg = e.getMessage();  // 인스턴스에 저장된 메세지를 얻을 수 있다 
			System.out.println("메세지 : " + msg);
		}
		
	}

}
