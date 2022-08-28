package collection;

import java.util.*;   // java.util�� ��� �� import

public class Ex01_ArrayList {

	public static void main(String[] args) {
		
		//�÷��� ��Ҵ� ��ü�� ����(int, char, double �� �⺻Ÿ���� �ڵ� �ڽ�/��ڽ� �ô����� ���)
		
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		// List : �����͸� �Ϸķ� �þ���� �ڷᱸ��
		// �������� �ߺ� ���, ���� �߿�
		
		
		// add(��ü) : ��ü �߰�
		list.add(new String("ȫ�浿"));  // �׳� list.add("ȫ�浿")�̶�� �ص� �Ǳ� �ϴµ� ���������δ� new�� �̿��ؼ� ��ü �־��
		list.add("������");   // �ٵ� �׳� �־ �ڵ� �ڽ̵ż� ����!!
		list.add("�̸���");
		
		
		// size() ����Ǿ��ִ� ��ü ��ü�� �� ��ȯ
		System.out.println(list.size());
		
		
		
		// ���� for��
		for(String str1 : list) {
			System.out.println(str1);
		}
		
		
		//add(�ε���, �߰��� ��ü) �ϸ� �ش� �ε��� ��ȣ�� ���ο� ��ü ����
		list.add(0, "�̼���");  // �ε��� 0���� �����ֱ�  
		list.add(2, "�庸��");  // �ε��� 2���� �����ֱ�
		
		for(String str : list) {
			System.out.print(str + " ");   // �̼��� ȫ�浿 �庸�� ������ �̸��� 
		}
		
		
		
			
		
		
		// set(�ε���. ������ ��ü ����)
		list.set(0, "�������");    // �ε��� 0���� ��ü�� "�������"���� ����(��ü)
		
		
		
		
		
		// .get(�ε���) : �ش� �ε����� ��ü ��ȯ
		String str2 = list.get(2);
		System.out.println();
		System.out.println("2 : " + str2);   // 2 : �庸��
		
		
		
		for(int i =0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		
		
		
		System.out.println();
		
		
		
		// .remove(�ε���) : �ش� �ε����� ��ü ����  /  .remove(��ü ���� �Է�)
		list.remove(1);  // 1�� �ε����� �ش��ϴ� ��ü(ȫ�浿) ����
		list.remove("������");
		
		for(int i =0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		
		
		
		
		// .clear()  : ����Ʈ ���� ��� ��ü ����
		// isempty()  : ����Ʈ�� ��������� true, �ƴϸ� false
		list.clear();
		
		
		if(list.isEmpty()) {
			System.out.println("�������");            // �������
		}else {
			System.out.println("������� ����");
		}
		
	}

}
