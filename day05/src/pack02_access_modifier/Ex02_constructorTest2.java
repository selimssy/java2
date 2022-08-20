package pack02_access_modifier;

import pack01_access_modifier.Ex02_ConstructorEx;

public class Ex02_constructorTest2 {

	public static void main(String[] args) {
		
		Ex02_ConstructorEx ex1 = new Ex02_ConstructorEx();
		//Ex02_ConstructorEx ex2 = new Ex02_ConstructorEx(1);     // protected 생성자 다른 패키지에서 호출 불가
		//Ex02_ConstructorEx ex3 = new Ex02_ConstructorEx(1, 2);   // default 생성자 다른 패키지에서 호출 불가
		//Ex02_ConstructorEx ex4 = new Ex02_ConstructorEx(1, 2, 3);  // private 생성자는 오로지 해당 클래스 내부에서만 호출 가능
		
	}

}
