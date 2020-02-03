class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) throws Exception {
		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("less balanced ; waiting for deposit...");

			wait();
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();
	}

}

public class InterThreadDemo {

	public static void main(String[] args) {

		Customer c = new Customer();
		new Thread() {
			public void run() {
				try {
					c.withdraw(15000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}.start();

		new Thread(){  
			public void run(){c.deposit(10000);}  
			}.start();  
	}

}
