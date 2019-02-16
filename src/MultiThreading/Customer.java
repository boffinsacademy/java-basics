package MultiThreading;

public class Customer extends Thread{
	Transaction t;
	int amount;
	public Customer(Transaction t, int amount) {
	this.t=t;
	this.amount=amount;
	}
	public void run(){
		
		t.withdraw(this.amount);
		
	}
	
	
}
