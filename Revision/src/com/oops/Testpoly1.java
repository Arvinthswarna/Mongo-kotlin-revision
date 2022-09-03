package com.oops;

// function overloading rule 2:same function name,same return type ,same  number of parameters but of different type



	class Calculate1{
		void add(double x,double y) {
			double res;
			res =  x + y;
			System.out.println("sum of two numbers are : " + res);
		}
		void add(double x,double y,double z){
			double res;
			res = x + y + z;
			System.out.println("sum of three numbers are : " + res);
		}
		}


	public class Testpoly1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Calculate1 obj = new Calculate1();
			obj.add(20,40,60);
			obj.add(30.40,20.90);

		}
}

