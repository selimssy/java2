package collection;

import java.util.*;   // java.util�� ��� �� import

public class Ex01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		// List : �����͸� �Ϸķ� �þ���� �ڷᱸ��
		// �������� �ߺ� ���, ���� �߿�
		
		
		// add(��ü) : ��ü �߰�
		list.add(new String("ȫ�浿"));  // �׳� list.add("ȫ�浿")�̶�� �ص� �Ǳ� �ϴµ� ���������δ� new�� �̿��ؼ� ��ü �־��
		list.add("������");
		list.add("�̸���");
		
		
		// size() ����Ǿ��ִ� ��ü ��ü�� �� ��ȯ
		System.out.println(list.size());
		
	}

}
