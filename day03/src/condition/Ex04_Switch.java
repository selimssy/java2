package condition;

public class Ex04_Switch {

	public static void main(String[] args) {
		
		// switch문에 정수, char, string 가능 (실수는 불가)
		
		int x = 8;
		
		switch(x) {
		
			case 1: 
				System.out.println("숫자 1입니다.");
				break;
				
			case 2:
				System.out.println("숫자 2입니다.");
				break;
				
			case 3:
				System.out.println("숫자 3입니다.");
				break;
				
			case 4:
				System.out.println("숫자 4입니다.");
				break;
				
				default: 
					System.out.println("숫자 1 ~ 4가 아닙니다.");
			
		}
		
	}

}
