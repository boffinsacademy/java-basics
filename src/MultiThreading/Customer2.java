package MultiThreading;

public class Customer2 extends Thread{
	Transaction t;
	int amount;
	public Customer2(Transaction t, int amount) {
	this.t=t;
	this.amount=amount;
	}
	public void run(){
		
		
		t.deposite(this.amount);
	}
	
	
}
