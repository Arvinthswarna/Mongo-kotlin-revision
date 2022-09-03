package com.Threads;

public class Test5 extends Thread {
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i = 1; i<=5 ; i++) {
			try {
				Thread.sleep(500);//500 indicates 0.5 second.each and every number occur after 0.5 second in output
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Test5 t1 = new Test5();
	Test5 t2 = new Test5();
	
	t1.start();
	try {	
		t1.join();
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
	t2.start();
	}

}
