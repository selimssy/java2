package clazz.field_2;



class Car2{
	
	String color;
	int speed;
	
	// setter() �޼ҵ� : set�ڿ� �ʵ��̸�(�ʵ��̸� ù���ڴ� �빮��)
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	public int getSpeed() {
		return speed;
	}
	
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	public String getColor() {
		return color;
	}
	
	
}



public class Ex03_setter_getter {

	public static void main(String[] args) {
		
		
		Car2 myCar = new Car2();
		
		// �ʵ�� ���� ����(�������� ����-private)
		myCar.color = "����";
		myCar.speed = 50;
		
		System.out.println("�� �ڵ��� ���� : " + myCar.color);  // �� �ڵ��� ���� : ����
		System.out.println("�� �ڵ��� �ӵ� : " + myCar.speed);  // �� �ڵ��� �ӵ� : 50
		
		
		
		
		// �ʵ带 �޼ҵ�� ����(�̰� ����)
		myCar.setColor("�Ķ�");
		myCar.setSpeed(70);
		
		System.out.println("�� �ڵ��� ���� : " + myCar.getColor());  // �� �ڵ��� ���� : �Ķ�
		System.out.println("�� �ڵ��� �ӵ� : " + myCar.getSpeed());  // �� �ڵ��� �ӵ� : 70
		
	}

}
