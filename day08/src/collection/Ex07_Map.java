package collection;

import java.util.*;

public class Ex07_Map {

	public static void main(String[] args) {
		
		// HashMap을 사용해서 아이디와 비밀번호 넣기
		// 둘 다 String 타입
		// keySet 메소드로 key 목록을 Set 타입으로 얻은 후 Iterator를 사용해서 아이디와 비밀번호 출력!
		
		
		Map<String, String> map = new HashMap<>();
		
		map.put("hong1", "123");
		map.put("sung_02", "1003");
		map.put("min1020", "142");
		map.put("pue334", "adf3");
		map.put("gugu_100", "1f2f");
		
		
		Set<String> keySet = map.keySet(); // 전체 키 객체의 목록을 Set 타입으로 반환
		
		Iterator<String> iter = keySet.iterator();
		
		while(iter.hasNext()) {
			
			String id = iter.next();
			String pw = map.get(id);
			
			System.out.println("아이디 : " + id + " , 비밀번호 : " + pw);
		}
		
	}

}
