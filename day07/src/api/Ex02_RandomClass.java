package api;

import java.util.Random;

public class Ex02_RandomClass {

	public static void main(String[] args) {
		
		
		// Random 클래스는 종자값(seed)를 설정하여 난수를 발생시켜준다
		//기본적으로 System.currentTimeMillis()로 종자값이 다르게 한다!
		Random r = new Random(System.currentTimeMillis());
		
		
		
		// int 범위의 난수 발생
		System.out.println(r.nextInt());
		
		// long 범위의 난수 발생
		System.out.println(r.nextLong());
		
		
		// 0.0 이상 1.0 미만의 난수
		System.out.println(r.nextFloat());
		System.out.println(r.nextDouble());
		
		
		// true, false 중 하나 발생
		System.out.println(r.nextBoolean());
		
	}

}
