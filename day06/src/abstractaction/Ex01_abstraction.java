package abstractaction;

// 추상클래스
// 추상클래스는 객체들의 규격 맞추는 설계도 느낌★
// 객체생성 불가


abstract class Animal{  // 추상클래스
	
	abstract void sound();  // 추상메소드 : 실제 구현은 자식클래스에서 한다
	
	public void eat() {
		System.out.println("냠냠");
	}
	
}



class Dog extends Animal{
	
	// 부모의 추상메소드는 반드시 오버라이딩해서 구현부 작성해야 하며 그렇지 않으면 에러발생!!
	@Override
	void sound() {
		System.out.println("멍멍");
	}
	
	
	
}




public class Ex01_abstraction {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.eat();   // 냠냠
		dog.sound();  // 멍멍
		
	}

}
