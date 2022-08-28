package collection;

import java.util.*;

public class Ex06_Map {

	public static void main(String[] args) {
		
		
		
		// Map은 iterator 제공X
		// 대신 KeySet() 사용 : 전체 키 객체의 목록을 Set 타입으로 반환 -> 이제 이걸로 iterator을 사용!! 
		
		
		
		Map<Integer, String> map = new HashMap<>();
		
		// put : 객체 넣기
		map.put(new Integer(1), new String("홍길동"));

		map.put(2,  "성춘향");  // 자동박싱
		map.put(3,  "이순신");
		map.put(4,  "이몽룡");
		map.put(1,  "장보고");  // 같읕 키 객체로 Map 컬렉션에 추가하면 나중에 넣은 객체의 value로 대체된다! ("홍길동" -> "장보고")
		
		
		// Map 컬렉션 안의 전체 key 객체의 수 얻기
		System.out.println("Size : " + map.size());
		
		
		// 전체출력
		System.out.println(map); // {1=장보고, 2=성춘향, 3=이순신, 4=이몽룡}     // 확인용 말고는 잘 안쓴다
		
		
		
		// .get(key객체) :  key 객체로 value 객체 얻기
		String str = map.get(1);
		System.out.println(str);  // 장보고
		// 만약 해당 key 객체가 존재하지 않으면 null 반환
		String str2 = map.get(10);
		System.out.println(str2);  // null
		
		
		// Map은 iterator 제공X
		// 대신 KeySet() 사용 : 전체 키 객체의 목록을 Set 타입으로 반환 -> 이제 이걸로 iterator을 사용!! 
		Set<Integer> keySet = map.keySet();
		
		Iterator<Integer> iter = keySet.iterator();
		
		while(iter.hasNext()) {
			int key = iter.next();
			String value = map.get(key);
			
			System.out.println(key + " : " + value);
		}


		System.out.println();
		
		
		
		// remove(key)  key 객체로 Entry 삭제 (키랑 value랑 묶어서 Entry라 부른다.)
		map.remove(1);
		map.remove(2);
		System.out.println(map);  // {3=이순신, 4=이몽룡}
		
		
		
		
		
		// clear() : 전체삭제
		map.clear();
		
		if(map.isEmpty()) {
			System.out.println("비어있음");
		}
		
	}

}
