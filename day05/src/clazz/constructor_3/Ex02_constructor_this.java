package clazz.constructor_3;


class Student2{
	
	// �ʵ�
	String school = "IT�б�";
	String name;
	int age;
	int studentID;
	
	
	//�⺻������(����� ������ ����µ� �⺻�����ڵ� ������ �̷��� �⺻�����ڵ� ���� ��������!!!��)
	public Student2() {
		
	}
	
	// ������ �����ε�(�Ű������� Ÿ��, ����, ���� �� �ϳ��� �޶�� �Ѵ�)
	public Student2(String name) {
		//this.name = name;
		//this() : ������ ������ �ٸ� �����ڸ� ȣ���� �� this() ���! (�� ù �ٿ��� ��� ����)
		this(name, 0, 000000);  // �� �Ʒ� ������ ȣ��
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
		System.out.println("�б� : " + school);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�й� : " + studentID);
	}
	
	
}




public class Ex02_constructor_this {

	public static void main(String[] args) {
		
		Student2 stud = new Student2("ȫ�浿", 20, 202201);
		stud.profile();
	}

}
