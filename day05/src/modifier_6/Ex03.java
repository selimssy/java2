package modifier_6;

public class Ex03 {
	
	
	static {  // static ��� : static �ʵ� �ʱ�ȭ ����
		System.out.println("static ���");
	}
	
	
	
	{// �ν��Ͻ� ��� : ��ü ������ ȣ��Ǿ� ��ü�ʱ�ȭ ����
		System.out.println("�ν��Ͻ� ���");
	}
	
	
	public Ex03(){
		System.out.println("������");
	}
	

	public static void main(String[] args) {
		
		System.out.println("���θ޼ҵ� ����!");
		
		Ex03 ex1 = new Ex03();
		
		Ex03 ex2 = new Ex03();
		
		System.out.println("���θ޼ҵ� ��!");
	}

}
