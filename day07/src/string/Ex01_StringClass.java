package string;

import java.util.Scanner;

public class Ex01_StringClass {

	public static void main(String[] args) {

		
		
		// String은 클래스이다.
		// 문자열은 프로그램에서 굉장히 많이 쓰이기 때문에 자바에서는 String 클래스를 기본형과 같은 형식으로 쓸 수 있도록 해두었다.
		
		String str1 = "Hello";
		String str2 = "Hi";
		String str3 = "Hello";
		
		if(str1 == str2) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");     // 다른 객체
		}
		
		
		
		if(str1 == str3) {
			System.out.println("같은 객체");    // 같은 객체
		}else {
			System.out.println("다른 객체");
		}

		
		
		
		String str4 = new String("java");
		String str5 = new String("java");
		
		System.out.println(str4 == str5);   // false
		System.out.println(str4.equals(str5));  // true
		
		// String 클래스에서의 equals()  : 원본문자열 변수와 비교문자열 변수의 문자열만을 비교한 후 같은문자열이면 true, 다르면 false 반환
		
		
		
		System.out.println("아버지를 아버지라고 부르지 못하는 인물은?");
		
		// Scanner를 사용해서 정답을 입력받은 후
		// 답이 "홍길동"이면 "정답입니다." 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정답 : ");
			String anw = sc.next();
			
			if(anw.equals("홍길동")) {
				System.out.println("정답입니다.");
				break;
			}else {
				System.out.println("틀렸습니다. 다시 입력하세요.");
			}
		}
		
		
		sc.close();
		
	}

}
