package inheritance;



/*final*/ class Suv{  // final Ŭ���� : �������� Ŭ����(�ٸ� Ŭ������ ��� �Ұ�)
	
	private String color;     // �θ�Ŭ������ private ��������� �ڽ�Ŭ������ ��ӹ޾��� �� ��ӿ��� ���ܵȴ�!(���� ������ default �������(�ʵ�,�޼ҵ�)�� �ٸ���Ű���� �ڽ�Ŭ�������� ��� �� ��ӿ��� ����)
	
	int speed = 100;
	
	
	public void run() {
		System.out.println("SUV ������ �޸��ϴ�.");
	}
	
}



// class Santafe extends Suv{}    // final Ŭ������ ��ӹ��� �� ����!

class Santafe extends Suv{
	
	int speed = 120;  // �̰� �ٲٷ��� int���� �ٿ��� �����ؾߵǳ�.....
	
	
	@Override   // ������̼�
	public void run() {  // �޼ҵ� ������(�������̵�)
		System.out.println("��Ÿ�� ������ �޸��ϴ�.");
	}
	
	
	// @Override ������̼�
	// �޼ҵ� ����� ���Ǹ� �޼ҵ尡 ������(�������̵�) �� ������ �����Ϸ����� �˷��־� �����Ϸ��� �˻縦 �ϵ��� �Ѵ�(��� ���� �´��� ��)
	// ���� �������̵尡 ���� �ʾҴٸ� �����Ϸ��� ������ �߻���Ų��!(�̸��� Ʋ���ų� ��ȯŸ�� �ٸ��ų� ��)
	
	
	public void disp() {
		
		System.out.println("SUV �ӵ� : " + super.speed);  // �θ�Ŭ������ �ʵ�� �ڽ�Ŭ�������� ���� �ʵ��̸��� ���� ��� �θ�Ŭ���� ����� ����ϱ� ���ؼ��� super Ű���� ����ؾ�!!(�׳� ����ϸ� this�� �����Ǿ� �ڽ�Ŭ������ ��� ���ȴ�)
		super.run();
		
		System.out.println("��Ÿ�� �ӵ� : " + this.speed);  // �׳� speed���ص� �ȴ�
		this.run();  //�׳� run()�̶��ص� �ȴ�
	}
	
} 



public class Ex03_inheritance {

	public static void main(String[] args) {
		
		Santafe santafe = new Santafe();
		
		santafe.run();  // ��Ÿ�� ������ �޸��ϴ�.
		System.out.println();
		santafe.disp();
		
		
	}

}
