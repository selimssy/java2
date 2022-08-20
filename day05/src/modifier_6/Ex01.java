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




public class Ex01 {

	public static void main(String[] args) {
		
		Box box1 = new Box();
		Box box2 = new Box();
		Box box3 = new Box();
		
		box1.increase();
		System.out.println("boxID : " + Box.boxID);  // boxID : 1    // box1.boxID 이렇게해도 제대로 출력은 된다.. 근데 그러지말자
		System.out.println("boxID : " + box1.idNum);  // boxID : 1
		
		
		System.out.println();
		box2.increase();
		System.out.println("boxID : " + Box.boxID);  // boxID : 2 (계속 누적)
		System.out.println("boxID : " + box2.idNum);  // boxID : 1
		
		
		System.out.println();
		box3.increase();
		System.out.println("boxID : " + Box.boxID);  // boxID : 3 (계속 누적)
		System.out.println("boxID : " + box3.idNum);  // boxID : 1
		
		
		
	}

}
