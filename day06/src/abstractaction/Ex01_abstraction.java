package abstractaction;

// �߻�Ŭ����
// �߻�Ŭ������ ��ü���� �԰� ���ߴ� ���赵 ������
// ��ü���� �Ұ�


abstract class Animal{  // �߻�Ŭ����
	
	abstract void sound();  // �߻�޼ҵ� : ���� ������ �ڽ�Ŭ�������� �Ѵ�
	
	public void eat() {
		System.out.println("�ȳ�");
	}
	
}



class Dog extends Animal{
	
	// �θ��� �߻�޼ҵ�� �ݵ�� �������̵��ؼ� ������ �ۼ��ؾ� �ϸ� �׷��� ������ �����߻�!!
	@Override
	void sound() {
		System.out.println("�۸�");
	}
	
	
	
}




public class Ex01_abstraction {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.eat();   // �ȳ�
		dog.sound();  // �۸�
		
	}

}
