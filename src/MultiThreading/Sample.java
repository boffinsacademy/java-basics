package MultiThreading;

public class Sample extends Thread{

	public void run(){
		System.out.println("Thread is running.....");
	}
	public static void main(String[] args) {
		
Sample sam = new Sample();
sam.start();
	}

}
