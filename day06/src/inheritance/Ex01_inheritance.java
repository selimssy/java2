package inheritance;



class Parent{  // 부모클래스
	
	int parentMoney = 1000;
	
	public void parentMethod() {
		System.out.println("부모클래스 메소드 입니다.");
	}
	
}



class Child extends Parent{   // 자식클래스
	
	int childMoney = 500;
	
	public void childMethod() {
		System.out.println("자식클래스 메소드 입니다.");
	}
	
}




public class Ex01_inheritance {

	public static void main(String[] args) {
		
		
		Child child = new Child();
		
		System.out.println("childMoney : " + child.childMoney);  // childMoney : 500
		System.out.println("parentMoney : " + child.parentMoney);  // parentMoney : 1000
		child.childMethod();  // 자식클래스 메소드 입니다.
		child.parentMethod();  //  부모클래스 메소드 입니다.
		
	}

}
