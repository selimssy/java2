package string;

public class Ex05_StringClass {

	public static void main(String[] args) {
		
		// toLowerCase : 문자열의 대문자를 소문자로 변환
		String str1 = "abcDEF";
		System.out.println("toLowerCase : " + str1.toLowerCase());  // toLowerCase : abcdef
		
		
		// toUpperCase : 문자열에 소문자를 대문자로 변환
		String str2 = "abcDEF";
		System.out.println("toUpperCase : " + str2.toUpperCase());  // toUpperCase : ABCDEF
		
		
		// trim : 문자열의 앞 뒤 공백을 없애준다(중간 공백은 그대로)
		String str4 = "  hi   hi     hi        hi    ";
		System.out.println(str4.trim());  // hi   hi     hi        hi
		
	}

}
