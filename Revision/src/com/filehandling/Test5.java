package com.filehandling;
import java.io.File;


public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D://file handling//info.txt");
		if(f.delete()) {
			System.out.println("file deleted successfully");
		}else {
			System.out.println("file not deleted");
		}

	}

}
