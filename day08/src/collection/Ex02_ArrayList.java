package collection;

import java.util.ArrayList;

public class Ex02_ArrayList {

	public static void main(String[] args) {
		
		// String 타입의 ArrayList를 생성한 후
		// 연예인 5명의 이름을 넣어보자
		// 이름을 향상된 for문과 일반 for문으로 출력해보기
		
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("유재석");
		list.add("박명수");
		list.add("하하");
		list.add("강호동");
		list.add("양세형");
		
		for(String str : list) {
			System.out.println(str);
		}
		
		
		System.out.println();
		
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
