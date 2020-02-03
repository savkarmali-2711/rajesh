package com.durga;

 class MyThread extends Thread 
{
	public void run()
	{
	for(int i=0;i<5;i++)
	{
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("run method");
	}
			
	}
	/*public void start()
	{
		//super.start();
		System.out.println("start method");
	}*/
}
public class ThreadDemo
 {
	 public static void main(String[] args) throws InterruptedException {
		
		 MyThread t1=new MyThread();
		 t1.start();
		 t1.join();
		 // t1.run();
		 for(int i=0;i<5;i++)
		 {
			 System.out.println("main thread"); 
		 }
		 
	}
}