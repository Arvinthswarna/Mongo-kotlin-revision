package com.filehandling;
import java.io.FileWriter;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("D://file handling//info.txt");
			fw.write("welcome to himachal");
			fw.close();
			System.out.println("written into file successfully!!!");
			}catch (IOException e) {
				e.printStackTrace();
			}

	}

}
