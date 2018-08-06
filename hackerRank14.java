//Project Euler #50: Consecutive prime sum

import java.math.BigInteger;
import java.util.*;

class hackerRank14 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        BigInteger e;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            e=sc.nextBigInteger();
             while (!e.equals(BigInteger.ZERO))
        {
            check(e);
            
          // BigInteger a=sc.nextBigInteger();
         //  al.add(a);
            
         
        }
        } 
    }
  /*  public static int prime(BigInteger a)
    {
        long i,c=0;
        for(i=1;i<a.intValue();i++)
        {
            if(a.mod(BigInteger.valueOf(i)).equals(0))
            {
                c++;
            }
        }
            if(c==2)
                return 1;
            else
                return 0;      
        } */
       public static int prime(int a)
    {
        int i,c=0;
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
                c++;
            }
        }
            if(c==2)
                return 1;
            else
                return 0;      
        }
    public static void check(BigInteger a)
    {
        int sum=0;
         long i;
        for(i=1;i<a.intValue();i++)
        { 
 //         System.out.println(a.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO));
         //   System.out.println(prime((int) i));
            if(a.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO) && prime((int) i)==1)
            {
                sum+=i;
               System.out.print(sum);
            if(sum==a.intValue())
            {
                System.out.println(a);
            }
            
            }
        }
    }
}

