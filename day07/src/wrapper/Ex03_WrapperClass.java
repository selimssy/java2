package wrapper;

public class Ex03_WrapperClass {

	public static void main(String[] args) {
		
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(100);
		
		
		// ���尴ü ��
		System.out.println(obj1 == obj2);  // false
		
		
		// ���尴ü ������ ������ �� : equals()
		System.out.println(obj1.equals(obj2));  // true
		
	}

}
