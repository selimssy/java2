package stm.java.exam06;

public class FloatEx {

	public static void main(String[] args) {
		
		float var1, var2;
		var1 = 3.4f;
		// 자바에서 정수의 기본은 int, 실수의 기본은 double 
		// 그래서 그냥 55.55 라고 해버리면 double로 인식해서 에러. float로 하려면 뒤에 f써줘야!(double은 그냥 쓰면 된다)
		//var2 = 55.55; 에러
		var2 = 55.55f;
		
		System.out.println("var1: " + var1);  // var1: 3.4
		System.out.println("var2: " + var2);  // var2: 55.55
		
		
		// 참고로 long은 뒤에 L을 쓰는데 주로 대문자로 쓴다
	} 

}
