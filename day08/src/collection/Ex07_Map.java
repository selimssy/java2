package collection;

import java.util.*;

public class Ex07_Map {

	public static void main(String[] args) {
		
		// HashMap�� ����ؼ� ���̵�� ��й�ȣ �ֱ�
		// �� �� String Ÿ��
		// keySet �޼ҵ�� key ����� Set Ÿ������ ���� �� Iterator�� ����ؼ� ���̵�� ��й�ȣ ���!
		
		
		Map<String, String> map = new HashMap<>();
		
		map.put("hong1", "123");
		map.put("sung_02", "1003");
		map.put("min1020", "142");
		map.put("pue334", "adf3");
		map.put("gugu_100", "1f2f");
		
		
		Set<String> keySet = map.keySet(); // ��ü Ű ��ü�� ����� Set Ÿ������ ��ȯ
		
		Iterator<String> iter = keySet.iterator();
		
		while(iter.hasNext()) {
			
			String id = iter.next();
			String pw = map.get(id);
			
			System.out.println("���̵� : " + id + " , ��й�ȣ : " + pw);
		}
		
	}

}
