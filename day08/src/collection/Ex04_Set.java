package collection;

import java.util.*;

public class Ex04_Set {

	public static void main(String[] args) {
		
		
		// Set에서는 iterator 더 잘 사용해야!!(set은 인덱스가 없으니까)
		
		//Set : 데이터의 저장순서를 유지하지 않는다
		// 데이터의 중복저장을 허용하지 않는다
		// 인덱스로 객체를 관리하지 않아서 get 메소드도 없다(iterator로 불러와야!)

		
		Set<String> set = new HashSet<String>();   // Set은 인터페이스! (다형성으로 생성한거)
		
		set.add(new String("홍길동"));   // 원칙은 new 연산자
		set.add("이순신");  // 자동박싱
		set.add("성춘향");
		set.add("이몽룡");
		set.add("장보고");
		set.add("홍길동");  // Set은 중복 불가!(이거는 추가 안 된다)
		
		System.out.println("Size : " + set.size());   // Size : 5
		
		
		
		System.out.println();
		
		
		
		Iterator<String> setIter = set.iterator();
		
		while(setIter.hasNext()) {
			
			String str = setIter.next();
			System.out.println(str);
			
		}
		
		
		
		System.out.println();
		
		
		
		
		
		
		
		// remove(객체직접입력)
		set.remove("홍길동");
		set.remove("장보고");
		
		
		// iterator는 1회성이라 쓸 때 마다 객체 얻어와야!
		setIter = set.iterator();
		
		while(setIter.hasNext()) {
					
					String str = setIter.next();
					System.out.println(str);
			
		}
		
		
		
		
		
		
		
		// clear()  : 전체 삭제
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("비어있음");   // 비어있음
		}
		
		
		
		
		
	}

}
