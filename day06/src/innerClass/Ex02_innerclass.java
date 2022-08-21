package innerClass;


// Outer 클래스에서 Inner 클래스멤버 접근예제

class Outer2{
	
	private int x = 100;
	
	public void disp() { 
		
		System.out.println("Outer x : " + x );
		
		//System.out.println("Inner y : " + y);  // 그냥 이렇게는 내부클래스에 접근 불가(Inner클래스도 클래스기 때문에 객체를 생성해서 접근해야!(전에 안쪽클래서에서 바깥클래스 접근할때는 바깥클래스 객체 생성 후 안쪽 클래스 생성하는 순서이기 때문에 이미 메모리상에 바깥클래서가 올라가있어서 그냥 접근가능했던 ))
	
		Inner2 inner = new Inner2();
		System.out.println("Inner y : " + inner.y);
		inner.innerMethod1();
		inner.innerMethod2();
	}
	
	class Inner2{
		
		private int y = 200;
		
		public void innerMethod1() {
			System.out.println("public 안쪽클래서 메소드");
		}
		
		private void innerMethod2() {
			System.out.println("private 안쪽클래스 메소드");
		}
		
		
	}
	
	
}




public class Ex02_innerclass {

	public static void main(String[] args) {
		
		Outer2 outer = new Outer2();
		outer.disp();
		
	}

}
