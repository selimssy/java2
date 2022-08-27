package interface1;




// �ʵ��� ������

class Car{
	
	Tire tire = new HankookTire();
	
	public void run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		tire.roll();
	}
}


interface Tire{
	public abstract void roll();
}



class HankookTire implements Tire{

	@Override
	public void roll() {
		System.out.println("�ѱ�Ÿ�̾ �������ϴ�.");
	}
	
}



class KumhoTire implements Tire{

	@Override
	public void roll() {
		System.out.println("��ȣŸ�̾ �������ϴ�.");
	}
	
}





public class Ex03_interface {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.run();  // �ڵ����� �޸��ϴ�. / �ѱ�Ÿ�̾ �������ϴ�.
		System.out.println();
		
		myCar.tire = new KumhoTire();  // �ʵ��� ������
		myCar.run();  // �ڵ����� �޸��ϴ�. / ��ȣŸ�̾ �������ϴ�.
		
	}

}
