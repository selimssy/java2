package generic;

public class Ex01_generic {

	public static void main(String[] args) {
		
		// Object Ÿ���� ��� ��ü�� Ÿ���� �� �� ��(��� ��ü�� ���� �� �ֵ�)
		Object[] obj = new Object[5];
		
		obj[0] = new Integer(100);
		obj[1] = 3.14;
		obj[2] = new Character('��');
		obj[3] = "Hello~ Java~";
		obj[4] = true;
		
		for(int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
	}

}
