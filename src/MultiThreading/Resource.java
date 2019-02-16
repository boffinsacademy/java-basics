package MultiThreading;

public class Resource {
	void status()
    {
        System.out.println(Thread.currentThread().getName() + " is handling.");
    }
}
