package generic;



class Box<E>{  // 제네릭 타입을 사용하겠다
	
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
//		myBox.setObj("안녕하세요");
//		
//		String str = (String)myBox.getObj();    // 반환 타입이 Object라서 String으로 강제형변환 해줘야!
//		System.out.println(str);
		
		
		
		
		
		Box<String> myBox2 = new Box<String>();
		
		myBox2.setObj("Hello Java~");
		String str = myBox2.getObj();
		System.out.println(str);  // Hello Java~
		
	}

}
