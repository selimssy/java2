package string;

public class Ex03_StringClass {

	public static void main(String[] args) {
		
		// String 생성자를 사용해서 String 객체 생성하기
		
		// 배열 전체를 String 객체로 생성하기
		
		byte[] byteArray = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(byteArray);  
		System.out.println(str1);  // Hello Java
		
		
		
		// 배열의 특정 인덱스 위치부터 특정 갯수만큼만 String 객체로 생성
		String str2 = new String(byteArray, 6, 4);
		System.out.println(str2);  // Java
		
		
		
		
		
		// 문자열을 byte 배열로 반환하기 : getBytes()
		String str3 = "Hello Java";
		byte[] array = str3.getBytes();
		
		for(byte by : array) {   // 향상된 for문
			System.out.print(by + " ");
		}
		
	}

}
