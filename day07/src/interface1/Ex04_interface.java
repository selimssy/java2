package interface1;



// �Ű������� ������

interface Vehicle{
	public abstract void run();
}



class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	
	
	public void checkFare() {
		System.out.println("��������� üũ�մϴ�.");
	}
	
}



class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println("�ýð� �޸��ϴ�.");
	}
	
}



class Driver{
	
	public void drive(Vehicle vehicle) {
		
		// ������ü�� ������� üũ�ϰ� �޸�����
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		
		vehicle.run();
		
	}
	
}


public class Ex04_interface {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Driver driver = new Driver();
		
		driver.drive(bus);  // ��������� üũ�մϴ�. / ������ �޸��ϴ�.
		driver.drive(taxi);  // �ýð� �޸��ϴ�.
		
	}

}
