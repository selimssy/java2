package clazz.constructor_3;


class Student{
	
	// �ʵ�
	String school = "IT �б�";
	int studentID;
	String name;
	int age;
	
	
	// ������
	// ������ ��� ���ϸ� �ڹ������Ϸ��� �⺻������ ����
	// �׷��� �����ڸ� ������ָ� ������ �ʴ´�......��
	// ������ �տ� void ���� ���� �ʴ´�!!! ������ �ڿ� �ٷ� Student() �̷�������!!�ڡ�
	public Student(int studentID, String name, int age) {
		this.studentID = studentID;
		this.name = name;
		this.age = age;
	}
	
	// �̷��� �ϸ� �⺻�����ڰ� ��������� �ʴ´�...!!!
}




public class Ex01_constructor {

	public static void main(String[] args) {
		
		
		//Student stud = new Student();  
		// �����ڸ� ����ؼ� ������� ������ �⺻������ �ȸ�������� ���� ���� �⺻������ ��� �Ұ�!!!(�� �⺻������ ��������� �⺻�����ڸ� ���� ��������)
	
		Student stud = new Student(202201, "ȫ�浿", 20);
		System.out.println("�б� : " + stud.school + ", �й� : " + stud.studentID 
							+ ", �̸� : " + stud.name + ", ���� : " + stud.age);  // // �б� : IT �б�, �й� : 202201, �̸� : ȫ�浿, ���� : 20
		
		
	}

}
