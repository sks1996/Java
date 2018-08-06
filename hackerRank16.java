import java.util.*;

public class hackerRank16 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum1(n));
    }
    
    public static int sum1(int a)
    {
        int i,sum=0,d;
        double p=0;
        for(i=2;i<=1000000;i++)
        {
            p=0;
         int k=i;
         while(k>0)
         {
             d=k%10;
           //  System.out.println(d);
             p=p+(int)Math.pow(d,a);
            // System.out.println(p);
             k=k/10;
         }   
         if(i==p)
         {
            // System.out.println(p);
             sum+=p;
         }
        }
        return sum;
    }
}
