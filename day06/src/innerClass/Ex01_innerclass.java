package innerClass;



// Inner Ŭ�������� OuterŬ������� ���� ����

class Outer1{
	
	private int x = 100;
	private static int y = 200;
	
	public void outerMethod1() {
		System.out.println("public �ٱ�Ŭ���� �޼ҵ�");
	}
	
	private void outerMethod2() {
		System.out.println("private �ٱ�Ŭ���� �޼ҵ�");
	}
	
	
	
	class Inner1{  // �ν��Ͻ� ��� Ŭ����
		
		private int y = 300;
		
		//private static int z = 300;   // �ν��Ͻ� ���Ŭ������ ��������� ���� �� ����
		
		public void disp() {
			System.out.println("Outer x : " + x);
			//System.out.println("Outer y : " + y);  // �̷����ϸ� �� ���� y�� ���  // Outer1�� y�� ����Ϸ��� Outer1.y�� ����!!
			System.out.println("Outer y : " + Outer1.y);
			System.out.println("Inner y : " + this.y); //�׳� y��� �ص� �Ǳ� �ϴ�
			
			outerMethod1();
			outerMethod2();
			
		}
		
	}
	
	
	
}






public class Ex01_innerclass {

	public static void main(String[] args) {
		
		// �켱 Outer1 Ŭ���� ��ü�� ���������!
		Outer1 outer = new Outer1();
		
		
		Outer1.Inner1 inner = outer.new Inner1();
		
		inner.disp();
		
	}

}
