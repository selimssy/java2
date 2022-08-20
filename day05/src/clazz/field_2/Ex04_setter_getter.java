package clazz.field_2;



class Car3{
	
	// private : 외부접근 허용 안됨(데이터 보호를 위해 사용)
	private String color;
	private int speed = 999;
	
	
	// 오른쪽클릭 -> source -> Generate Getters and Setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0 || speed > 200) {
			return;  // void 메서드에서 return 만나면 메서드 강제종료!!
		}else {
			this.speed = speed;
		}
	}
	
	
	
}



public class Ex04_setter_getter {

	public static void main(String[] args) {
		
		Car3 myCar = new Car3();
		
		// private 접근제한자로 인해 필드 직접 접근 불가!!
		// myCar.color = "파랑";  
		// myCar.speed = 10;
		
		
		myCar.setSpeed(-10);
		System.out.println("내 자동차 속도 : " + myCar.getSpeed());  //내 자동차 속도 : 999(메서드 강제종료되서 초기화 안 되었다)
		
		myCar.setSpeed(20);
		System.out.println("내 자동차 속도 : " + myCar.getSpeed());  // 내 자동차 속도 : 20
		
		
		myCar.setColor("파랑");
		System.out.println("내 자동차 색상 : " + myCar.getColor());  // 내 자동차 색상 : 파랑
	}

}
