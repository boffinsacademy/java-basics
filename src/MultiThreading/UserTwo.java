package MultiThreading;
class UserTwo extends Thread
{
    Resource r1;
    Resource r2;

    UserTwo(Resource r1, Resource r2){
        this.r1 = r1;
        this.r2 = r2;
    }
    public void run() // LINE E
    {
        synchronized (r2)
        {
            System.out.println(Thread.currentThread().getName() + "  is holding r2.");
            System.out.println(Thread.currentThread().getName() + "  is waiting for r1.");
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            synchronized (r1)
            {
                System.out.println(Thread.currentThread().getName() + "  is holding r2 & r1.");
            }
        }
    }
}