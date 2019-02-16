package MultiThreading;

public class UserOne extends Thread{
	 Resource r1;
	    Resource r2;

	    UserOne(Resource r1, Resource r2) // LINE D
	    {
	        this.r1 = r1;
	        this.r2 = r2;
	    }
	    public void run(){
	        synchronized (r1)
	        {
	            System.out.println(Thread.currentThread().getName() + "  is holding r1.");
	            System.out.println(Thread.currentThread().getName() + "  is waiting for r2.");
	            try
	            {
	                Thread.sleep(100);
	            }
	            catch (InterruptedException e)
	            {
	                e.printStackTrace();
	            }
	            synchronized (r2)
	            {
	                System.out.println(Thread.currentThread().getName() + "  is holding r1 & r2.");
	            }
	        }
	        		System.out.println(Thread.currentThread().getName() + " Leaving.....");
	    }
	}