package io;

import java.io.*;

public class Ex06 {

	public static void main(String[] args) throws Exception{
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		
		pw.print("�ȳ��ϼ���");
		pw.println(20);
		pw.println("�ڹ� �����Դϴ�.");
		pw.println("������ ������ �����̳׿�");
		pw.println("�׻� �ǰ��Ͻð� ȭ�����ϼ���!");
		
		pw.close();
		
	}

}
