package io;

import java.io.*;

public class Ex07 {

	public static void main(String[] args) throws Exception{
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			
			String msg = br.readLine();   // readLine() �������������
			
			if(msg == null) {  // text���� ������ ���� null�̴�!!
				break;
			}
			
			System.out.println(msg);
			
		}
		
		
	}

}
