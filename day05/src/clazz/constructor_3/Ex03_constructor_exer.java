package clazz.constructor_3;

import java.util.Scanner;

// Car 클래스 생성
// 필드는 private String color; private int speed;
// 생성자에서 매개변수로 매개값을 받아 필드 초기화
// 속도 30 미만이거나 200을 초과할 경우 속도를 50으로 셋팅
// 필드를 출력해주는 carProfile 메소드 만들어서
// <객체 생성시> 호출하도록 한다!!


class Car{
	
	//필드
	private String color;
	private int speed;
	
	
	
	public String getColor() {
		return color;
	}

	

	public int getSpeed() {
		return speed;
	}

	
	

	//생성자
	public Car(String color, int speed) {
		if(speed < 30 || speed > 200) {   // 생성자 안에서도 이렇게 제어문 사용해서 초기화하는거 익숙해져야!!★
			System.out.println("속도 범위 벗어남 / 50으로 초기화");
			this.speed = 50;
		}else {
			this.speed = speed;
		}
		
		this.color = color;
		
		carProfile();
	}
	
	public void carProfile() {
		System.out.println("색상 : " + color);  // private 이라도 같은 클래스 내에서는 쓸 수 있다ㅠ
		System.out.println("속도 : " + speed);
	}
	
}






public class Ex03_constructor_exer {

	public static void main(String[] args) {
		
		Car myCar = new Car("빨강", 100);  // 색상 : 빨강 / 속도 : 100
		
		Car myCar2 = new Car("빨강", 300);  // 색상 : 빨강 / 속도 : 50
		
		
		
		//Scanner로 색상과 속도 입력 받아 Car 클래스 객체 생성
		Scanner sc = new Scanner(System.in);
			
		System.out.print("색상 입력 : ");
		String myColor = sc.next();
		
		System.out.print("속도 입력 : ");
		int mySpeed = sc.nextInt();
		
		new Car(myColor, mySpeed);  // myCar3 다시 사용할거 아니면 Car myCar3 이거 안붙여도 된다!
		
	}

}
