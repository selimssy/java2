package io;

import java.io.*;

public class Ex02_IO {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		// ������ ��ġ�� ����Ų��(�߻���)
		
		
		FileOutputStream fos = new FileOutputStream(file, true);  
		// ������ ������ ������ش�!
		// ��ü ���� �� true�� �̾��, false�� �ٽ� ����!
		
		
		//fos.write(65);  // �ƽ�Ű�ڵ�� �־�����!!��   
		// ��� : C : aaa ���Ͽ� "A" ���ڰ� ����
		
		//fos.write('B');  // AB
		
		
		
		
		String msg = "Hello Java!!";
		//fos.write(msg);   //String ��°�δ� �ȵ�����!  ->  ���ڿ��� byte �迭�� ��ȯ�� �Ŀ�(getBytes) �־��!!
		
		byte[] array = msg.getBytes();
		fos.write(array);   // "Hello Java!!" ����
		
		fos.write(array, 6, 4);   // "Java!!" ����
		
		
		
		fos.close();
	}

}
