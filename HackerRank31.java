import java.util.*;
public class HackerRank31 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int t=c*m;
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=t)
            {
                k++;
            }
        }
        if(k==n)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    
}
