package innerClass;


// ����Ŭ����

class LocalEx{
	
	
	public void method() {
		
		
		class LocalInner{		
			int x = 100;
			// static int y = 200;  // ����Ŭ���� �ȿ��� static ��� ������ �� ����		
			void disp() {
				System.out.println("methodInner x : " + x);
			}
				
		}
	
			
		LocalInner inner = new LocalInner();
			inner.disp();
		
	}
	
}





public class Ex04_innerclass {

	public static void main(String[] args) {
		
		LocalEx ex = new LocalEx();
		ex.method();
		
	}

}
