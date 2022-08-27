package api;

import java.util.Arrays;

public class Ex04_ArraysClass {

	public static void main(String[] args) {
		
		// Arrays 클래스는 배열을 쓰는데 있어서 편리한 기능을 제공하는 클래스
		// Math와 마찬가지로 static 메소드들로 구성되어 있다
		
		
		int[] array = {1, 2, 3, 4, 5};
		
		//toString(배열) : 전달받은 배열의 모든 요소를 문자열로 반환
		String strArray = Arrays.toString(array);
		System.out.println(strArray);  // [1, 2, 3, 4, 5]
		
		
		
		
		// 배열복사 : copyOf(복사할배열, 길이)
		// 길이만큼 새로운 배열이 만들어지고 복사할 배열의 index 0부터 복사된다
		int[] array2 = Arrays.copyOf(array, array.length);
		System.out.println(Arrays.toString(array2));  // [1, 2, 3, 4, 5]
		
		int[] array3 = Arrays.copyOf(array, 3);
		System.out.println(Arrays.toString(array3));  // [1, 2, 3]
		
		int[] array4 = Arrays.copyOf(array, 10);
		System.out.println(Arrays.toString(array4));  // [1, 2, 3, 4, 5, 0, 0, 0, 0, 0]
		
		
		
		// 배열의 범위 지정해서 복사 : Arrays.copyOfRange
		int[] array5 = Arrays.copyOfRange(array, 2, 4);  // index 2,3이 출력(2부터 4 직전까지!!)
		System.out.println(Arrays.toString(array5));  // [3, 4]
		
		
		
		int[] intArray = {4, 2, 6, 3, 7, 1, 5};
		System.out.println(Arrays.toString(intArray));   // [4, 2, 6, 3, 7, 1, 5]
		
		
		//Arrays.sort(배열) : 전달받은 배열의 모든 요소를 오름차순으로 정렬
		Arrays.sort(intArray);  // 정렬 진행
		System.out.println(Arrays.toString(intArray));   // [1, 2, 3, 4, 5, 6, 7]
		
	}

}
