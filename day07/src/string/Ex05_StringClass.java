package string;

public class Ex05_StringClass {

	public static void main(String[] args) {
		
		// toLowerCase : ���ڿ��� �빮�ڸ� �ҹ��ڷ� ��ȯ
		String str1 = "abcDEF";
		System.out.println("toLowerCase : " + str1.toLowerCase());  // toLowerCase : abcdef
		
		
		// toUpperCase : ���ڿ��� �ҹ��ڸ� �빮�ڷ� ��ȯ
		String str2 = "abcDEF";
		System.out.println("toUpperCase : " + str2.toUpperCase());  // toUpperCase : ABCDEF
		
		
		// trim : ���ڿ��� �� �� ������ �����ش�(�߰� ������ �״��)
		String str4 = "  hi   hi     hi        hi    ";
		System.out.println(str4.trim());  // hi   hi     hi        hi
		
	}

}
