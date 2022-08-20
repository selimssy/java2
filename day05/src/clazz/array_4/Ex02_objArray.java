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
		
		// 1. ���̰� 5�� Book Ÿ���� Ŭ���� �迭 ����
		// 2. index�� ����ؼ� �迭�� �� ��ҿ� Book ��ü ���� �� �迭�� ��ҿ� �ּҰ� �ֱ�
		// 3. �ݺ����� ����ؼ� showInfo �޼��� ����ϱ�
		
		Book[] books = new Book[5];
		
		books[0] = new Book("JAVA", "ȫ�浿");
		books[1] = new Book("JSP", "�̸���");
		books[2] = new Book("SPRING", "������");
		books[3] = new Book("DB", "���缮");
		books[4] = new Book("HTML", "�ڸ��");
		
		for(int i = 0; i < books.length; i++) {
			books[i].showInfo();
		}
		
	}

}
