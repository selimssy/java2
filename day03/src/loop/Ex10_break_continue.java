package loop;

public class Ex10_break_continue {

	public static void main(String[] args) {
		
		
		
		// break��
		
		int x = 0;
		
		while(x < 10) {
			System.out.print(x + "  ");
			
			if(x == 5) {
				break;
			}
			
			x++;
		}
		System.out.println();
		System.out.println(x);  // 5 (x++ �������� �����������ϱ�)
		
		
		
		
		
		// continue��
		
		for(int i = 0; i < 10; i++) {
			
			if(i == 5) {
				continue;
			}
			
			System.out.print(i + "  ");
			
		}
		
		
		
		
	}

}
