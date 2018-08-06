class myexception extends Exception
{
    int b;
    myexception(int a)
    {
        b=a;
    }
    public String toString()
    {
        return "my exception";
    }
}
class demo
{
    static void compute (int a) throws myexception
    {
        System.out.println("called compute ");
        if(a<0)
            throw new myexception(a);
        System.out.println("normal exit  ");
    }
    public static void main(String args[])
    {
        try
        {
            compute(3);
            compute(-1);
        }
        catch(myexception e)
                {
                    System.out.println("caught" + e);
                }
    }
}