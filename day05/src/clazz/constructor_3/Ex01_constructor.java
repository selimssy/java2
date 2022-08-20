package clazz.constructor_3;


class Student{
	
	// 필드
	String school = "IT 학교";
	int studentID;
	String name;
	int age;
	
	
	// 생성자
	// 생성자 명시 안하면 자바컴파일러가 기본생성자 생성
	// 그러나 생성자를 명시해주면 만들지 않는다......★
	// 생성자 앞에 void 절대 쓰지 않는다!!! 제한자 뒤에 바로 Student() 이런식으로!!★★
	public Student(int studentID, String name, int age) {
		this.studentID = studentID;
		this.name = name;
		this.age = age;
	}
	
	// 이렇게 하면 기본생성자가 만들어지지 않는다...!!!
}




public class Ex01_constructor {

	public static void main(String[] args) {
		
		
		//Student stud = new Student();  
		// 생성자를 명시해서 만들었기 때문에 기본생성자 안만들어져서 위와 같이 기본생성자 사용 불가!!!(꼭 기본생성자 쓰고싶으면 기본생성자를 직접 명시해줘야)
	
		Student stud = new Student(202201, "홍길동", 20);
		System.out.println("학교 : " + stud.school + ", 학번 : " + stud.studentID 
							+ ", 이름 : " + stud.name + ", 나이 : " + stud.age);  // // 학교 : IT 학교, 학번 : 202201, 이름 : 홍길동, 나이 : 20
		
		
	}

}
