import java.math.BigInteger;
import java.util.*;

class hackerRank105
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger a[][]=new BigInteger[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                BigInteger s=sc.nextBigInteger();
                a[i][j]=s;
            }
        }
        /* for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.println(a[i][j]);
            }
        }
        */
    }
    
}
