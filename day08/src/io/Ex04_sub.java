package io;

import java.io.*;

public class Ex04_sub {

	public static void main(String[] args) throws Exception{
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);  // ���ۿ� ��´� (-> �������)
		DataOutputStream dos = new DataOutputStream(bos);  // ���� ���ϴ� ���������·� �ִ´� (-> ������)
		
		
		int a = 100;
		double b = 3.14;
		String c = "Hello Java";
		
		dos.writeInt(a);
		dos.writeDouble(b);
		dos.writeUTF(c);
		
		dos.close();
		
		
		
		
		
		
		
		
	}

}
