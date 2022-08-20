package clazz.field_2;



class Car2{
	
	String color;
	int speed;
	
	// setter() 메소드 : set뒤에 필드이름(필드이름 첫글자는 대문자)
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
		
		// 필드로 직접 접근(권장하지 않음-private)
		myCar.color = "빨강";
		myCar.speed = 50;
		
		System.out.println("내 자동차 색상 : " + myCar.color);  // 내 자동차 색상 : 빨강
		System.out.println("내 자동차 속도 : " + myCar.speed);  // 내 자동차 속도 : 50
		
		
		
		
		// 필드를 메소드로 접근(이걸 권장)
		myCar.setColor("파랑");
		myCar.setSpeed(70);
		
		System.out.println("내 자동차 색상 : " + myCar.getColor());  // 내 자동차 색상 : 파랑
		System.out.println("내 자동차 속도 : " + myCar.getSpeed());  // 내 자동차 속도 : 70
		
	}

}
