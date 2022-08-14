package loop;

public class Ex07_while {

	public static void main(String[] args) {
		
		// while문
		
		int i = 1;
		
		while(i <= 5) {
			System.out.println(i + ". 안녕하세요");
			i++;
		}
		
		System.out.println(i);  // 6     // for이든 while이든 둘 다 이렇게 증가되고 나서 조건에 걸려서 못들어가서 끝난다!
	}

}
