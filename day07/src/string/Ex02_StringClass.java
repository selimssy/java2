package string;

public class Ex02_StringClass {

	public static void main(String[] args) {
		
		// �ڹٿ��� ���ڿ��� �⺻Ÿ���� ������ ��ȯ�ϴ� ���

		String str = "100";
		
		System.out.println(Byte.parseByte(str));
		System.out.println(Short.parseShort(str));
		System.out.println(Integer.parseInt(str));
		System.out.println(Long.parseLong(str));
		System.out.println();
		
		str = "3.141592";
		System.out.println(Float.parseFloat(str));
		System.out.println(Double.parseDouble(str));
		System.out.println();
		
		str = "true";
		System.out.println(Boolean.parseBoolean(str));
		
	}

}
