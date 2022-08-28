package io;

import java.io.*;

public class Ex03_IO {

	public static void main(String[] args) throws Exception{
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		FileInputStream fis = new FileInputStream(file);
		
		while(true) {
			
			//fis.read();  // 1����Ʈ�� ������ �о�´�
			
			int data = fis.read();  
			// �ѱ��� �ѱ��� �ھƽ�Ű�ڵ�Ρ� �޴´�! 
			
			
			if(data == -1) {
				break;
			}
			
			
			// �ƽ�Ű�ڵ�� ������ �ٽ� ���ڷ� ��ȯ!!
			System.out.print((char)data);  
			
			
		}
			
		
	
		fis.close();
	}

}
