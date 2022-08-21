package poly;



class Parent{
	
	int perentMoney = 1000;
	
}



class Child extends Parent{
	
	int childMoney = 500;
	
}



public class Ex01_polymorphism {

	public static void main(String[] args) {
		
		Parent poly = new Child();   // 업캐스팅(자동타입변환)
		// 다형성은 부모타입의 변수를 자식객체로 생성하는 것(부모필드와 부모메소드만 접근 가능!!)
		
		System.out.println(poly.perentMoney);  // 부모멤버변수 접근 가능
		//System.out.println(poly.childMoney);   // 자식멤버변수 접근 불가!
		
		
		// 자식멤버변수 써야되면 강제타입변환 해야!!
		Child poly2 = (Child)poly;  // 다운캐스팅(강제 타입변환)
		System.out.println(poly2.perentMoney);  // 1000
		System.out.println(poly2.childMoney);  // 500
		
		System.out.println();
		
		
		
		Parent poly3 = poly2;   // 다시 업캐스팅(자동 타입변환)
		// 다시 부모멤버변수밖에 못쓴다!!
		System.out.println(poly3.perentMoney);
		//System.out.println(poly3.childMoney);   // 불가
	}

}
