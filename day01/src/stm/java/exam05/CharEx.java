package stm.java.exam05;

public class CharEx {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		char ch2 = '\u0041';  // 
		System.out.println("ch1 + ch2 = " + ch1 + ch2);    // ch1 + ch2 = AA
		System.out.println("ch1 + ch2 = " + (ch1 + ch2));    // ch1 + ch2 = 130
		// char 연산이 가능하면 진짜 계산
		// 자바에서 정수간의 사칙연산의 결과는 정수(int)나온다. byte끼리 더해도 int long끼리도 int, char끼리도 int
		System.out.println("ch1 + ch2 = " + (char)(ch1 + ch2 - 8));  //ch1 + ch2 = z   //형변환
		System.out.println("ch1 + ch2 = " + (char)(ch1 + ch2));  // ?  아스키코드는 0 ~ 127
		
	}

}
