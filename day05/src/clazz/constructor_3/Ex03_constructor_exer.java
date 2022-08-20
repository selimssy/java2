package clazz.constructor_3;

import java.util.Scanner;

// Car Ŭ���� ����
// �ʵ�� private String color; private int speed;
// �����ڿ��� �Ű������� �Ű����� �޾� �ʵ� �ʱ�ȭ
// �ӵ� 30 �̸��̰ų� 200�� �ʰ��� ��� �ӵ��� 50���� ����
// �ʵ带 ������ִ� carProfile �޼ҵ� ����
// <��ü ������> ȣ���ϵ��� �Ѵ�!!


class Car{
	
	//�ʵ�
	private String color;
	private int speed;
	
	
	
	public String getColor() {
		return color;
	}

	

	public int getSpeed() {
		return speed;
	}

	
	

	//������
	public Car(String color, int speed) {
		if(speed < 30 || speed > 200) {   // ������ �ȿ����� �̷��� ��� ����ؼ� �ʱ�ȭ�ϴ°� �ͼ�������!!��
			System.out.println("�ӵ� ���� ��� / 50���� �ʱ�ȭ");
			this.speed = 50;
		}else {
			this.speed = speed;
		}
		
		this.color = color;
		
		carProfile();
	}
	
	public void carProfile() {
		System.out.println("���� : " + color);  // private �̶� ���� Ŭ���� �������� �� �� �ִ٤�
		System.out.println("�ӵ� : " + speed);
	}
	
}






public class Ex03_constructor_exer {

	public static void main(String[] args) {
		
		Car myCar = new Car("����", 100);  // ���� : ���� / �ӵ� : 100
		
		Car myCar2 = new Car("����", 300);  // ���� : ���� / �ӵ� : 50
		
		
		
		//Scanner�� ����� �ӵ� �Է� �޾� Car Ŭ���� ��ü ����
		Scanner sc = new Scanner(System.in);
			
		System.out.print("���� �Է� : ");
		String myColor = sc.next();
		
		System.out.print("�ӵ� �Է� : ");
		int mySpeed = sc.nextInt();
		
		new Car(myColor, mySpeed);  // myCar3 �ٽ� ����Ұ� �ƴϸ� Car myCar3 �̰� �Ⱥٿ��� �ȴ�!
		
	}

}
