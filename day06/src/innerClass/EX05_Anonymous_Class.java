package innerClass;


class Outer5{
	
	public void aaa() {
		System.out.println("aaa");
	}
	
	public void bbb() {
		System.out.println("bbb");
	}
	
	public void ccc() {
		System.out.println("ccc");
	}
	
}




public class EX05_Anonymous_Class {

	public static void main(String[] args) {
		
		
		// 익명 내부 클래스 - bbbbb 5개 필요한데 딱 한번 사용할건데 직접 수정이 불가할 때 딱 한번 쓸 때 수정해주려고 사용	
		Outer5 outer = new Outer5() {
			
			public void bbb() {
				System.out.println("bbbbb");
			}
			
		}; // 익명 내부클래스는 끝에 꼭 ; 넣어줘야!!
		
		
		outer.aaa();  // aaa
		outer.bbb();  // bbbbb
		outer.ccc();  // ccc
		 
	}

}
