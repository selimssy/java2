package generic;



class Box<E>{  // ���׸� Ÿ���� ����ϰڴ�
	
	private E obj;

	public E getObj() {
		return obj;
	}

	public void setObj(E obj) {
		this.obj = obj;
	}
	
	
}




public class Ex02_generic {

	public static void main(String[] args) {
		
//		Box myBox = new Box();
//		
//		myBox.setObj("�ȳ��ϼ���");
//		
//		String str = (String)myBox.getObj();    // ��ȯ Ÿ���� Object�� String���� ��������ȯ �����!
//		System.out.println(str);
		
		
		
		
		
		Box<String> myBox2 = new Box<String>();
		
		myBox2.setObj("Hello Java~");
		String str = myBox2.getObj();
		System.out.println(str);  // Hello Java~
		
	}

}
