package clazz.array_4;


class Name{
	
	// 필드
	String name;
	
	// 생성자
	public Name(String name) {
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}



public class Ex01_objArray {

	public static void main(String[] args) {
		
		int[] array = new int[3];   // 길이가 3인 int 타입 배열 생성
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		
		Name[] names = new Name[3];   // 길이가 3인 Name 타입 배열 생성
		
		names[0] = new Name("홍길동");  // 객체를 넣어준다(객체의 주소값이 저장)
		names[1] = new Name("성춘향");
		names[2] = new Name("이몽룡");
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i].name);   // 홍길동 / 성춘향 / 이몽룡
		}
		
		System.out.println();
		
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i].getName());  // 홍길동 / 성춘향 / 이몽룡
		}
		
	}

}
