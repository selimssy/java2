package stm.java.exam05;

public class CharEx {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		char ch2 = '\u0041';  // 
		System.out.println("ch1 + ch2 = " + ch1 + ch2);    // ch1 + ch2 = AA
		System.out.println("ch1 + ch2 = " + (ch1 + ch2));    // ch1 + ch2 = 130
		// char ������ �����ϸ� ��¥ ���
		// �ڹٿ��� �������� ��Ģ������ ����� ����(int)���´�. byte���� ���ص� int long������ int, char������ int
		System.out.println("ch1 + ch2 = " + (char)(ch1 + ch2 - 8));  //ch1 + ch2 = z   //����ȯ
		System.out.println("ch1 + ch2 = " + (char)(ch1 + ch2));  // ?  �ƽ�Ű�ڵ�� 0 ~ 127
		
	}

}
