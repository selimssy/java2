package wrapper;

public class Ex01_WrapperClass {

	public static void main(String[] args) {
		
		
		// Wrapper Ŭ���� ��� ����
		
		// �Ű������� ��ü�� �䱸�Ǵ� ���
		// �⺻���� �ƴ� ��ü�� �����ؾ� �ϴ� ���
		// ���ڿ��� �⺻ Ÿ���� ������ �ٲٴ� ���
		// ��ü���� �񱳰� �ʿ��� ��� � wrapper Ŭ������ ���δ�.
		// �ڹ� Collection �������̽��� �ڰ�ü�� ��ޡ��ϱ� ������ �⺻Ÿ���� ��ü�� ����ؾ� �ϴ� ��찡 �ִ�!!
		
		
		int a = 5;
		
		Integer b = new Integer(a);  //t: �Ű澲������.....   // �⺻Ÿ���� ���� ���ο� �ΰ� ���尴ü�� �����.(�ڽ�)
		
		
		int c = b.intValue();  // �ڽ̵� ���尴ü���� �⺻Ÿ���� ���� ��´�(��ڽ�)
		
		System.out.println(c);  // 5
	}

}
