package poly;


// 필드의 다형성


class Car{
	// 필드
	Tire tire = new Tire();
}



class Tire{
	
	public String tireName;
	
	public Tire() {
		tireName = "기본 타이어";
	}
	
	public String getTireName() {
		return tireName;
	}
}



class HankookTire extends Tire{
	
	public HankookTire() {
		tireName = "한국타이어";
	}
}



class KumhoTire extends Tire{
	public KumhoTire() {
		tireName = "금호타이어";
	}
}




public class Ex03_polymorphism {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		System.out.println(myCar.tire.getTireName());  // 기본 타이어
		
		
		myCar.tire = new HankookTire();    // 필드의 다형성
		System.out.println(myCar.tire.getTireName());  // 한국타이어
		
		
		myCar.tire = new KumhoTire();
		System.out.println(myCar.tire.getTireName());  // 금호타이어
		
	}

}
