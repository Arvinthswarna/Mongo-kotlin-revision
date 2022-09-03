package com.oops;

//Function overriding Rule 1:same function name,same return type,same number of parameters
                    //  Rule 2:Inheritance has to happen.
class A1{
	void display() {
		System.out.println("welcome from class A1");
	}
}
class B1 extends A1{
	void display() {
		System.out.println("welcome from class B1");
	}
}

public class Testpoly2 {
	public static void main(String[] args) {
		B1 obj = new B1();
		obj.display();
	}
	}
