package clazz.array_4;


class Book {
	
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	
	public void showInfo() {
		System.out.println(title + " : " + author);
	}
	
}


public class Ex02_objArray {

	public static void main(String[] args) {
		
		// 1. 길이가 5인 Book 타입의 클래스 배열 생성
		// 2. index를 사용해서 배열의 각 요소에 Book 객체 생성 후 배열의 요소에 주소값 넣기
		// 3. 반복문을 사용해서 showInfo 메서드 출력하기
		
		Book[] books = new Book[5];
		
		books[0] = new Book("JAVA", "홍길동");
		books[1] = new Book("JSP", "이몽룡");
		books[2] = new Book("SPRING", "성춘향");
		books[3] = new Book("DB", "유재석");
		books[4] = new Book("HTML", "박명수");
		
		for(int i = 0; i < books.length; i++) {
			books[i].showInfo();
		}
		
	}

}
