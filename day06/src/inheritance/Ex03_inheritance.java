package inheritance;



/*final*/ class Suv{  // final 클래스 : 최종적인 클래스(다른 클래스가 상속 불가)
	
	private String color;     // 부모클래스의 private 멤버변수는 자식클래스가 상속받았을 때 상속에서 제외된다!(같은 원리로 default 멤버변수(필드,메소드)는 다른패키지의 자시클래스에서 상속 시 상속에서 제외)
	
	int speed = 100;
	
	
	public void run() {
		System.out.println("SUV 차량이 달립니다.");
	}
	
}



// class Santafe extends Suv{}    // final 클래스는 상속받을 수 없다!

class Santafe extends Suv{
	
	int speed = 120;  // 이거 바꾸려면 int까지 붙여서 선언해야되네.....
	
	
	@Override   // 어노테이션
	public void run() {  // 메소드 재정의(오버라이딩)
		System.out.println("싼타페 차량이 달립니다.");
	}
	
	
	// @Override 어노테이션
	// 메소드 선언시 사용되며 메소드가 재정의(오버라이드) 된 것임을 컴파일러에게 알려주어 컴파일러가 검사를 하도록 한다(상속 조건 맞는지 등)
	// 만약 오버라이드가 되지 않았다면 컴파일러는 에러를 발생시킨다!(이름이 틀리거나 반환타입 다르거나 등)
	
	
	public void disp() {
		
		System.out.println("SUV 속도 : " + super.speed);  // 부모클래스의 필드와 자식클래스에서 만든 필드이름이 같을 경우 부모클래스 멤버를 사용하기 위해서는 super 키워드 사용해야!!(그냥 사용하면 this가 생략되어 자식클래스의 멤버 사용된다)
		super.run();
		
		System.out.println("싼타페 속도 : " + this.speed);  // 그냥 speed라해도 된다
		this.run();  //그냥 run()이라해도 된다
	}
	
} 



public class Ex03_inheritance {

	public static void main(String[] args) {
		
		Santafe santafe = new Santafe();
		
		santafe.run();  // 싼타페 차량이 달립니다.
		System.out.println();
		santafe.disp();
		
		
	}

}
