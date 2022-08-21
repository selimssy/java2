package poly;



// 매개변수의 다형성

class Vehicle{
	public void run() {
		System.out.println("차량이 달립니다.");
	}
}



class Bus extends Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}



class Taxi extends Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}


class Driver{
	
	public void drive(Vehicle vehicle) {  
		
		// 매개변수로 Bus가 오면 checkFare() 호출 후 run()호출, Taxi가 오면 run()만!
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
		
		driver.drive(bus);  // 버스가 달립니다.   // 매개변수의 다형성!!
		driver.drive(taxi);  // 택시가 달립니다.
		
		driver.drive(new Bus());  // 버스가 달립니다.
		driver.drive(new Taxi());   // 택시가 달립니다.
		
		
		
		
	}

}
