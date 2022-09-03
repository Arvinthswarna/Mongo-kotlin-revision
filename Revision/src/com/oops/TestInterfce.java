package com.oops;

interface I1{
	void show();
	}
//multiple inheritance
public class TestInterfce implements I1 {
	public void show() {
		System.out.println("welcome to java interface");
	}
	
	public void display() {
		System.out.println("msg from interface 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterfce i1 = new TestInterfce();
		i1.show();
		
		TestInterfce i2 = new TestInterfce();
		i2.display();
}
}
