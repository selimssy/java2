package innerClass;



class Outer3{
	
	private int x = 100;
	private static int y = 200;
	
	
	static class Inner3{ // static ���Ŭ���������� ��� ������ ����� ������ �� �ִ�!
		
		private int z = 300;
		private static int zz = 400;
		
		public void disp() {
			
			//System.out.println("Outer x : " + x);  // �ٱ��� Ŭ������ �ν��Ͻ� ����� ��� �Ұ�!
			System.out.println("Outer y : " + y);
			System.out.println("Inner z : " + z);
			System.out.println("Inner zz : " + zz);
			
		}
	}
	
}




public class Ex03_innerclass {

	public static void main(String[] args) {
		
		Outer3.Inner3 inner = new Outer3.Inner3();  // Outer3 ��ü ���� ���� �ٷ� ����
		
		inner.disp();
		
		
	}

}
