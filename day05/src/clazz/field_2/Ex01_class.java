package clazz.field_2;


class  Student{
	
	// 필드
	int studentID = 202201;
	String name = "홍길동";
	
	
	// 메소드
	public void study() {
		
		// 지역변수(메모리의 stack:스택영역에 저장 : 메소드의 호출과 함께 할당되며, 메소드 호출이 완료되면 소멸한다.)
		// 해당 블록에서만 사용 가능
		String place = "도서관";
		int time = 2;  // 이렇게 필드에 없었던 것도 만들 수 있다!!
		System.out.println(place + "에서 " + time + "시간 동안 공부하기!");
				
	}
	
	
	
	public void profile() {
		//System.out.println(place);   // study() 메소드의 지역변수는 이렇게 다른 메소드에서 사용 불가!
		
		System.out.println("이름 : " + name);  // 필드는 전체에서 사용 가능(해당 클래스에서는 이름으로 사용 가능)
		System.out.println("학번 : " + studentID );
	}
	
}



public class Ex01_class {

	public static void main(String[] args) {
		
		// 객체 생성
		Student stud = new Student(); 
		
		// 객체 사용 : 필드
		System.out.println(stud.name);  // 홍길동
		System.out.println(stud.studentID);  // 202201
		
		
		// 객체 사용 : 메서드
		stud.study();   // 도서관에서 2시간 동안 공부하기!
		stud.profile();  // 이름 : 홍길동 / 학번 : 202201
		
		
		
	}

}
