import java.util.*;
class codechef7
{
    public void check(int t)
    {
        int s=0;
        int l=length(t);
      // System.out.println(l);
                int d=t%10;
                int g=t/((int) (Math.pow(10,l-1)));
                //System.out.println(g);
               s=g+d;
         
        System.out.println(s);
    }
    public int length(int t)
    {
      int c=0;
        for (int i=t;i>0;i=i/10)
        {
               c++;
            }
        return c;        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        codechef7 ob=new codechef7();
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            int t=sc.nextInt();
            ob.check(t);
        }
    }
}
 