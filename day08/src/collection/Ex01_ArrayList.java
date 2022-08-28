package collection;

import java.util.*;   // java.util의 모든 것 import

public class Ex01_ArrayList {

	public static void main(String[] args) {
		
		//컬렉션 요소는 객체만 가능(int, char, double 등 기본타입은 자동 박싱/언박싱 시능으로 사용)
		
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		// List : 데이터를 일렬로 늘어놓은 자료구조
		// 데이터의 중복 허용, 순서 중요
		
		
		// add(객체) : 객체 추가
		list.add(new String("홍길동"));  // 그냥 list.add("홍길동")이라고 해도 되긴 하는데 원직적으로는 new를 이용해서 객체 넣어야
		list.add("성춘향");   // 근데 그냥 넣어도 자동 박싱돼서 들어간다!!
		list.add("이몽룡");
		
		
		// size() 저장되어있는 전체 객체의 수 반환
		System.out.println(list.size());
		
		
		
		// 향상된 for문
		for(String str1 : list) {
			System.out.println(str1);
		}
		
		
		//add(인덱스, 추가할 객체) 하면 해당 인덱스 번호에 새로운 객체 삽입
		list.add(0, "이순신");  // 인덱스 0번에 끼워넣기  
		list.add(2, "장보고");  // 인덱스 2번에 끼워넣기
		
		for(String str : list) {
			System.out.print(str + " ");   // 이순신 홍길동 장보고 성춘향 이몽룡 
		}
		
		
		
			
		
		
		// set(인덱스. 수정할 객체 내용)
		list.set(0, "세종대왕");    // 인덱스 0번의 객체를 "세종대왕"으로 수정(대체)
		
		
		
		
		
		// .get(인덱스) : 해당 인덱스의 객체 반환
		String str2 = list.get(2);
		System.out.println();
		System.out.println("2 : " + str2);   // 2 : 장보고
		
		
		
		for(int i =0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		
		
		
		System.out.println();
		
		
		
		// .remove(인덱스) : 해당 인덱스의 객체 삭제  /  .remove(객체 직접 입력)
		list.remove(1);  // 1번 인덱스에 해당하는 객체(홍길동) 삭제
		list.remove("성춘향");
		
		for(int i =0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		
		
		
		
		// .clear()  : 리스트 안의 모든 객체 삭제
		// isempty()  : 리스트가 비어있으면 true, 아니면 false
		list.clear();
		
		
		if(list.isEmpty()) {
			System.out.println("비어있음");            // 비어있음
		}else {
			System.out.println("비어있지 않음");
		}
		
	}

}
