package collection;

import java.util.*;

public class Ex04_Set {

	public static void main(String[] args) {
		
		
		// Set������ iterator �� �� ����ؾ�!!(set�� �ε����� �����ϱ�)
		
		//Set : �������� ��������� �������� �ʴ´�
		// �������� �ߺ������� ������� �ʴ´�
		// �ε����� ��ü�� �������� �ʾƼ� get �޼ҵ嵵 ����(iterator�� �ҷ��;�!)

		
		Set<String> set = new HashSet<String>();   // Set�� �������̽�! (���������� �����Ѱ�)
		
		set.add(new String("ȫ�浿"));   // ��Ģ�� new ������
		set.add("�̼���");  // �ڵ��ڽ�
		set.add("������");
		set.add("�̸���");
		set.add("�庸��");
		set.add("ȫ�浿");  // Set�� �ߺ� �Ұ�!(�̰Ŵ� �߰� �� �ȴ�)
		
		System.out.println("Size : " + set.size());   // Size : 5
		
		
		
		System.out.println();
		
		
		
		Iterator<String> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			
			String str = setIter.next();
			System.out.println(str);
			
		}
		
		
		
		System.out.println();
		
		
		
		
		
		
		
		// remove(��ü�����Է�)
		set.remove("ȫ�浿");
		set.remove("�庸��");
		
		
		// iterator�� 1ȸ���̶� �� �� ���� ��ü ���;�!
		setIter = set.iterator();
		
		while(setIter.hasNext()) {
					
					String str = setIter.next();
					System.out.println(str);
			
		}
		
		
		
		
		
		
		
		// clear()  : ��ü ����
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("�������");   // �������
		}
		
		
		
		
		
	}

}
