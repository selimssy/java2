package loop;

public class Ex04_for {

	public static void main(String[] args) {
		
		// 0부터 90까지 10단위로 출력하기
		// 0, 10, 20, 30, ... 90
		
		
		// for 안에 if 넣어서 맨 뒤에 , 지우는법!!★
		for(int i = 0; i <= 90; i += 10) {
			if(i == 90) {   // t는 if(i != 90 이렇게 했다)
				System.out.print(i);
			}else {
				System.out.print(i + ", ");
			}
		}
		
	}

}
