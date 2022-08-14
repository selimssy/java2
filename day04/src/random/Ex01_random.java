package random;

public class Ex01_random {

	public static void main(String[] args) {
		
		double randomDouble = Math.random();  // 0.0부터 1미만의 수 하나를 반환
		System.out.println(randomDouble);
		
		int myDice = (int)(Math.random() * 6 + 1);  // 1부터 6까지의 정수 하나 반환
		System.out.println(myDice);
		
		
		
	}

}
