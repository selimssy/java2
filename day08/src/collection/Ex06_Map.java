package collection;

import java.util.*;

public class Ex06_Map {

	public static void main(String[] args) {
		
		
		
		// Map�� iterator ����X
		// ��� KeySet() ��� : ��ü Ű ��ü�� ����� Set Ÿ������ ��ȯ -> ���� �̰ɷ� iterator�� ���!! 
		
		
		
		Map<Integer, String> map = new HashMap<>();
		
		// put : ��ü �ֱ�
		map.put(new Integer(1), new String("ȫ�浿"));

		map.put(2,  "������");  // �ڵ��ڽ�
		map.put(3,  "�̼���");
		map.put(4,  "�̸���");
		map.put(1,  "�庸��");  // ���� Ű ��ü�� Map �÷��ǿ� �߰��ϸ� ���߿� ���� ��ü�� value�� ��ü�ȴ�! ("ȫ�浿" -> "�庸��")
		
		
		// Map �÷��� ���� ��ü key ��ü�� �� ���
		System.out.println("Size : " + map.size());
		
		
		// ��ü���
		System.out.println(map); // {1=�庸��, 2=������, 3=�̼���, 4=�̸���}     // Ȯ�ο� ����� �� �Ⱦ���
		
		
		
		// .get(key��ü) :  key ��ü�� value ��ü ���
		String str = map.get(1);
		System.out.println(str);  // �庸��
		// ���� �ش� key ��ü�� �������� ������ null ��ȯ
		String str2 = map.get(10);
		System.out.println(str2);  // null
		
		
		// Map�� iterator ����X
		// ��� KeySet() ��� : ��ü Ű ��ü�� ����� Set Ÿ������ ��ȯ -> ���� �̰ɷ� iterator�� ���!! 
		Set<Integer> keySet = map.keySet();
		
		Iterator<Integer> iter = keySet.iterator();
		
		while(iter.hasNext()) {
			int key = iter.next();
			String value = map.get(key);
			
			System.out.println(key + " : " + value);
		}


		System.out.println();
		
		
		
		// remove(key)  key ��ü�� Entry ���� (Ű�� value�� ��� Entry�� �θ���.)
		map.remove(1);
		map.remove(2);
		System.out.println(map);  // {3=�̼���, 4=�̸���}
		
		
		
		
		
		// clear() : ��ü����
		map.clear();
		
		if(map.isEmpty()) {
			System.out.println("�������");
		}
		
	}

}
