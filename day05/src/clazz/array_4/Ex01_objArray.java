package clazz.array_4;


class Name{
	
	// �ʵ�
	String name;
	
	// ������
	public Name(String name) {
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}



public class Ex01_objArray {

	public static void main(String[] args) {
		
		int[] array = new int[3];   // ���̰� 3�� int Ÿ�� �迭 ����
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		
		Name[] names = new Name[3];   // ���̰� 3�� Name Ÿ�� �迭 ����
		
		names[0] = new Name("ȫ�浿");  // ��ü�� �־��ش�(��ü�� �ּҰ��� ����)
		names[1] = new Name("������");
		names[2] = new Name("�̸���");
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i].name);   // ȫ�浿 / ������ / �̸���
		}
		
		System.out.println();
		
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i].getName());  // ȫ�浿 / ������ / �̸���
		}
		
	}

}
