package string;

public class Ex04_StringClass {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		// charAt : 해당 위치의 문자하나를 char 타입으로 반환
		char ch1 = str.charAt(0);
		System.out.println(ch1);  // H
		
		char ch2 = str.charAt(6);
		System.out.println(ch2);  // W

	
		
		
		// length : 문자열의 길이를 반환(공백도 포함!)
		int length = str.length();
		System.out.println(length);  // 11
		
		
		
		String str2 = "";
		
		// isEmpty : 해당 변수가 비어있으면 true, 아니면 false 반환
		if(str2.isEmpty()) {
			System.out.println("비어있음");   // 비어있음
		}else {
			System.out.println("비어있지 않음");  
		}
		
		
		
		
		
		
		// toCharArray : 문자열을 한글자씩 char 배열로 반환
		char[] array = str.toCharArray();
		for(char c : array) {
			System.out.print(c + " ");  // H e l l o   W o r l d 
		}
		
		
		System.out.println();
		
		
		
		// replace("기존문자열", "교체할 문자열") : 문자열 교체  
		System.out.println(str.replace("Hello", "Hi"));   // Hi World
		
		
	}

}
