package api;

import java.util.Scanner;

public class Ex01_SystemClass {

	public static void main(String[] args) {
		
		// System.currentTimeMillis() : 현재시간을 읽어서 밀리세컨드값을 long으로 준다
		long time1 = System.currentTimeMillis();
		System.out.println(time1);
		
		
		
		// System.nanoTime() : 현재시간을 읽어서 나노세컨드값을 long으로 준다
		long time2 = System.nanoTime();
		System.out.println(time2);
		
		
		
		
		// for문 10000번 도는 시간 구하기
		long start_time = System.nanoTime();
		for(int i = 0; i < 10000; i++) {}
		long end_time = System.nanoTime();
		System.out.println("소요시간 : " + (end_time - start_time) + " ns");
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("시스템 종료할까요? 1. YES  |  2. NO");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				//System.exit(0);
				break;
			}else {
				System.out.println("시스템은 계속 돌아갑니다.");
			}
			
		}
		
		System.out.println("break면 이거 출력되는데 exit(0)은 출력 안된다!");
	}

}
