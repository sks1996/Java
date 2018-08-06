class thread1
{
    public static void main(String args[])
    {
        Thread t= Thread.currentThread();
        System.out.println("current thread "+t);
        t.setName("i am sks");//change the name of the thread
        System.out.println("thread name after change"+t);
        try
        {
            for(int n=5;n>0;n--)
            {
                System.out.println(n);
                Thread.sleep(1000);
                
            }
        }
        catch (InterruptedException e)  {
            System.out.println("main thread interrupted");
       }
    }
}