package wrapper;

public class Ex04_WrapperClass {

	public static void main(String[] args) {
		
		// ���ڿ��� �⺻������ �ٲ� ��
		// �� WrapperŬ������ �����޼ҵ� parse + �⺻Ÿ���̸� ���
		// �����ǻ���: str�� parseInt �޼ҵ� ���� int Ÿ������ �ٲ� �� "100a" �̷��� ���� �ȵȴ�!!(����) 
		
		String num_str = "12345";
		
		int value = Integer.parseInt(num_str);
		System.out.println(value);  // 12345
		
	}

}
