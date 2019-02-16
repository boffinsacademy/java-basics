package MultiThreading;

public class Customer3 extends Thread{
	Transaction t;
	int amount;
	public Customer3(Transaction t, int amount) {
	this.t=t;
	this.amount=amount;
	}
	public void run(){
		
		
		t.withdraw(this.amount);
	}
	
	
}
