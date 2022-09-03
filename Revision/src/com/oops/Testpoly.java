package com.oops;
//Function overloading same function name,same return type but different number of parameters
class Calculate{
	void add(int x,int y) {
		int res;
		res =  x + y;
		System.out.println("sum of two numbers are : " + res);
	}
	void add(int x,int y,int z){
		int res;
		res = x + y + z;
		System.out.println("sum of three numbers are : " + res);
	}
	}


public class Testpoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate obj = new Calculate();
		obj.add(20,40,60);
		obj.add(10,20);

	}

}
