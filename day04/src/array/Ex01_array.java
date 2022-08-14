package array;

public class Ex01_array {

	public static void main(String[] args) {
		
		// 배열 선언 및 생성
		
		
		// 실제값을 알고있을 때: 선언과 동시에 배열을 생성  // new 연산자 생략 가능
		int[] intArray1 = {10, 20, 30}; 
		
		System.out.println(intArray1);  // [I@6ee52dcd //배열의 주소
		System.out.println(intArray1[0]);  // 10
		System.out.println(intArray1[1]);  // 20
		System.out.println(intArray1[2]);  // 30
		
		
		
		
		int[] intArray2 = null;  // null로 초기화
		//intArray2 = {100, 200, 300};   // 초기화 한 후에는 new 없이 중괄호만으로 배열 생성 불가!
		intArray2 = new int[] {100, 200, 300};  // 이렇게 new로 생성해야!
		
		System.out.println(intArray2[0]);  // 100
		System.out.println(intArray2[1]);  // 200
		System.out.println(intArray2[2]);  // 300
		
		
		
		
		int[] intArray3 = new int[3];  // 저장할 값이 길이만 지정
		intArray3[0] = 400;  // 이런식으로 대입
		intArray3[1] = 500;
		intArray3[2] = 600;
		
		System.out.println(intArray3[0]);  // 400
		System.out.println(intArray3[1]);  // 500
		System.out.println(intArray3[2]);  // 600
	}

}
