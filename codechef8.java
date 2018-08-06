import java.util.*;
class codechef8
{
    public void check(int t,int e)
    {
        int s=0;
        for(int i=t;i<=e;i++)
        {
        int r=rev(i);
        if(r==i)
        {
            s=s+r;      
        }
        }
        System.out.println(s);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        codechef8 ob=new codechef8();
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            int t=sc.nextInt();
            int v=sc.nextInt();
            ob.check(t,v);
        }
    }
public static int rev(int a)
    {
        int rev=0;
        for (int i=a;i>0;i=i/10)
        {
           rev=rev*10+(i%10);
        }
            return rev;
    }
}