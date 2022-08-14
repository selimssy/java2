package loop;

import java.util.Scanner;

public class Ex11_dowhile_Example {

	public static void main(String[] args) {
		
		// 커피숍 주문받기
		
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		do {
			
			System.out.println("손님 주문하시겠습니까?");
			System.out.println("1.아메리카노 2.카페라떼 3.카페모카 4.아이스티 5.주문종료");
			
			System.out.print("메뉴번호 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			
				case 1:
					System.out.println("**아메리카노 주문 받았습니다.**");
					System.out.println("**아메리카노 나왔습니다~ 맛있게 드세요!**");
					break;
					
				case 2:
					System.out.println("**카페라떼 주문 받았습니다.**");
					System.out.println("**카페라떼 나왔습니다~ 맛있게 드세요!**");
					break;
				
				case 3:
					System.out.println("**카페모카 주문 받았습니다.**");
					System.out.println("**카페모카 나왔습니다~ 맛있게 드세요!**");
					break;
				
				case 4:
					System.out.println("**아이스티 주문 받았습니다.**");
					System.out.println("**아이스티 나왔습니다~ 맛있게 드세요!**");
					break;
					
				case 5:
					System.out.println("이용해주셔서 감사합니다.");
					break;
					
				default:
					System.out.println("잘못된 번호입니다.");
			}
			
		}while(menu != 5);
		
		
		
		sc.close();
	}

}
