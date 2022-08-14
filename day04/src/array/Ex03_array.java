package array;

public class Ex03_array {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		
		// index를 사용해서 배열의 각 요소에 100 200 300 400 500 넣기
		// 배열의 각 요소 출력하기
		
		intArray[0] = 100;
		intArray[1] = 200;
		intArray[2] = 300;
		intArray[3] = 400;
		intArray[4] = 500;
		
		System.out.println(intArray[0]); // 100
		System.out.println(intArray[1]);  // 200
		System.out.println(intArray[2]);  // 300
		System.out.println(intArray[3]);  // 400
		System.out.println(intArray[4]);  // 500
		
		
		System.out.println();
		
		
		
		// for문으로 출력
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);  // i: 제어변수
		}
		
		
		
		// 배열의 길이: 배열변수.length
		System.out.println("배열의 길이: " + intArray.length);   // 배열의 길이: 5
		
		
	}

}
