package method;

public class Ex01_method {
	
	
	public static void method1() {
		for(int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
	}
	
	
	// 여기다 만드는 함수 다 static 붙는 이유가 저 main{} 안에서는 객체를 생성해서 함수에 접근해야 하니 근데 static은 클래스로 접근하는데 여긴 같은 클래스 안이니까 그냥 메소드 이름으로만?!!
	
	
	public static int method2() {
		System.out.println("리턴타입은 int형인 메소드");
		byte b = 100;
		return b;   // 받는건 호출한 곳에서 받는다!     // byte는 int로 자동타입변환 되므로 이렇게 바로 return b 해도 된다!
	}
	
	
	
	
	
	public static void method3() {
		for(int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
			if(i == 1) {
				return;     // void 메소드에서 return 만나면 강제종료    // 결국 "안녕하세요" 2번 출력하고 메소드 강제종료 
			}
		}
	}
	
	
	// 참고) System.exit(0) : 프로그램 강제종료
	
	
	
	

	public static void main(String[] args) {
		
		System.out.println("메인메소드 입니다.");
		
		method1();
		// method1() 메소드의 static 빼면 이렇게 객체 만들어서 접근, 호출해야!
		//Ex01_method m = new Ex01_method();
		//m.method1();
		
		
		method2();
		
		method3();  // "안녕하세요" 2번 출력하고 메소드 강제종료 
		
		System.out.println();
		
		System.out.println(method2());  // 이렇게 하면 리턴타입은 int형인 메소드 (다음줄에) 100 이렇게!
		
		System.out.println();
		
		int result = method2();  // int 리턴타입 메소드 호출   // 여기서 "리턴타입은 int형인 메소드" 이거 출력된다!!
		
		System.out.println();
		 
		System.out.println("method2에서 돌려준 값 : " + result);  // method2에서 돌려준 값 : 100
		
		System.out.println();
		System.out.println(result);  // 100
		System.out.println(result);  // 100
		System.out.println(result);  // 100
		
	}

}
