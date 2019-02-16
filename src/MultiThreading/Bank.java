package MultiThreading;

public class Bank {

	public static void main(String[] args) {
	
		final Transaction t = new Transaction();
		Customer c = new Customer(t, 1060);
		
		Customer2 c1 = new Customer2(t, 76000);
		Customer3 c2 = new Customer3(t, 10600);
		c.start();
		c1.start();
		c2.start();
	}

}
