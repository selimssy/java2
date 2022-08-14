package array;

public class Ex04_array {

	public static void main(String[] args) {
		
		int[] intArray = {10, 20, 30, 40, 50, 60};
		
		// 반복문을 사용해서 배열의 각 요소를 출력하기
		// 조건 : index가 3인 곳은 출력하지 않기
		
		for(int i = 0; i < intArray.length; i++) {
			if(i == 3) {
				continue;   // continue는 이렇게 출력할 것보다 위에 와야하는 것 주의!(안그럼 출력되고 continue되서 아무 의미가 없으니까)
			}
				
			System.out.println(intArray[i]);  // else 없어도 될듯
			
		}
		
	}

}
