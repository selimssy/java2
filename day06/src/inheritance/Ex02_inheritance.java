package inheritance;


class Sedan{
	
	String color;
	
	public Sedan() {
		System.out.println("Sedan ������ �Դϴ�.");
	}
}


class Sonata extends Sedan{
	
	public Sonata() {
		super(); // �θ� ������ ȣ�� : �����ϸ� �ڹ������Ϸ��� �긦 �ڵ����� ������ش�!!!!  // �� ù�ٿ��� �;�
		System.out.println("Sonata ������ �Դϴ�.");
	}
	
}




public class Ex02_inheritance {

	public static void main(String[] args) {
		
		Sonata sonata = new Sonata(); //Sedan ������ �Դϴ�.
									  //Sonata ������ �Դϴ�.   (�θ������ ���� ȣ�� �� �ڽĻ����� ȣ��)
		
		sonata.color = "����";
		
		System.out.println("�ҳ�Ÿ ���� : " + sonata.color);
	}

}
