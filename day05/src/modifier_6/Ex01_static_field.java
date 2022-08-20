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




public class Ex01_static_field {

	public static void main(String[] args) {
		
		Box box1 = new Box();
		Box box2 = new Box();
		Box box3 = new Box();
		
		
		// �ν��Ͻ� ������ ��ü���� �������� �ʰ� static ������ ��� ��ü�� �����ȴ�
		// �����ʵ�� ��Ģ������ Ŭ���������� ����!
		
		box1.increase();
		System.out.println("boxID : " + box1.boxID);  // boxID : 1    // ��Ģ������ Ŭ���������� �����ؾ�!!  box1.boxID �̷����ص� ����� ����� �ȴ�.. �ٵ� �׷�������
		System.out.println("boxID : " + box1.idNum);  // boxID : 1
		
		
		System.out.println();
		box2.increase();
		System.out.println("boxID : " + box2.boxID);  // boxID : 2 (��� ����)
		System.out.println("boxID : " + box2.idNum);  // boxID : 1
		
		
		System.out.println();
		box3.increase();
		System.out.println("boxID : " + box3.boxID);  // boxID : 3 (��� ����)
		System.out.println("boxID : " + box3.idNum);  // boxID : 1
		
		
		
	}

}
