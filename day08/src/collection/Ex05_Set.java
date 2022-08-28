package collection;

import java.util.*;

public class Ex05_Set {

	public static void main(String[] args) {
		
		// String 타입의 HashSet을 생성한 후
		// 과일의 이름을 5개 넣는다
		// 반복자(iterator)을 사용해서 하나씩 출력!
		
		
		
		Set<String> list = new HashSet<>();
		
		list.add("사과");
		list.add("배");
		list.add("복숭아");
		list.add("체리");
		list.add("오렌지");
		
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			
			String str = iter.next();
			
			System.out.println(str);
			
		}
		
	}

}
