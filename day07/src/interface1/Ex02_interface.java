package interface1;




interface Print{
	void printA4();    // 앞에 public abstract 생략된 것
}



interface Scan{
	void scanA4();
}



class Machine implements Print, Scan{

	@Override
	public void scanA4() {
		System.out.println("A4용지를 스캔합니다.");
	}

	@Override
	public void printA4() {
		System.out.println("A4용지를 프린트합니다.");
	}
	
	
}








public class Ex02_interface {

	public static void main(String[] args) {
		
		Machine machine = new Machine();
		machine.printA4();  // A4용지를 프린트합니다.
		machine.scanA4();   // A4용지를 스캔합니다.
		
		
	}

}
