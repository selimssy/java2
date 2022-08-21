package inheritance;


class Car{
	
	int speed;
	
	public void upSpeed(int speed) {
		this.speed += speed;
		System.out.println("현재속도(Car 클래스) : " + this.speed);
	}
	
	
}





// Car 클래스를 상속받는 Genesis 클래스를 만들어
// upSpeed 메소드를 재정의하기(속도는 제한속도 150까지)

class Genesis extends Car{

	@Override
	public void upSpeed(int speed) {
		if(this.speed + speed > 150) {
			System.out.println("과속 대상으로 속도를 올릴 수 없습니다.");
			return;
		}else {
			this.speed += speed;
			System.out.println("현재속도(Genesis 클래스) : " + this.speed);
		}
		
		
		
		// t는 이렇게했다 
		/*super.speed += speed;     // 자식클래스에 동일 필드가 생성되어있지 않으므로 super 키워드를 통해 접근하는 것이 정석이다!
		if(super.speed > 150) {
			super.speed = 150;
		}
		System.out.println("현재속도(Genesis 클래스)" + super.speed);*/
		
		
	}
	
	
	
}




public class Ex04_inheritanceExer {

	public static void main(String[] args) {
		
		Car car = new Car();
		Genesis genesis = new Genesis();
		
		car.upSpeed(100);  // 현재속도(Car 클래스) : 100
		car.upSpeed(200);  // 현재속도(Car 클래스) : 300
		
		genesis.upSpeed(100);  // 현재속도(Genesis 클래스) : 100
		genesis.upSpeed(200);  // 과속 대상으로 속도를 올릴 수 없습니다.(t방식으로는 이 코드 실행하면 속도가 150이 된다!!)

		
	}

}
