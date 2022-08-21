package inheritance;


class Sedan{
	
	String color;
	
	public Sedan() {
		System.out.println("Sedan 생성자 입니다.");
	}
}


class Sonata extends Sedan{
	
	public Sonata() {
		super(); // 부모 생성자 호출 : 생략하면 자바컴파일러는 얘를 자동으로 만들어준다!!!!  // 맨 첫줄에만 와야
		System.out.println("Sonata 생성자 입니다.");
	}
	
}




public class Ex02_inheritance {

	public static void main(String[] args) {
		
		Sonata sonata = new Sonata(); //Sedan 생성자 입니다.
									  //Sonata 생성자 입니다.   (부모생성자 먼저 호출 후 자식생성자 호출)
		
		sonata.color = "빨강";
		
		System.out.println("소나타 색상 : " + sonata.color);
	}

}
