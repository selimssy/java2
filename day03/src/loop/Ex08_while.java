package loop;

public class Ex08_while {

	public static void main(String[] args) {
		
		// while���� ����ؼ� 1 ~ 10���� �� ���ϱ�
		
		int i = 1;
		int sum = 0;
		
		while(i <= 10) {
			sum += i;
			i++;
		}
		
		System.out.println(sum);  // 55
		System.out.println(i); // 11
	}

}
