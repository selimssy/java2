package wrapper;

public class Ex03_WrapperClass {

	public static void main(String[] args) {
		
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(100);
		
		
		// 포장객체 비교
		System.out.println(obj1 == obj2);  // false
		
		
		// 포장객체 내부의 데이터 비교 : equals()
		System.out.println(obj1.equals(obj2));  // true
		
	}

}
