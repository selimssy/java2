package inheritance;



class Parent{  // �θ�Ŭ����
	
	int parentMoney = 1000;
	
	public void parentMethod() {
		System.out.println("�θ�Ŭ���� �޼ҵ� �Դϴ�.");
	}
	
}



class Child extends Parent{   // �ڽ�Ŭ����
	
	int childMoney = 500;
	
	public void childMethod() {
		System.out.println("�ڽ�Ŭ���� �޼ҵ� �Դϴ�.");
	}
	
}




public class Ex01_inheritance {

	public static void main(String[] args) {
		
		
		Child child = new Child();
		
		System.out.println("childMoney : " + child.childMoney);  // childMoney : 500
		System.out.println("parentMoney : " + child.parentMoney);  // parentMoney : 1000
		child.childMethod();  // �ڽ�Ŭ���� �޼ҵ� �Դϴ�.
		child.parentMethod();  //  �θ�Ŭ���� �޼ҵ� �Դϴ�.
		
	}

}
