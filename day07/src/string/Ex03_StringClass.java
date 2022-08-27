package string;

public class Ex03_StringClass {

	public static void main(String[] args) {
		
		// String �����ڸ� ����ؼ� String ��ü �����ϱ�
		
		// �迭 ��ü�� String ��ü�� �����ϱ�
		
		byte[] byteArray = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(byteArray);  
		System.out.println(str1);  // Hello Java
		
		
		
		// �迭�� Ư�� �ε��� ��ġ���� Ư�� ������ŭ�� String ��ü�� ����
		String str2 = new String(byteArray, 6, 4);
		System.out.println(str2);  // Java
		
		
		
		
		
		// ���ڿ��� byte �迭�� ��ȯ�ϱ� : getBytes()
		String str3 = "Hello Java";
		byte[] array = str3.getBytes();
		
		for(byte by : array) {   // ���� for��
			System.out.print(by + " ");
		}
		
	}

}
