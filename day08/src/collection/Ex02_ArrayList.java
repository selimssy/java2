package collection;

import java.util.ArrayList;

public class Ex02_ArrayList {

	public static void main(String[] args) {
		
		// String Ÿ���� ArrayList�� ������ ��
		// ������ 5���� �̸��� �־��
		// �̸��� ���� for���� �Ϲ� for������ ����غ���
		
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("���缮");
		list.add("�ڸ��");
		list.add("����");
		list.add("��ȣ��");
		list.add("�缼��");
		
		for(String str : list) {
			System.out.println(str);
		}
		
		
		System.out.println();
		
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
