package printf;

public class Ex01_printf {

	public static void main(String[] args) {
		
		System.out.printf("�ȳ��ϼ���.\n");
		// ()�ȿ� ù ��° ���ڿ� ���Ĵ�� ���� ���
		
		
		// ���Ĺ��� - printf() �ȿ����� ��� ����
		// %d : ����
		// $f : �Ǽ�
		// %c : ����
		// %s : ���ڿ�
	
		String name = "ȫ�浿";
		System.out.printf("�̸� : %s\n", name);
		//System.out.printf("�̸� : %s\n", "ȫ�浿");
		
		System.out.printf("���� : %d\n", 20);
		
		System.out.printf("Ű : %.2f\n", 180.535);  // Ű : 180.54
		
		System.out.printf("���� : %c\n", 'A');
		
		
		System.out.printf("�� �̸��� %s�̰� ���̴� %d���̸� Ű�� %.2fcm�̰� ������ %c�Դϴ�.\n", name, 20, 180.535, 'A');
		
		
		System.out.printf("%10d\n", 123);
		System.out.printf("%-5d\n", 123);
		// ���������� �ȿ� %����d�� �ۼ��ϸ� ��½� �ش���ġ�� ���ڰ� ��ŭ�� ����Ȯ���� �ϰ� ���� ���
	}

}
