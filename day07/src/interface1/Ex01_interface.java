package interface1;




// �������̽�
// 1. �߻�Ŭ�������� �ξ� �ش����̰� �������� ������ ������
// 2. ����� �߻�޼��常 ������ �� �ִ�.(���� �ִ�!)
// 3. ��� ��������� public static final �̾��(public static final �����ص� �ڵ����� �̰ɷ� ���������)
// 4. ��� �޼���� public abstract�̾��(public abstract �����ص� �̰ɷ� ���������)
// 5. ��ӹ������� extends�� �ƴ� implements�� ����Ѵ�
// 6. ���߻���� �����ϴ�
// 7. ������     interface �̸�   ���� �Ѵ�.
// 8. �������̽��� ���� ��� �� �����̸��� �޼ҵ尡 �־ ���� ����� ����. ��ӹ��� �� ������ �ϱ� ������!!



interface Animal{
	
	public static final int MAX_AGE = 500;
	
	public abstract void sound();
	
	// ��� ��������� public static final �̾��(public static final �����ص� �ڵ����� �̰ɷ� ���������)
	// ��� �޼���� public abstract�̾��(public abstract �����ص� �̰ɷ� ���������)
	// ��, static �޼���� default �޼��� ���ܷ� �Ѵ�!
	
	
	
	
	
	
	public default void defaultMethod() {
		System.out.println("default �޼ҵ�");
	}
	
	// default �޼ҵ�
	// 1. �ڹ� 1.8���� ���ķ� �������̽��� �߰� ���
	// 2. �߻�޼ҵ尡 �ƴϱ� ������ ��� �� �������� �ʾƵ� �ȴ�.
	// 3. �տ� Ű���� default�� ����ؾ� �Ѵ�.
	// 4. ���������ڴ� public�̸� �����ص� �ڵ����� public���� ���������.
	// 5. ������: ���������� default�� �ƴϴ�(public�̴�)!!!
	
	
	
	
	
	public static void staticMethod() {
		System.out.println("static �޼ҵ�");
	}
	
	// static �޼ҵ�
	// 1. �ڹ� 1.8���� ���ķ� �������̽��� �߰� ���
	// 2. ���������ڴ� public�̸� �����ص� �ڵ����� public���� ���������.
}







class Cat implements Animal{

	@Override
	public void sound() {
		System.out.println("�߿�~");
	}
	
	
}


class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("�۸�~");
	}
	
	
}






public class Ex01_interface {

	public static void main(String[] args) {
		
		Cat myCat = new Cat();
		myCat.sound();  // �߿�~
		
		
		Dog myDog = new Dog();
		myDog.sound();  // �۸�~
		
		
		
		Animal myAnimal = new Cat();    // ������
		myAnimal.sound();  // �߿�~
		
		myAnimal = new Dog();
		myAnimal.sound();   // �۸�~
		
	}

}
