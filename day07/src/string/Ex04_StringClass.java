package string;

public class Ex04_StringClass {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		// charAt : �ش� ��ġ�� �����ϳ��� char Ÿ������ ��ȯ
		char ch1 = str.charAt(0);
		System.out.println(ch1);  // H
		
		char ch2 = str.charAt(6);
		System.out.println(ch2);  // W

	
		
		
		// length : ���ڿ��� ���̸� ��ȯ(���鵵 ����!)
		int length = str.length();
		System.out.println(length);  // 11
		
		
		
		String str2 = "";
		
		// isEmpty : �ش� ������ ��������� true, �ƴϸ� false ��ȯ
		if(str2.isEmpty()) {
			System.out.println("�������");   // �������
		}else {
			System.out.println("������� ����");  
		}
		
		
		
		
		
		
		// toCharArray : ���ڿ��� �ѱ��ھ� char �迭�� ��ȯ
		char[] array = str.toCharArray();
		for(char c : array) {
			System.out.print(c + " ");  // H e l l o   W o r l d 
		}
		
		
		System.out.println();
		
		
		
		// replace("�������ڿ�", "��ü�� ���ڿ�") : ���ڿ� ��ü  
		System.out.println(str.replace("Hello", "Hi"));   // Hi World
		
		
	}

}
