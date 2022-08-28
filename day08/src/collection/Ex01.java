package collection;

import java.util.*;   // java.util의 모든 것 import

public class Ex01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		// List : 데이터를 일렬로 늘어놓은 자료구조
		// 데이터의 중복 허용, 순서 중요
		
		
		// add(객체) : 객체 추가
		list.add(new String("홍길동"));  // 그냥 list.add("홍길동")이라고 해도 되긴 하는데 원직적으로는 new를 이용해서 객체 넣어야
		list.add("성춘향");
		list.add("이몽룡");
		
		
		// size() 저장되어있는 전체 객체의 수 반환
		System.out.println(list.size());
		
	}

}
