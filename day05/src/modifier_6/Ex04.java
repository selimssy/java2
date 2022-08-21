package modifier_6;



class Person{
	
	static final String NATION = "KOREA";    
	// ���� �Һ��� ����� ����� ���ÿ� �ʱ�ȭ�ؾ�  // ����: ���뵥����
	
	final String SSN;
	// �Һ��� �ν��Ͻ� ���
	// ����� ���ÿ� �ʱ�ȭ �ϰų� Ȥ�� �����ڿ��� �ʱ�ȭ
	// ��, �� ���� �ʱ�ȭ ����!!
	
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
		
		Person person = new Person("123456-1234567", "ȫ�浿", 20);
		
		System.out.println("���� : " + person.NATION);  // ���� : KOREA
		System.out.println("�ֹι�ȣ : " + person.SSN);  // �ֹι�ȣ : 123456-1234567
		System.out.println("�̸� : " + person.name);  // �̸� : ȫ�浿
		System.out.println("���� : " + person.age);  // ���� : 20
				
		
		// ���(static final)�� �� �� ���� �ʱ�ȭ�� �����ϰ� ������ �Ұ��ϴ�!!
		//person.NATION = "USA"; 
		//person.SSN = "111111-2222222"
		
		person.name = "ȫ���";
		person.age = 24;
		
		System.out.println("���� : " + person.NATION);  // ���� : KOREA
		System.out.println("�ֹι�ȣ : " + person.SSN);  // �ֹι�ȣ : 123456-1234567
		System.out.println("�̸� : " + person.name);  // �̸� : ȫ���
		System.out.println("���� : " + person.age);  // ���� : 24
	}

}
