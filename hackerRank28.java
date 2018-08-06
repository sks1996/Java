import java.util.Scanner;
import java.math.BigInteger;
public class hackerRank28 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        BigInteger a[][]=new BigInteger[n][n];
        int i ,j=0;
        for( i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextBigInteger();
            }
        }
        for( i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        } 
        BigInteger sum=BigInteger.ZERO;
        sum=sum.add(a[0][0]);
        sum=sum.add(a[n-1][n-1]);
        for( i=0;i<n-1;i++)
        {
            for(j=0;j<n-1;j++)
            {
             if(a[i][j+1].compareTo(a[i+1][j])>0)
             {
                 sum=sum.add(a[i+1][j]);
                 System.out.println(a[i+1][j]);
                 j++;
             }
            else if(a[i][j+1].compareTo(a[i+1][j])<=0)
             {
                 sum=sum.add(a[i][j+1]);
                 System.out.println(a[i][j+1]);
                 i++;
             }
            else  if(i==n-1)
              {
                  sum=sum.add(a[i][j]);
                  j++;
              }
              else if (j==n-1)
              {
                  sum=sum.add(a[i+1][j]);
                  i++;
                  
              }
               if(i==n-1 && j==n-1)
               {
                   break;
               }
            }
        }        
System.out.println(sum);
        }
}
