package poly;

// 다형성 : 부모클래스 타입으로 자식객체를 얻는 것
// 1. 부모클래스가 가지고 있는 모든 멤버들에만 접근 가능(자식클래스에만 있는거 접근 불가, 재정의 했을 때는 자식메소드가 호출)


class Run{
	
	int speed = 100;
	
	public void run() {
		System.out.println(speed + "의 속도로 달린다.");
	}
	
}



class Person extends Run{
	
	String name = "홍길동";
	
	public void walk() {
		System.out.println(name + "이 산책을 한다.");
	}

	
	@Override
	public void run() {
		System.out.println(name + "이 " + speed + "의 속도로 달린다");    // 여기서는 자식에게만 있는 name에 접근 가능!!★
		walk();     // 역시 자식에게만 있는 walk() 도 접근 가능!!★
	}

}




class KiaCar extends Run{
	
	String model = "k5";
	
	public void parking() {
		System.out.println(model + "가 주차를 한다.");
	}

	@Override
	public void run() {
		System.out.println(model + "가 " + speed + "의 속도로 달린다.");
		parking();
	}
	
	
	
}




public class Ex02_polymorphism {

	public static void main(String[] args) {
		
		Run run = new Person();
		System.out.println(run.speed);
		//System.out.println(run.name);   // 불가!
		//System.out.println(walk()); // 불가!
		run.run();   // 홍길동이 100의 속도로 달린다   /  홍길동이 산책을 한다.

		
		
		System.out.println();
		
		
		run = new KiaCar();     // 부모타입 변수니까 다른 자식객체로 바꿀 수 있다!
		run.run();  // k5가 100의 속도로 달린다.  /  k5가 주차를 한다.
		
		
	}

}
