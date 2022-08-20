package modifier_6;


class Player{
	
	String name = "홍길동";  // 인스턴스 멤버변수
	static String gameID = "기사";   // 정적 멤버변수
	
	
	//정적메소드
	public static void gamePlay() {
		
		//System.out.println(name);   // 정적메소드는 내부에 인스턴스 필드나 인스턴스 메소드 사용 불가
		
		System.out.println(gameID + "로 게임을 플레이 합니다.");
	}
	
}



public class Ex02_static_method {

	public static void main(String[] args) {
		
		Player player = new Player();
		
		player.gamePlay();    
		
		
		// 정적메소드는 원칙적으로 클래스이름으로 접근
		Player.gamePlay();
	}

}
