package clazz.constructor_3;


class Student2{
	
	// 필드
	String school = "IT학교";
	String name;
	int age;
	int studentID;
	
	
	//기본생성자(명시적 생성자 만드는데 기본생성자도 쓰려면 이렇게 기본생성자도 따로 만들어줘야!!!★)
	public Student2() {
		
	}
	
	// 생성자 오버로딩(매개변수의 타입, 갯수, 순서 중 하나가 달라야 한다)
	public Student2(String name) {
		//this.name = name;
		//this() : 생성자 내에서 다른 생성자를 호출할 때 this() 사용! (※ 첫 줄에만 사용 가능)
		this(name, 0, 000000);  // 맨 아래 생성자 호출
	}
	
	public Student2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Student2(String name, int age, int studentID) {
		this.name = name;
		this.age = age;
		this.studentID = studentID;
	}
	
	
	
	public void profile() {
		System.out.println("학교 : " + school);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("학번 : " + studentID);
	}
	
	
}




public class Ex02_constructor_this {

	public static void main(String[] args) {
		
		Student2 stud = new Student2("홍길동", 20, 202201);
		stud.profile();
	}

}
