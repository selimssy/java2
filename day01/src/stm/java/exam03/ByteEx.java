package stm.java.exam03;

public class ByteEx {

	public static void main(String[] args) {
		
		// 자바에서 초기화할 때 그 표현범위를 초과할 수 없다
		//byte bb = 128; //에러
		byte bb = 127;   // byte : -128 ~ 127
		bb++;
		System.out.println("bb: " + bb);   //  -128
		

	}

}
