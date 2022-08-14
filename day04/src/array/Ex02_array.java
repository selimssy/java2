package array;

public class Ex02_array {

	public static void main(String[] args) {
		
		// 배열 기본초기값
		// new 연산자로 배열의 길이를 지정하여 배열 생성했을 경우
		// 배열은 자동적으로 기본값으로 초기화가 된다.
		
		byte[] byteArray = new byte[1];
		char[] charArray = new char[1];
		short[] shortArray = new short[1];
		int[] intArray = new int[1];
		long[] longArray = new long[1];
		float[] floatArray = new float[1];
		double[] doubleArray = new double[1];
		boolean[] booleanArray = new boolean[1];
		String[] stringArray = new String[1];
		
		System.out.println(byteArray[0]);  // 0
		System.out.println((int)charArray[0]);  // 0
		System.out.println(shortArray[0]);  // 0
		System.out.println(intArray[0]);  // 0
		System.out.println(longArray[0]);  // 0
		System.out.println(floatArray[0]);  // 0.0
		System.out.println(doubleArray[0]); // 0.0
		System.out.println(booleanArray[0]);  // false
		System.out.println(stringArray[0]);  // null
		
		
		
	}

}
