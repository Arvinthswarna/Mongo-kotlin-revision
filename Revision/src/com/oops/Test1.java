package com.oops;

class A {
	int number1 = 40;
	}
class B extends A{
	int number2 = 20;
	int res;
	
	void add() {
		res = number1 + number2;
		System.out.println("sum of two numbers are: " + res);
	}
	void sub() {
		res = number1 - number2;
		System.out.println("sub of two numbers are: " + res);
}}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.add();
		
		B obj1 = new B();
		obj1.sub();
	}}


