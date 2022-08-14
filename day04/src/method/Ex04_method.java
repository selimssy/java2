package method;

public class Ex04_method {
	
	
	public static int sum(int[] array) {  // 매개값으로 배열도 받을 수 있다!!
		
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum;   // 오왕..
		
	}
	
	
	
	
	public static void change1(int a) {
		a = 100; 
	}
	
	
	public static void change2(int[] array) {
		array[0] = 100;
	}
	
	
	
	

	
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		
		int result = sum(array);
		System.out.println("배열의 요소를 더한 결과 : " + result);  //배열의 요소를 더한 결과 : 15
	
	
		
		
		int b = 1;
		change1(b);
		System.out.println(b);  // 1 (원본 a값은 안바뀐다!!) 
		// 값 1을 복사해서 넘겼기 때문에 원본의 값은 바뀌지 않는다!!(기본타입 변수)
		
		
		
		change2(array);
		System.out.println(array[0]);  // 100 (이건 바뀐다!!!)
		// 매개변수로 배열의 주소를 보냈기 때문에 배열의 값을 바꾸면 원본배열의 값이 바뀐다!!(참조변수)
	
	}

}
