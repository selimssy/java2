package poly;



// �Ű������� ������

class Vehicle{
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
}



class Bus extends Vehicle{
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	
	public void checkFare() {
		System.out.println("��������� üũ�մϴ�.");
	}
}



class Taxi extends Vehicle{
	@Override
	public void run() {
		System.out.println("�ýð� �޸��ϴ�.");
	}
}


class Driver{
	
	public void drive(Vehicle vehicle) {  
		
		// �Ű������� Bus�� ���� checkFare() ȣ�� �� run()ȣ��, Taxi�� ���� run()��!
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		
		vehicle.run();
	}
}




public class Ex04_polymorphism {

	public static void main(String[] args) {

		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);  // ������ �޸��ϴ�.   // �Ű������� ������!!
		driver.drive(taxi);  // �ýð� �޸��ϴ�.
		
		driver.drive(new Bus());  // ������ �޸��ϴ�.
		driver.drive(new Taxi());   // �ýð� �޸��ϴ�.
		
		
		
		
	}

}
