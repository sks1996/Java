class thread2 implements Runnable
{
    Thread t;
    thread2()
    {
        t=new Thread(this,"demo thread");
        System.out.println("child thread" +t);
        t.start();
    }
    @Override
    public void run()
    {
        try
        {
            for (int i=5;i>0;i--)
            {
                System.out.println("child thread" +i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("child interuppted");
        }
        System.out.println("existing child thread");
    }
    public static void main(String args[])
    {
        new thread2();
        try
        {
            for (int i=5;i>0;i--)
            {
                System.out.println("main thread" +i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("main interuppted");
        } 
         System.out.println("existing main thread");
    }
}