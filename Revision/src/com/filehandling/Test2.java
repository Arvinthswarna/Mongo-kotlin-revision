package com.filehandling;

import java.io.File;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("D://file handling//info.txt");
		if(f.exists()) {
			System.out.println(f.getName());
			System.out.println(f.getPath());
			System.out.println(f.canWrite());
			System.out.println(f.canRead());
			System.out.println(f.length());//file length in bytes
		}

	}

}
