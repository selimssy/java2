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
		
		
		// �͸� ���� Ŭ���� - bbbbb 5�� �ʿ��ѵ� �� �ѹ� ����Ұǵ� ���� ������ �Ұ��� �� �� �ѹ� �� �� �������ַ��� ���	
		Outer5 outer = new Outer5() {
			
			public void bbb() {
				System.out.println("bbbbb");
			}
			
		}; // �͸� ����Ŭ������ ���� �� ; �־����!!
		
		
		outer.aaa();  // aaa
		outer.bbb();  // bbbbb
		outer.ccc();  // ccc
		 
	}

}
