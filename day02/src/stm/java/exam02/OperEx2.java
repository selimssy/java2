package stm.java.exam02;

public class OperEx2 {
	public static void main(String[] args) {
		short a, b;
		a = b = 10; 
		short c = (short)(a + b);   // 자바에서 정수간의 사칙연산의 결과는 int라서 강제형변환 해줘야
		// (short)(a + b); 이런거 차이 잘 모르겟다
		System.out.println("c = " + c);  // c = 20
	}
}
