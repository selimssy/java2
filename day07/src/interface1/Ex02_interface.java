package interface1;




interface Print{
	void printA4();    // �տ� public abstract ������ ��
}



interface Scan{
	void scanA4();
}



class Machine implements Print, Scan{

	@Override
	public void scanA4() {
		System.out.println("A4������ ��ĵ�մϴ�.");
	}

	@Override
	public void printA4() {
		System.out.println("A4������ ����Ʈ�մϴ�.");
	}
	
	
}








public class Ex02_interface {

	public static void main(String[] args) {
		
		Machine machine = new Machine();
		machine.printA4();  // A4������ ����Ʈ�մϴ�.
		machine.scanA4();   // A4������ ��ĵ�մϴ�.
		
		
	}

}
