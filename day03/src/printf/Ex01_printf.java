package printf;

public class Ex01_printf {

	public static void main(String[] args) {
		
		System.out.printf("안녕하세요.\n");
		// ()안에 첫 번째 문자열 형식대로 내용 출력
		
		
		// 서식문자 - printf() 안에서만 사용 가능
		// %d : 정수
		// $f : 실수
		// %c : 문자
		// %s : 문자열
	
		String name = "홍길동";
		System.out.printf("이름 : %s\n", name);
		//System.out.printf("이름 : %s\n", "홍길동");
		
		System.out.printf("나이 : %d\n", 20);
		
		System.out.printf("키 : %.2f\n", 180.535);  // 키 : 180.54
		
		System.out.printf("학점 : %c\n", 'A');
		
		
		System.out.printf("내 이름은 %s이고 나이는 %d살이며 키는 %.2fcm이고 학점은 %c입니다.\n", name, 20, 180.535, 'A');
		
		
		System.out.printf("%10d\n", 123);
		System.out.printf("%-5d\n", 123);
		// 서식지정자 안에 %숫자d로 작성하면 출력시 해당위치에 숫자값 만큼의 공간확보를 하고 값을 출력
	}

}
