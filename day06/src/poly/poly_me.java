package poly;



class Job{
	
	
	public void hello() {
		System.out.println("직업은 ㅇㅇ입니다.");
	}
	
}



class Teacher extends Job{
	
	String job = "교사";
	public void teach() {
		System.out.println("학생들을 가르쳐요.");
	}

	@Override
	public void hello() {
		System.out.println("직업은 " + job + "입니다.");
		teach();
	}
	
	
}



class Student extends Job{
	
	String job = "학생";
	public void study() {
		System.out.println("공부를 해요.");
	}

	@Override
	public void hello() {
		System.out.println("직업은 " + job + "입니다.");
		study();
	}

}





public class poly_me {

	public static void main(String[] args) {
		
		
		
		
	}

}
