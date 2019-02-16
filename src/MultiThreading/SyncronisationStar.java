package MultiThreading;

public class SyncronisationStar extends Thread{
	SynchronisationOperation s;
	
	public SyncronisationStar(SynchronisationOperation s) {		
	this.s=s;
	}
	
	public void run(){
		s.SyncOperation(5);
	}
}
