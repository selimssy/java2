package modifier_6;



class Person{
	
	static final String NATION = "KOREA";    
	// 정적 불변의 상수는 선언과 동시에 초기화해야  // 역할: 공용데이터
	
	final String SSN;
	// 불변의 인스턴스 상수
	// 선언과 동시에 초기화 하거나 혹은 생성자에서 초기화
	// 단, 한 번만 초기화 가능!!
	
	String name;
	int age;
	
	
	public Person(String ssn, String name, int age) {
		this.SSN = ssn;
		this.name = name;
		this.age = age;
	}
	
}


public class Ex04 {

	public static void main(String[] args) {
		
		Person person = new Person("123456-1234567", "홍길동", 20);
		
		System.out.println("나라 : " + person.NATION);  // 나라 : KOREA
		System.out.println("주민번호 : " + person.SSN);  // 주민번호 : 123456-1234567
		System.out.println("이름 : " + person.name);  // 이름 : 홍길동
		System.out.println("나이 : " + person.age);  // 나이 : 20
				
		
		// 상수(static final)는 단 한 번만 초기화가 가능하고 수정이 불가하다!!
		//person.NATION = "USA"; 
		//person.SSN = "111111-2222222"
		
		person.name = "홍길순";
		person.age = 24;
		
		System.out.println("나라 : " + person.NATION);  // 나라 : KOREA
		System.out.println("주민번호 : " + person.SSN);  // 주민번호 : 123456-1234567
		System.out.println("이름 : " + person.name);  // 이름 : 홍길순
		System.out.println("나이 : " + person.age);  // 나이 : 24
	}

}
