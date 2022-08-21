package innerClass;


// 로컬클래스

class LocalEx{
	
	
	public void method() {
		
		
		class LocalInner{		
			int x = 100;
			// static int y = 200;  // 로컬클래스 안에서 static 멤버 선언할 수 없다		
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
