package com.filehandling;
import java.io.File;
import java.io.IOException;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("D://file handling//info.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("File created");
			}else {
				System.out.println("file not created");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
			}
}
