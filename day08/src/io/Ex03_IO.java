package io;

import java.io.*;

public class Ex03_IO {

	public static void main(String[] args) throws Exception{
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		FileInputStream fis = new FileInputStream(file);
		
		while(true) {
			
			//fis.read();  // 1바이트의 내용을 읽어온다
			
			int data = fis.read();  
			// 한글자 한글자 ★아스키코드로★ 받는다! 
			
			
			if(data == -1) {
				break;
			}
			
			
			// 아스키코드로 받은거 다시 문자로 변환!!
			System.out.print((char)data);  
			
			
		}
			
		
	
		fis.close();
	}

}
