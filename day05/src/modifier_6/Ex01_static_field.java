package modifier_6;



class Box{
	
	static int boxID = 0;   
	// static 변수 : 메모리상의 정적
	// 프로그램 시작시 메모리의 메소드영역에 저장된다
	// 공유되는 전역변수이다
		
	int idNum = 0;  
	// 인스턴스 변수
	// 클래스로부터 객체를 생성시 메모리의 힙영역에 할당된다
	
	public void increase() {
		boxID++;
		idNum++;
	}
	
}




public class Ex01_static_field {

	public static void main(String[] args) {
		
		Box box1 = new Box();
		Box box2 = new Box();
		Box box3 = new Box();
		
		
		// 인스턴스 변수는 객체마다 공유되지 않고 static 변수는 모든 객체가 공유된다
		// 정적필드는 원칙적으로 클래스명으로 접근!
		
		box1.increase();
		System.out.println("boxID : " + box1.boxID);  // boxID : 1    // 원칙적으로 클래스명으로 접근해야!!  box1.boxID 이렇게해도 제대로 출력은 된다.. 근데 그러지말자
		System.out.println("boxID : " + box1.idNum);  // boxID : 1
		
		
		System.out.println();
		box2.increase();
		System.out.println("boxID : " + box2.boxID);  // boxID : 2 (계속 누적)
		System.out.println("boxID : " + box2.idNum);  // boxID : 1
		
		
		System.out.println();
		box3.increase();
		System.out.println("boxID : " + box3.boxID);  // boxID : 3 (계속 누적)
		System.out.println("boxID : " + box3.idNum);  // boxID : 1
		
		
		
	}

}
