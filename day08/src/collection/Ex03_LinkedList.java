package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex03_LinkedList {

	public static void main(String[] args) {
		
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("망고");
		list.add("파인애플");
		list.add("바나나");
		
		
		// Iterator : 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화 한 것
		// 컬렉션 객체의 iterator() 메소드로 객체를 얻어올 수 있다.
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {  // hasNext() : 다음 요소가 있으면 true, 없으면 false
			
			String str = iter.next();    // next() : 다음 요소를 얻는다
			System.out.println(str);
		}
		
		
		
		System.out.println("-----------------------------------");
		
		
		
		// Iterator는 1회성이다. 필요하면 다시 객체를 얻어와야!
		iter = list.iterator();
		
		while(iter.hasNext()) {
			String str = iter.next();;
			
			iter.remove();  // next() 메소드로 가져온 객체를 삭제
		}
		
		
		if(list.isEmpty()) {
			System.out.println("비어있음");          // 비어있음
		}else {
			System.out.println("비어있지 않음");
		}
		
	}

}
