package interface1;




// 인터페이스
// 1. 추상클래스보다 훨씬 극단적이고 제한적인 성격을 가진다
// 2. 상수와 추상메서드만 정의할 수 있다.(예외 있다!)
// 3. 모든 멤버변수는 public static final 이어야(public static final 생략해도 자동으로 이걸로 만들어진다)
// 4. 모든 메서드는 public abstract이어야(public abstract 생략해도 이걸로 만들어진다)
// 5. 상속받으려면 extends가 아닌 implements를 사용한다
// 6. 다중상속이 가능하다
// 7. 선언은     interface 이름   으로 한다.
// 8. 인터페이스는 다중 상속 시 같은이름의 메소드가 있어도 전혀 상관이 없다. 상속받은 후 구현을 하기 때문에!!



interface Animal{
	
	public static final int MAX_AGE = 500;
	
	public abstract void sound();
	
	// 모든 멤버변수는 public static final 이어야(public static final 생략해도 자동으로 이걸로 만들어진다)
	// 모든 메서드는 public abstract이어야(public abstract 생략해도 이걸로 만들어진다)
	// 단, static 메서드와 default 메서는 예외로 한다!
	
	
	
	
	
	
	public default void defaultMethod() {
		System.out.println("default 메소드");
	}
	
	// default 메소드
	// 1. 자바 1.8버전 이후로 인터페이스에 추가 기능
	// 2. 추상메소드가 아니기 때문에 상속 후 구현하지 않아도 된다.
	// 3. 앞에 키워드 default로 명시해야 한다.
	// 4. 접근제한자는 public이며 생략해도 자동으로 public으로 만들어진다.
	// 5. ※유의: 접근제한자 default가 아니다(public이다)!!!
	
	
	
	
	
	public static void staticMethod() {
		System.out.println("static 메소드");
	}
	
	// static 메소드
	// 1. 자바 1.8버전 이후로 인터페이스에 추가 기능
	// 2. 접근제한자는 public이며 생략해도 자동으로 public으로 만들어진다.
}







class Cat implements Animal{

	@Override
	public void sound() {
		System.out.println("야옹~");
	}
	
	
}


class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("멍멍~");
	}
	
	
}






public class Ex01_interface {

	public static void main(String[] args) {
		
		Cat myCat = new Cat();
		myCat.sound();  // 야옹~
		
		
		Dog myDog = new Dog();
		myDog.sound();  // 멍멍~
		
		
		
		Animal myAnimal = new Cat();    // 다형성
		myAnimal.sound();  // 야옹~
		
		myAnimal = new Dog();
		myAnimal.sound();   // 멍멍~
		
	}

}
