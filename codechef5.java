import java.util.*;
class codechef5
{
    public void sum(int t,int v)
    {
        int c=t+v;
        if(t>v)
        {
          System.out.println(t+" "+c);  
        }
        else
        System.out.println(v+" "+c);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        codechef5 ob=new codechef5();
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            int t=sc.nextInt();
            int d=sc.nextInt();
            ob.sum(t,d);
        }
    }
}