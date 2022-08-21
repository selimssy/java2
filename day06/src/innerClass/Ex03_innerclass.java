package innerClass;



class Outer3{
	
	private int x = 100;
	private static int y = 200;
	
	
	static class Inner3{ // static 멤버클래스에서는 모든 종류의 멤버를 선언할 수 있다!
		
		private int z = 300;
		private static int zz = 400;
		
		public void disp() {
			
			//System.out.println("Outer x : " + x);  // 바깥쪽 클래스의 인스턴스 멤버는 사용 불가!
			System.out.println("Outer y : " + y);
			System.out.println("Inner z : " + z);
			System.out.println("Inner zz : " + zz);
			
		}
	}
	
}




public class Ex03_innerclass {

	public static void main(String[] args) {
		
		Outer3.Inner3 inner = new Outer3.Inner3();  // Outer3 객체 생성 없이 바로 접근
		
		inner.disp();
		
		
	}

}
