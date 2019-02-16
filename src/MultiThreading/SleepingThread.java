package MultiThreading;

public class SleepingThread extends Thread{
	String name;
	public SleepingThread(String name) {
		this.name=name;
}
	public void run(){
		System.out.println(name+" "+"before thread sleeping");
		
		try{
		Thread.sleep(2000);
		}catch(Exception e){
			
		}
		
		System.out.println("Wake up "+"  "+name+"....");
	}
	
	public static void main(String[] args) {
		SleepingThread s = new SleepingThread("Shekhar");
		s.start();
		try{
		s.join();
		}catch(Exception e){
			
		}
		SleepingThread s1 = new SleepingThread("Sanaya");
		s1.start();
	}

}
