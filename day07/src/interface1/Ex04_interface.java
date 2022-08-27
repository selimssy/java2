package interface1;



// 매개변수의 다형성

interface Vehicle{
	public abstract void run();
}



class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
	
}



class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
}



class Driver{
	
	public void drive(Vehicle vehicle) {
		
		// 버스객체는 승차요금 체크하고 달리도록
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
		
		driver.drive(bus);  // 승차요금을 체크합니다. / 버스가 달립니다.
		driver.drive(taxi);  // 택시가 달립니다.
		
	}

}
