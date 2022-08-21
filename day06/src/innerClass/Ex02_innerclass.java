package innerClass;


// Outer Ŭ�������� Inner Ŭ������� ���ٿ���

class Outer2{
	
	private int x = 100;
	
	public void disp() { 
		
		System.out.println("Outer x : " + x );
		
		//System.out.println("Inner y : " + y);  // �׳� �̷��Դ� ����Ŭ������ ���� �Ұ�(InnerŬ������ Ŭ������ ������ ��ü�� �����ؼ� �����ؾ�!(���� ����Ŭ�������� �ٱ�Ŭ���� �����Ҷ��� �ٱ�Ŭ���� ��ü ���� �� ���� Ŭ���� �����ϴ� �����̱� ������ �̹� �޸𸮻� �ٱ�Ŭ������ �ö��־ �׳� ���ٰ����ߴ� ))
	
		Inner2 inner = new Inner2();
		System.out.println("Inner y : " + inner.y);
		inner.innerMethod1();
		inner.innerMethod2();
	}
	
	class Inner2{
		
		private int y = 200;
		
		public void innerMethod1() {
			System.out.println("public ����Ŭ���� �޼ҵ�");
		}
		
		private void innerMethod2() {
			System.out.println("private ����Ŭ���� �޼ҵ�");
		}
		
		
	}
	
	
}




public class Ex02_innerclass {

	public static void main(String[] args) {
		
		Outer2 outer = new Outer2();
		outer.disp();
		
	}

}
