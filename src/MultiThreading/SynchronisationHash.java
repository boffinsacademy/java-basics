package MultiThreading;

public class SynchronisationHash extends Thread{
SynchronisationOperation s;
SynchronisationHash(SynchronisationOperation s){
	this.s=s;
}

public void run(){
	s.SyncOperation(100);
}
}
