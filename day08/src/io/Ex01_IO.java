package io;

import java.io.*;  // io import해야!!

public class Ex01_IO {

	public static void main(String[] args) throws Exception {  // 일단 편의상 예외는 넘긴다
		
		
		// File 객체 생성 생성 방법
		
		File file1 = new File("C:\\aaa\\aaa.txt");  // 파일이 실제 없어도 상관없다
		
		File file2 = new File("C:\\aaa", "aaa.txt");  // 파일경로, 파일명으로도 생성할 수 있다
		
		File file3 = new File("C:\\aaa"); // 파일경로까지만 넣어서 만들 수도 있다
		
		File file4 = new File(file3, "aaa.txt");  // 파일경로 객체를 넣어서 만들 수도 있다
		
		
		
		// 윈도우 폴더구별자 : \
		// 리눅스 폴더구별자 : / 로 다르다!! 이 문제 해결하기 위해 자바에서 제공하는 폴더구별자 File.separator 사용!!
		
		File dir = new File("C:" + File.separator + "aaa");  // 운영체제에 맞게 알아서 폴더구별자 생성해준다
		// File.separator : 폴더구별자
		
		
		File file = new File(dir, "aaa.txt");
		
	}

}
