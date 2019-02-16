package MultiThreading;

public class Transaction {

	int amount =100;
	synchronized void withdraw(int amount){
		System.out.println("Available balance is "+" "+ this.amount);
		System.out.println("Going to withdraw by "+" "+amount+" "+"amount");
		if(this.amount < amount){
			System.out.println("insufficient balance waiting for deposite...");
			for(int i=0;i<5; i++){
				try{
					Thread.sleep(1000);
					System.out.println("-");
				}catch(Exception e){
					
				}
			}
			
			try{
				wait();
			}catch(Exception e){
				System.out.println("Thread interupted..");
			}
		}
		
			this.amount -= amount;
			System.out.println(amount +" "+"amount is withdrawn"+" ");
		System.out.println("Curent balance "+" "+this.amount);
		}
	
	
	
	
	synchronized void deposite(int amount){
		System.out.println("Curent balance "+" "+this.amount);
		System.out.println("Going to deposite "+" "+amount);
		this.amount += amount;
		System.out.println("Updated balance "+" "+this.amount);
		 System.out.println("Transaction completed.\n");
		notifyAll();
	}
	
	
	
	
}
