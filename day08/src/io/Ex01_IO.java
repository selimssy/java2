package io;

import java.io.*;  // io import�ؾ�!!

public class Ex01_IO {

	public static void main(String[] args) throws Exception {  // �ϴ� ���ǻ� ���ܴ� �ѱ��
		
		
		// File ��ü ���� ���� ���
		
		File file1 = new File("C:\\aaa\\aaa.txt");  // ������ ���� ��� �������
		
		File file2 = new File("C:\\aaa", "aaa.txt");  // ���ϰ��, ���ϸ����ε� ������ �� �ִ�
		
		File file3 = new File("C:\\aaa"); // ���ϰ�α����� �־ ���� ���� �ִ�
		
		File file4 = new File(file3, "aaa.txt");  // ���ϰ�� ��ü�� �־ ���� ���� �ִ�
		
		
		
		// ������ ���������� : \
		// ������ ���������� : / �� �ٸ���!! �� ���� �ذ��ϱ� ���� �ڹٿ��� �����ϴ� ���������� File.separator ���!!
		
		File dir = new File("C:" + File.separator + "aaa");  // �ü���� �°� �˾Ƽ� ���������� �������ش�
		// File.separator : ����������
		
		
		File file = new File(dir, "aaa.txt");
		
	}

}
