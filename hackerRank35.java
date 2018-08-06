import java.util.*;
public class hackerRank35
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int t=sc.nextInt();
       int a[]=new int[t];
       int s=0;
       for (int i =0;i<t;i++)
       {
           a[i]=sc.nextInt();
       } 
       int g=n;
       for(int j=0;j<t;j++)
       {
           if(j==t-1)
           {
               break;
           }
            int k=0;
            k=g-a[j];
           // System.out.println(k);
            if(k<5)
            {
                g=n;
                s+=n-k;
            }
            else
            {
                g=g-a[j];
            }
            // System.out.println(g);
       }
       System.out.println(s);
    }
}
