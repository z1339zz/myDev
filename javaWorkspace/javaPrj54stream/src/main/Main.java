package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) throws Exception {

		System.out.println("=====stream=====");
		
		File f = new File("C:\\java\\dev\\hello.txt");
//		f.delete();  //파일삭제
		
		//1byte 단위로 처리 - 별로 ,,,
//		FileOutputStream fos = new FileOutputStream(f);
//		fos.write(70);
		
//		FileWriter fw = new FileWriter(f);
//		fw.write("게임을 시작하지;;;");
//		fw.flush();
		
//		FileInputStream fis = new FileInputStream(f);
//		
//		for(int i = 0; i < 4; i++) {
//		int result = fis.read();
//		char x = (char)result;
//		System.out.println(x);
//		}
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		for(int i = 0; i < 2; i++) {
		String result = br.readLine();
		System.out.println(result);
		}
		
	}//main

}//class
