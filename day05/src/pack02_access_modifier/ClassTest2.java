package pack02_access_modifier;

import pack01_access_modifier.A;

public class ClassTest2 {

	public static void main(String[] args) {
		
		A a = new A();   // A 클래스는 public 클래스라서 다른 패키지에서도 접근 가능! // 근데 import 해서 사용해야!!
		
		// B b = new B();   // default 클래스는 import 자체가 되지 않는다!!★
	}

}
