package clazz.field_2;



class Car{
	
	// �ʵ�
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int speed;  //default = 0
	
	
}





public class EX02_class {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		System.out.println("company : " + car.company);   // company : �����ڵ���
		System.out.println("model : " + car.model);   // model : �׷���
		System.out.println("color : " + car.color);   // color : ����
		System.out.println("speed : " + car.speed);   // speed : 0   // default ������ ���
		

	}

}
