package com.practice;

class MyThread extends Thread  {

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("seetha thread...");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}	
}

public class PracticeDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread t=new MyThread();
		t.start();
		t.join();
		Thread.currentThread().join();
		for(int i=0;i<10;i++) {
			System.out.println("Rama thread...");
		}
		
	}
}