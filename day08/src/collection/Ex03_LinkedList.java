package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex03_LinkedList {

	public static void main(String[] args) {
		
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("����");
		list.add("���ξ���");
		list.add("�ٳ���");
		
		
		// Iterator : �÷��ǿ� ����� ��ҵ��� �о���� ����� ǥ��ȭ �� ��
		// �÷��� ��ü�� iterator() �޼ҵ�� ��ü�� ���� �� �ִ�.
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {  // hasNext() : ���� ��Ұ� ������ true, ������ false
			
			String str = iter.next();    // next() : ���� ��Ҹ� ��´�
			System.out.println(str);
		}
		
		
		
		System.out.println("-----------------------------------");
		
		
		
		// Iterator�� 1ȸ���̴�. �ʿ��ϸ� �ٽ� ��ü�� ���;�!
		iter = list.iterator();
		
		while(iter.hasNext()) {
			String str = iter.next();;
			
			iter.remove();  // next() �޼ҵ�� ������ ��ü�� ����
		}
		
		
		if(list.isEmpty()) {
			System.out.println("�������");          // �������
		}else {
			System.out.println("������� ����");
		}
		
	}

}
