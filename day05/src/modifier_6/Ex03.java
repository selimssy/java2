package modifier_6;

public class Ex03 {
	
	
	static {  // static 블록 : static 필드 초기화 역할
		System.out.println("static 블록");
	}
	
	
	
	{// 인스턴스 블록 : 객체 생성시 호출되어 객체초기화 역할
		System.out.println("인스턴스 블록");
	}
	
	
	public Ex03(){
		System.out.println("생성자");
	}
	

	public static void main(String[] args) {
		
		System.out.println("메인메소드 시작!");
		
		Ex03 ex1 = new Ex03();
		
		Ex03 ex2 = new Ex03();
		
		System.out.println("메인메소드 끝!");
	}

}
