package api;

import java.util.Arrays;

public class Ex04_ArraysClass {

	public static void main(String[] args) {
		
		// Arrays Ŭ������ �迭�� ���µ� �־ ���� ����� �����ϴ� Ŭ����
		// Math�� ���������� static �޼ҵ��� �����Ǿ� �ִ�
		
		
		int[] array = {1, 2, 3, 4, 5};
		
		//toString(�迭) : ���޹��� �迭�� ��� ��Ҹ� ���ڿ��� ��ȯ
		String strArray = Arrays.toString(array);
		System.out.println(strArray);  // [1, 2, 3, 4, 5]
		
		
		
		
		// �迭���� : copyOf(�����ҹ迭, ����)
		// ���̸�ŭ ���ο� �迭�� ��������� ������ �迭�� index 0���� ����ȴ�
		int[] array2 = Arrays.copyOf(array, array.length);
		System.out.println(Arrays.toString(array2));  // [1, 2, 3, 4, 5]
		
		int[] array3 = Arrays.copyOf(array, 3);
		System.out.println(Arrays.toString(array3));  // [1, 2, 3]
		
		int[] array4 = Arrays.copyOf(array, 10);
		System.out.println(Arrays.toString(array4));  // [1, 2, 3, 4, 5, 0, 0, 0, 0, 0]
		
		
		
		// �迭�� ���� �����ؼ� ���� : Arrays.copyOfRange
		int[] array5 = Arrays.copyOfRange(array, 2, 4);  // index 2,3�� ���(2���� 4 ��������!!)
		System.out.println(Arrays.toString(array5));  // [3, 4]
		
		
		
		int[] intArray = {4, 2, 6, 3, 7, 1, 5};
		System.out.println(Arrays.toString(intArray));   // [4, 2, 6, 3, 7, 1, 5]
		
		
		//Arrays.sort(�迭) : ���޹��� �迭�� ��� ��Ҹ� ������������ ����
		Arrays.sort(intArray);  // ���� ����
		System.out.println(Arrays.toString(intArray));   // [1, 2, 3, 4, 5, 6, 7]
		
	}

}
