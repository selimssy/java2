package stm.java.exam07;

/**
 * 클래스 위에는 주로 이 주석
 * */




/**
 * Wrapper Class : 자료형에 1:1 대응되는 클래스
 * byte -> Byte
 * short -> Short
 * ※int -> Integer  
 * long -> Long
 * float -> Float
 * double -> Double
 * boolean -> Boolean
 * ※char -> Character
 * 
 * */


public class WrapperEx {
	
	public static void main(String[] args) {
		byte a_min = Byte.MIN_VALUE;
		byte a_max = Byte.MAX_VALUE;
		char b_min = Character.MIN_VALUE;
		char b_max = Character.MAX_VALUE;
		int c_min = Integer.MIN_VALUE;
		int c_max = Integer.MAX_VALUE;
		float d_min = Float.MIN_VALUE;
		float d_max = Float.MAX_VALUE;
		
		System.out.println("byte = " + a_min + " ~ " + a_max);
		System.out.println("char = " + (int)b_min + " ~ " + (int)b_max);
		System.out.println("int = " + c_min + " ~ " + c_max);
		System.out.println("float = " + d_min + " ~ " + d_max);
		
		
		int age = Integer.parseInt("20");   // 그 문자 그대로 숫자로
		String msg = String.valueOf(10);   // 그 숫자 그대로 문자로
		
	}
	
}
