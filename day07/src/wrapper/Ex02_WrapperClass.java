package wrapper;

public class Ex02_WrapperClass {

	public static void main(String[] args) {
		
		printDouble(new Double(3.14));  // 3.14
		
		printDouble(3.141592); // 자동박싱되서 Double 포장객체로 들어간다!!   // 3.141592
		
	}

	
	public static void printDouble(Double obj) {
		System.out.println("자동박싱 : " + obj.doubleValue());   // 자동박싱 : 3.141592
		
		double value = obj;   // 자동언박싱
		System.out.println("자동 언박싱 : " + value);  // 자동 언박싱 : 3.141592
	}
	
}
