package method;

public class Ex04_method {
	
	
	public static int sum(int[] array) {  // �Ű������� �迭�� ���� �� �ִ�!!
		
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum;   // ����..
		
	}
	
	
	
	
	public static void change1(int a) {
		a = 100; 
	}
	
	
	public static void change2(int[] array) {
		array[0] = 100;
	}
	
	
	
	

	
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		
		int result = sum(array);
		System.out.println("�迭�� ��Ҹ� ���� ��� : " + result);  //�迭�� ��Ҹ� ���� ��� : 15
	
	
		
		
		int b = 1;
		change1(b);
		System.out.println(b);  // 1 (���� a���� �ȹٲ��!!) 
		// �� 1�� �����ؼ� �Ѱ�� ������ ������ ���� �ٲ��� �ʴ´�!!(�⺻Ÿ�� ����)
		
		
		
		change2(array);
		System.out.println(array[0]);  // 100 (�̰� �ٲ��!!!)
		// �Ű������� �迭�� �ּҸ� ���±� ������ �迭�� ���� �ٲٸ� �����迭�� ���� �ٲ��!!(��������)
	
	}

}
