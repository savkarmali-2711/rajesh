
class Q {
	int num;

	public void put(int num) {
		System.out.println("Put : " + num);
		this.num = num;
	}

	public void get() {
		System.out.println("Get : " + num);
	}
}

class ProducerD implements Runnable {
	Q q;

	public ProducerD(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	public void run() {
		while (true) {
			q.get();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

	class ConsumerD implements Runnable {
		Q q;

		public ConsumerD(Q q) {
			this.q = q;
			Thread t = new Thread(this, "Consumer");
			t.start();
		}

		public void run() {
			while (true) {
				q.get();
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		}
	}
}
public class ProduceAndConsumeDemo
{
	public static void main(String[] args) {
		
		Q q=new Q();
	}

}

	
