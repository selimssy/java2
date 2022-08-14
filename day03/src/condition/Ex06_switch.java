package condition;

import java.util.Scanner;

public class Ex06_switch {

	public static void main(String[] args) {
		
		// 주민번호를 입력받아 성별 맞추기
		char gender = ' ';   // 성별
		String ssn = "";   // 주민번호
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 주민번호를 입력하세요.");
		System.out.println("예: 123456-1234567");
		
		ssn = sc.next();   // 공백 전까지 문자열 읽어온다.
		
		// charAt★ (String 클래스의 메소드) // 타입: char로 반환
		gender = ssn.charAt(7);  // 문자 중 0부터 시작해서 7번째 문자를 반환!!
		
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
			
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
			
		default:
			System.out.println("유효하지 않은 주민번호입니다.");
		}
		
		sc.close();
	}

}
