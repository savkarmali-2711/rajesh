
public class MultiPriorityDemo extends Thread {

	public void run()
	{
		System.out.println("running thread name is "+Thread.currentThread().getName());
		System.out.println("running thread priority is "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		
		MultiPriorityDemo t1=new MultiPriorityDemo();
		MultiPriorityDemo t2=new MultiPriorityDemo();
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
	}
}
