package clazz.field_2;


class  Student{
	
	// �ʵ�
	int studentID = 202201;
	String name = "ȫ�浿";
	
	
	// �޼ҵ�
	public void study() {
		
		// ��������(�޸��� stack:���ÿ����� ���� : �޼ҵ��� ȣ��� �Բ� �Ҵ�Ǹ�, �޼ҵ� ȣ���� �Ϸ�Ǹ� �Ҹ��Ѵ�.)
		// �ش� ��Ͽ����� ��� ����
		String place = "������";
		int time = 2;  // �̷��� �ʵ忡 ������ �͵� ���� �� �ִ�!!
		System.out.println(place + "���� " + time + "�ð� ���� �����ϱ�!");
				
	}
	
	
	
	public void profile() {
		//System.out.println(place);   // study() �޼ҵ��� ���������� �̷��� �ٸ� �޼ҵ忡�� ��� �Ұ�!
		
		System.out.println("�̸� : " + name);  // �ʵ�� ��ü���� ��� ����(�ش� Ŭ���������� �̸����� ��� ����)
		System.out.println("�й� : " + studentID );
	}
	
}



public class Ex01_class {

	public static void main(String[] args) {
		
		// ��ü ����
		Student stud = new Student(); 
		
		// ��ü ��� : �ʵ�
		System.out.println(stud.name);  // ȫ�浿
		System.out.println(stud.studentID);  // 202201
		
		
		// ��ü ��� : �޼���
		stud.study();   // ���������� 2�ð� ���� �����ϱ�!
		stud.profile();  // �̸� : ȫ�浿 / �й� : 202201
		
		
		
	}

}
