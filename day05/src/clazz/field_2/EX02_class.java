package clazz.field_2;



class Car{
	
	// 필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int speed;  //default = 0
	
	
}





public class EX02_class {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		System.out.println("company : " + car.company);   // company : 현대자동차
		System.out.println("model : " + car.model);   // model : 그랜저
		System.out.println("color : " + car.color);   // color : 검정
		System.out.println("speed : " + car.speed);   // speed : 0   // default 값으로 출력
		

	}

}
