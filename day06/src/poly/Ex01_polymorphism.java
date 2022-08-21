package poly;



class Parent{
	
	int perentMoney = 1000;
	
}



class Child extends Parent{
	
	int childMoney = 500;
	
}



public class Ex01_polymorphism {

	public static void main(String[] args) {
		
		Parent poly = new Child();   // ��ĳ����(�ڵ�Ÿ�Ժ�ȯ)
		// �������� �θ�Ÿ���� ������ �ڽİ�ü�� �����ϴ� ��(�θ��ʵ�� �θ�޼ҵ常 ���� ����!!)
		
		System.out.println(poly.perentMoney);  // �θ������� ���� ����
		//System.out.println(poly.childMoney);   // �ڽĸ������ ���� �Ұ�!
		
		
		// �ڽĸ������ ��ߵǸ� ����Ÿ�Ժ�ȯ �ؾ�!!
		Child poly2 = (Child)poly;  // �ٿ�ĳ����(���� Ÿ�Ժ�ȯ)
		System.out.println(poly2.perentMoney);  // 1000
		System.out.println(poly2.childMoney);  // 500
		
		System.out.println();
		
		
		
		Parent poly3 = poly2;   // �ٽ� ��ĳ����(�ڵ� Ÿ�Ժ�ȯ)
		// �ٽ� �θ��������ۿ� ������!!
		System.out.println(poly3.perentMoney);
		//System.out.println(poly3.childMoney);   // �Ұ�
	}

}
