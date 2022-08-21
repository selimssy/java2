package inheritance;


class Car{
	
	int speed;
	
	public void upSpeed(int speed) {
		this.speed += speed;
		System.out.println("����ӵ�(Car Ŭ����) : " + this.speed);
	}
	
	
}





// Car Ŭ������ ��ӹ޴� Genesis Ŭ������ �����
// upSpeed �޼ҵ带 �������ϱ�(�ӵ��� ���Ѽӵ� 150����)

class Genesis extends Car{

	@Override
	public void upSpeed(int speed) {
		if(this.speed + speed > 150) {
			System.out.println("���� ������� �ӵ��� �ø� �� �����ϴ�.");
			return;
		}else {
			this.speed += speed;
			System.out.println("����ӵ�(Genesis Ŭ����) : " + this.speed);
		}
		
		
		
		// t�� �̷����ߴ� 
		/*super.speed += speed;     // �ڽ�Ŭ������ ���� �ʵ尡 �����Ǿ����� �����Ƿ� super Ű���带 ���� �����ϴ� ���� �����̴�!
		if(super.speed > 150) {
			super.speed = 150;
		}
		System.out.println("����ӵ�(Genesis Ŭ����)" + super.speed);*/
		
		
	}
	
	
	
}




public class Ex04_inheritanceExer {

	public static void main(String[] args) {
		
		Car car = new Car();
		Genesis genesis = new Genesis();
		
		car.upSpeed(100);  // ����ӵ�(Car Ŭ����) : 100
		car.upSpeed(200);  // ����ӵ�(Car Ŭ����) : 300
		
		genesis.upSpeed(100);  // ����ӵ�(Genesis Ŭ����) : 100
		genesis.upSpeed(200);  // ���� ������� �ӵ��� �ø� �� �����ϴ�.(t������δ� �� �ڵ� �����ϸ� �ӵ��� 150�� �ȴ�!!)

		
	}

}
