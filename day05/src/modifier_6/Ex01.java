package modifier_6;



class Box{
	
	static int boxID = 0;   
	// static ���� : �޸𸮻��� ����
	// ���α׷� ���۽� �޸��� �޼ҵ念���� ����ȴ�
	// �����Ǵ� ���������̴�
		
	int idNum = 0;  
	// �ν��Ͻ� ����
	// Ŭ�����κ��� ��ü�� ������ �޸��� �������� �Ҵ�ȴ�
	
	public void increase() {
		boxID++;
		idNum++;
	}
	
}




public class Ex01 {

	public static void main(String[] args) {
		
		Box box1 = new Box();
		Box box2 = new Box();
		Box box3 = new Box();
		
		box1.increase();
		System.out.println("boxID : " + Box.boxID);  // boxID : 1    // box1.boxID �̷����ص� ����� ����� �ȴ�.. �ٵ� �׷�������
		System.out.println("boxID : " + box1.idNum);  // boxID : 1
		
		
		System.out.println();
		box2.increase();
		System.out.println("boxID : " + Box.boxID);  // boxID : 2 (��� ����)
		System.out.println("boxID : " + box2.idNum);  // boxID : 1
		
		
		System.out.println();
		box3.increase();
		System.out.println("boxID : " + Box.boxID);  // boxID : 3 (��� ����)
		System.out.println("boxID : " + box3.idNum);  // boxID : 1
		
		
		
	}

}
