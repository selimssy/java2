package string;

public class Ex02_StringClass {

	public static void main(String[] args) {
		
		// 자바에서 문자열을 기본타입의 값으로 변환하는 방법

		String str = "100";
		
		System.out.println(Byte.parseByte(str));
		System.out.println(Short.parseShort(str));
		System.out.println(Integer.parseInt(str));
		System.out.println(Long.parseLong(str));
		System.out.println();
		
		str = "3.141592";
		System.out.println(Float.parseFloat(str));
		System.out.println(Double.parseDouble(str));
		System.out.println();
		
		str = "true";
		System.out.println(Boolean.parseBoolean(str));
		
	}

}
