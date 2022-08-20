package clazz.field_2;



class Car3{
	
	// private : �ܺ����� ��� �ȵ�(������ ��ȣ�� ���� ���)
	private String color;
	private int speed = 999;
	
	
	// ������Ŭ�� -> source -> Generate Getters and Setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0 || speed > 200) {
			return;  // void �޼��忡�� return ������ �޼��� ��������!!
		}else {
			this.speed = speed;
		}
	}
	
	
	
}



public class Ex04_setter_getter {

	public static void main(String[] args) {
		
		Car3 myCar = new Car3();
		
		// private ���������ڷ� ���� �ʵ� ���� ���� �Ұ�!!
		// myCar.color = "�Ķ�";  
		// myCar.speed = 10;
		
		
		myCar.setSpeed(-10);
		System.out.println("�� �ڵ��� �ӵ� : " + myCar.getSpeed());  //�� �ڵ��� �ӵ� : 999(�޼��� ��������Ǽ� �ʱ�ȭ �� �Ǿ���)
		
		myCar.setSpeed(20);
		System.out.println("�� �ڵ��� �ӵ� : " + myCar.getSpeed());  // �� �ڵ��� �ӵ� : 20
		
		
		myCar.setColor("�Ķ�");
		System.out.println("�� �ڵ��� ���� : " + myCar.getColor());  // �� �ڵ��� ���� : �Ķ�
	}

}
