package pack01_access_modifier;

public class Ex02_constructorTest1 {

	public static void main(String[] args) {
			
		Ex02_ConstructorEx ex1 = new Ex02_ConstructorEx();
		Ex02_ConstructorEx ex2 = new Ex02_ConstructorEx(1);
		Ex02_ConstructorEx ex3 = new Ex02_ConstructorEx(1, 2);
		//Ex02_ConstructorEx ex4 = new Ex02_ConstructorEx(1, 2, 3);  // private 생성자는 오로지 해당 클래스 내부에서만 호출 가능
		
	}

}
