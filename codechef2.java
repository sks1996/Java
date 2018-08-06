import java.util.*;
class codechef2
{
    
    public void reverse(int v)
    {
        int rev=0;
        for (int i=v;i>0;i=i/10)
        {
            int d=i%10;
            rev=rev*10+d;    
        }
        System.out.println(rev);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        codechef2 ob=new codechef2();
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            int t=sc.nextInt();
            ob.reverse(t);
        }
        
    }
}