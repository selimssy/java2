package pack01_access_modifier;

public class Ex02_ConstructorEx {

	
	// 모든 패키지에서 생성자 호출
	public Ex02_ConstructorEx() {
		System.out.println("public 생성자");
	}
		
	// 같은 패키지와 자식클래스에서 호출 가능
	protected Ex02_ConstructorEx(int a) {
		System.out.println("protected 생성자");
	}
		
	// 같은 패키지에서 호출 가능
	Ex02_ConstructorEx(int a, int b){
		System.out.println("default 생성자");
	}
	
	
	// 오로지 클래스 내부에서만 생성자 호출 가능
	private Ex02_ConstructorEx(int a, int b, int c) {
		System.out.println("private 생성자");
	}
	
	
	public static void main(String[] args) {
		
		Ex02_ConstructorEx ex1 = new Ex02_ConstructorEx();
		Ex02_ConstructorEx ex2 = new Ex02_ConstructorEx(1);
		Ex02_ConstructorEx ex3 = new Ex02_ConstructorEx(1, 2);
		Ex02_ConstructorEx ex4 = new Ex02_ConstructorEx(1, 2, 3);
	}
	

}
