package array;

public class Ex01_array {

	public static void main(String[] args) {
		
		// �迭 ���� �� ����
		
		
		// �������� �˰����� ��: ����� ���ÿ� �迭�� ����  // new ������ ���� ����
		int[] intArray1 = {10, 20, 30}; 
		
		System.out.println(intArray1);  // [I@6ee52dcd //�迭�� �ּ�
		System.out.println(intArray1[0]);  // 10
		System.out.println(intArray1[1]);  // 20
		System.out.println(intArray1[2]);  // 30
		
		
		
		
		int[] intArray2 = null;  // null�� �ʱ�ȭ
		//intArray2 = {100, 200, 300};   // �ʱ�ȭ �� �Ŀ��� new ���� �߰�ȣ������ �迭 ���� �Ұ�!
		intArray2 = new int[] {100, 200, 300};  // �̷��� new�� �����ؾ�!
		
		System.out.println(intArray2[0]);  // 100
		System.out.println(intArray2[1]);  // 200
		System.out.println(intArray2[2]);  // 300
		
		
		
		
		int[] intArray3 = new int[3];  // ������ ���� ���̸� ����
		intArray3[0] = 400;  // �̷������� ����
		intArray3[1] = 500;
		intArray3[2] = 600;
		
		System.out.println(intArray3[0]);  // 400
		System.out.println(intArray3[1]);  // 500
		System.out.println(intArray3[2]);  // 600
	}

}
