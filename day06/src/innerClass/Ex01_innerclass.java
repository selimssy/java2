package innerClass;



// Inner 클래스에서 Outer클래스멤버 접근 예제

class Outer1{
	
	private int x = 100;
	private static int y = 200;
	
	public void outerMethod1() {
		System.out.println("public 바깥클래스 메소드");
	}
	
	private void outerMethod2() {
		System.out.println("private 바깥클래스 메소드");
	}
	
	
	
	class Inner1{  // 인스턴스 멤버 클래스
		
		private int y = 300;
		
		//private static int z = 300;   // 인스턴스 멤버클래스는 정적멤버를 만들 수 없다
		
		public void disp() {
			System.out.println("Outer x : " + x);
			//System.out.println("Outer y : " + y);  // 이렇게하면 내 변수 y를 사용  // Outer1의 y를 사용하려면 Outer1.y로 접근!!
			System.out.println("Outer y : " + Outer1.y);
			System.out.println("Inner y : " + this.y); //그냥 y라고 해도 되긴 하다
			
			outerMethod1();
			outerMethod2();
			
		}
		
	}
	
	
	
}






public class Ex01_innerclass {

	public static void main(String[] args) {
		
		// 우선 Outer1 클래스 객체를 생성해줘야!
		Outer1 outer = new Outer1();
		
		
		Outer1.Inner1 inner = outer.new Inner1();
		
		inner.disp();
		
	}

}
