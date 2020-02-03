
public class JoinDemo2 extends Thread
{
    /*public void run()
    {
    	for(int i=1;i<=5;i++)
    	{
    		try {Thread.sleep(500);}catch(Exception e) {}
    		System.out.println(i);
    	}
    }
    public static void main(String[] args) throws InterruptedException {
		
    	JoinDemo2 t1=new JoinDemo2();
    	JoinDemo2 t2=new JoinDemo2();
    	JoinDemo2 t3=new JoinDemo2();
    	
    	t1.start();
    	t1.join();
    	//t1.join(1500);
    	
    	t2.start();
    	t3.start();
	}*/
	
	/*public void run()
	{
		System.out.println("Running");
	}
	public static void main(String[] args) {
		
		JoinDemo2 t1=new JoinDemo2();
		JoinDemo2 t2=new JoinDemo2();
		JoinDemo2 t3=new JoinDemo2();
		
		System.out.println("Name of t1 "+t1.getName());
		System.out.println("Name of t2 "+t2.getName());
		System.out.println("Id of t1 "+t1.getId());
		
		t1.start();
		t2.start();
		
		t1.setName("swapnil");
		System.out.println("After changing name of t1 "+t1.getName());
		
	}*/
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		
		JoinDemo2 t1=new JoinDemo2();
		JoinDemo2 t2=new JoinDemo2();
		
		t1.start();
		t2.start();
	}
}
