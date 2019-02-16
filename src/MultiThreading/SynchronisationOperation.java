package MultiThreading;

public class SynchronisationOperation {
synchronized void SyncOperation(int n){
	
	for(int i=1;i<=5;i++){  
	     System.out.println(n*5);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
}
}
