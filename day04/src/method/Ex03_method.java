package method;

public class Ex03_method {
	
	// 메소드 오버로딩
	// 조건 : 매개변수의 타입, 갯수, 순서중 하나가 달라야 한다.
	
	
	
	public static void profile(String name) {
		System.out.println("이름만 공개할게요. 저의 이름은 " + name + "입니다.");
	}
	
	
	
	public static void profile(int age) {
		System.out.println("나이만 공개할게요. 나이는 " + age + "세입니다.");
	}
	
	
	
	public static void profile(String name, int age) {
		System.out.println("이름은 " + name + "이고 나이는 " + age + "세입니다.");
	}
	
	
	
	public static void profile(int age, String name) {
		System.out.println("나이 먼저 출력 : " + age + "세, 이름 : " + name);
	}
	
	

	
	
	
	
	
	public static void main(String[] args) {
		
		
		profile("홍길동");   // 이름만 공개할게요. 저의 이름은 홍길동입니다.
		
		profile(20);    // 나이만 공개할게요. 나이는 20세입니다.
		
		profile("홍길동", 20);   // 이름은 홍길동이고 나이는 20세입니다.
		
		profile(20, "홍길동");   // 나이 먼저 출력 : 20세, 이름 : 홍길동
		
		
		
	}

}
