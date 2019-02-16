package MultiThreading;

public class SleepingForLoop extends Thread{
	public void run(){
		for(int i=0; i< 10;i++){
			try{
				Thread.sleep(2000);
				System.out.print("-- ");
				System.out.println(getName());
			}catch(Exception e){
				
			}
		
		}
		
	}
	public static void main(String[] args) {
		
SleepingForLoop s = new SleepingForLoop();
s.setName("sana");
SleepingForLoop s1 = new SleepingForLoop();
s1.setName("mana");
s.start();
s1.start();
	}

}
