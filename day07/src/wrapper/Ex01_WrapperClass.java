package wrapper;

public class Ex01_WrapperClass {

	public static void main(String[] args) {
		
		
		// Wrapper 클래스 사용 이유
		
		// 매개변수로 객체가 요구되는 경우
		// 기본형이 아닌 객체로 저장해야 하는 경우
		// 문자열을 기본 타입의 값으로 바꾸는 경우
		// 객체간의 비교가 필요한 경우 등에 wrapper 클래스가 쓰인다.
		// 자바 Collection 인터페이스는 ★객체만 취급★하기 때문에 기본타입을 객체로 사용해야 하는 경우가 있다!!
		
		
		int a = 5;
		
		Integer b = new Integer(a);  //t: 신경쓰지마라.....   // 기본타입의 값을 내부에 두고 포장객체로 만든다.(박싱)
		
		
		int c = b.intValue();  // 박싱된 포장객체에서 기본타입의 값을 얻는다(언박싱)
		
		System.out.println(c);  // 5
	}

}
