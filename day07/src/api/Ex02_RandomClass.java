package api;

import java.util.Random;

public class Ex02_RandomClass {

	public static void main(String[] args) {
		
		
		// Random Ŭ������ ���ڰ�(seed)�� �����Ͽ� ������ �߻������ش�
		//�⺻������ System.currentTimeMillis()�� ���ڰ��� �ٸ��� �Ѵ�!
		Random r = new Random(System.currentTimeMillis());
		
		
		
		// int ������ ���� �߻�
		System.out.println(r.nextInt());
		
		// long ������ ���� �߻�
		System.out.println(r.nextLong());
		
		
		// 0.0 �̻� 1.0 �̸��� ����
		System.out.println(r.nextFloat());
		System.out.println(r.nextDouble());
		
		
		// true, false �� �ϳ� �߻�
		System.out.println(r.nextBoolean());
		
	}

}
