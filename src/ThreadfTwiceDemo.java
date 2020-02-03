
public class ThreadfTwiceDemo extends Thread
{
	public void run()
	{
		System.out.println("Running");
	}
	
	public static void main(String[] args) 
	{	
		ThreadfTwiceDemo t1=new ThreadfTwiceDemo();
		
		t1.start();
		t1.start();
	}
}
