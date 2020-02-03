package com.durga;

class MyThread1 implements Runnable {
	
	public void run() {
		System.out.println("run method");
	}
}

public class ThreadDemo1 {
	public static void main(String[] args) {

		MyThread1 r = new MyThread1();
		Thread t1=new Thread();
		Thread t2=new Thread(r);
		t1.start();
		t2.start();
		 System.out.println("main thread");
	}
}
