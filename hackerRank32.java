import java.util.*;

public class hackerRank32 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int k=0;
            int x=sc.nextInt();
            for(int j = 1;j<x;j++)
            {
               if((j^x) >=x)
               {
                   k++;
               }               
            }
            System.out.println(k);
        }
    } 
} 
