
public class CallRunDemo2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try{ Thread.sleep(500);}catch(Exception e) {}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		CallRunDemo2 t1=new CallRunDemo2();
		CallRunDemo2 t2=new CallRunDemo2();
		
		t1.run();
		t2.run();
	}
}
