package poly;



class Job{
	
	
	public void hello() {
		System.out.println("������ �����Դϴ�.");
	}
	
}



class Teacher extends Job{
	
	String job = "����";
	public void teach() {
		System.out.println("�л����� �����Ŀ�.");
	}

	@Override
	public void hello() {
		System.out.println("������ " + job + "�Դϴ�.");
		teach();
	}
	
	
}



class Student extends Job{
	
	String job = "�л�";
	public void study() {
		System.out.println("���θ� �ؿ�.");
	}

	@Override
	public void hello() {
		System.out.println("������ " + job + "�Դϴ�.");
		study();
	}

}





public class poly_me {

	public static void main(String[] args) {
		
		
		
		
	}

}
