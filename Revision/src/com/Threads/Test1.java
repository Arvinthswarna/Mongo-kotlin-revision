package com.Threads;

public class Test1 extends Thread{
	public void run() {
		System.out.println("display from run() in threads");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 obj = new Test1();
		obj.start();
			}
}
