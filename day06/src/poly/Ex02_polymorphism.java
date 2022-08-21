package poly;

// ������ : �θ�Ŭ���� Ÿ������ �ڽİ�ü�� ��� ��
// 1. �θ�Ŭ������ ������ �ִ� ��� ����鿡�� ���� ����(�ڽ�Ŭ�������� �ִ°� ���� �Ұ�, ������ ���� ���� �ڽĸ޼ҵ尡 ȣ��)


class Run{
	
	int speed = 100;
	
	public void run() {
		System.out.println(speed + "�� �ӵ��� �޸���.");
	}
	
}



class Person extends Run{
	
	String name = "ȫ�浿";
	
	public void walk() {
		System.out.println(name + "�� ��å�� �Ѵ�.");
	}

	
	@Override
	public void run() {
		System.out.println(name + "�� " + speed + "�� �ӵ��� �޸���");    // ���⼭�� �ڽĿ��Ը� �ִ� name�� ���� ����!!��
		walk();     // ���� �ڽĿ��Ը� �ִ� walk() �� ���� ����!!��
	}

}




class KiaCar extends Run{
	
	String model = "k5";
	
	public void parking() {
		System.out.println(model + "�� ������ �Ѵ�.");
	}

	@Override
	public void run() {
		System.out.println(model + "�� " + speed + "�� �ӵ��� �޸���.");
		parking();
	}
	
	
	
}




public class Ex02_polymorphism {

	public static void main(String[] args) {
		
		Run run = new Person();
		System.out.println(run.speed);
		//System.out.println(run.name);   // �Ұ�!
		//System.out.println(walk()); // �Ұ�!
		run.run();   // ȫ�浿�� 100�� �ӵ��� �޸���   /  ȫ�浿�� ��å�� �Ѵ�.

		
		
		System.out.println();
		
		
		run = new KiaCar();     // �θ�Ÿ�� �����ϱ� �ٸ� �ڽİ�ü�� �ٲ� �� �ִ�!
		run.run();  // k5�� 100�� �ӵ��� �޸���.  /  k5�� ������ �Ѵ�.
		
		
	}

}
