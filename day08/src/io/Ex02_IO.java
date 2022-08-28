package io;

import java.io.*;

public class Ex02_IO {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		// 파일의 위치를 가리킨다(추상적)
		
		
		FileOutputStream fos = new FileOutputStream(file, true);  
		// 파일이 없으면 만들어준다!
		// 객체 생성 시 true면 이어쓰기, false면 다시 쓰기!
		
		
		//fos.write(65);  // 아스키코드로 넣어진다!!★   
		// 결과 : C : aaa 파일에 "A" 문자가 들어갔다
		
		//fos.write('B');  // AB
		
		
		
		
		String msg = "Hello Java!!";
		//fos.write(msg);   //String 통째로는 안들어가진다!  ->  문자열을 byte 배열로 변환한 후에(getBytes) 넣어야!!
		
		byte[] array = msg.getBytes();
		fos.write(array);   // "Hello Java!!" 들어간다
		
		fos.write(array, 6, 4);   // "Java!!" 들어간다
		
		
		
		fos.close();
	}

}
