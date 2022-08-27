package wrapper;

public class Ex04_WrapperClass {

	public static void main(String[] args) {
		
		// 문자열을 기본값으로 바꿀 때
		// 각 Wrapper클래스의 정적메소드 parse + 기본타입이름 사용
		// ※유의사항: str을 parseInt 메소드 통해 int 타입으로 바꿀 때 "100a" 이런게 들어가면 안된다!!(에러) 
		
		String num_str = "12345";
		
		int value = Integer.parseInt(num_str);
		System.out.println(value);  // 12345
		
	}

}
