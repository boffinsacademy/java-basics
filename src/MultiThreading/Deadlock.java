package MultiThreading;

public class Deadlock {

	public static void main(String[] args) {
		Resource r1 = new Resource(); // LINE A
        Resource r2 = new Resource();
        UserOne thread1 = new UserOne(r1, r2); // LINE B
        thread1.start();
        UserTwo thread2 = new UserTwo(r1, r2); // LINE C
        thread2.start();
		
	}

}
