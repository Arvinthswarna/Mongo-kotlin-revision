package com.example;

public class Test1 {
	static int addition(int x,int y) {
		return x+y;
	}
	
	static String generate_pnr(String source,String dest,String travelDate) {
		int i = 100;
		String pnr = source.charAt(0) +  "_" + travelDate + " _ " +  i++;
		return pnr;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res;
		res = addition(30,30);
		System.out.println("sum of two numbers are: " + res);
		
		res = addition(50,50);
		System.out.println("sum of two numbers are: " + res);
		
		String pnr;
		pnr = generate_pnr("Bangalore","Mumbai","30082022");
		System.out.println("PNR is: " + pnr);
		
		pnr = generate_pnr("Delhi","Mumbai","30082022");
		System.out.println("PNR is: " + pnr);
		
		
		}

	}


