package modifier_6;


class Player{
	
	String name = "ȫ�浿";  // �ν��Ͻ� �������
	static String gameID = "���";   // ���� �������
	
	
	//�����޼ҵ�
	public static void gamePlay() {
		
		//System.out.println(name);   // �����޼ҵ�� ���ο� �ν��Ͻ� �ʵ峪 �ν��Ͻ� �޼ҵ� ��� �Ұ�
		
		System.out.println(gameID + "�� ������ �÷��� �մϴ�.");
	}
	
}



public class Ex02_static_method {

	public static void main(String[] args) {
		
		Player player = new Player();
		
		player.gamePlay();    
		
		
		// �����޼ҵ�� ��Ģ������ Ŭ�����̸����� ����
		Player.gamePlay();
	}

}
