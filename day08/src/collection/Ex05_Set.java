package collection;

import java.util.*;

public class Ex05_Set {

	public static void main(String[] args) {
		
		// String Ÿ���� HashSet�� ������ ��
		// ������ �̸��� 5�� �ִ´�
		// �ݺ���(iterator)�� ����ؼ� �ϳ��� ���!
		
		
		
		Set<String> list = new HashSet<>();
		
		list.add("���");
		list.add("��");
		list.add("������");
		list.add("ü��");
		list.add("������");
		
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			
			String str = iter.next();
			
			System.out.println(str);
			
		}
		
	}

}
