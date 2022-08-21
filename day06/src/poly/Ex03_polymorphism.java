package poly;


// �ʵ��� ������


class Car{
	// �ʵ�
	Tire tire = new Tire();
}



class Tire{
	
	public String tireName;
	
	public Tire() {
		tireName = "�⺻ Ÿ�̾�";
	}
	
	public String getTireName() {
		return tireName;
	}
}



class HankookTire extends Tire{
	
	public HankookTire() {
		tireName = "�ѱ�Ÿ�̾�";
	}
}



class KumhoTire extends Tire{
	public KumhoTire() {
		tireName = "��ȣŸ�̾�";
	}
}




public class Ex03_polymorphism {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		System.out.println(myCar.tire.getTireName());  // �⺻ Ÿ�̾�
		
		
		myCar.tire = new HankookTire();    // �ʵ��� ������
		System.out.println(myCar.tire.getTireName());  // �ѱ�Ÿ�̾�
		
		
		myCar.tire = new KumhoTire();
		System.out.println(myCar.tire.getTireName());  // ��ȣŸ�̾�
		
	}

}
