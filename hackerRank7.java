// Project Euler #1: Multiples of 3 and 5
import java.util.*;
import java.math.BigInteger;

class hackerRank7 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            BigInteger x=sc.nextBigInteger();
            System.out.println(sum1(x));
        }
    }
    
    public static BigInteger sum1(BigInteger result)
    {
        BigInteger sum=BigInteger.ZERO;
     //   BigInteger sum1=BigInteger.valueOf(0);
         while (!result.equals(BigInteger.ZERO))
        {
        //bi3 = bi1.divide(bi2);
        BigInteger bi;
        int s=0;
        bi=result.remainder(BigInteger.valueOf(5));
        int c=result.intValue();
        int d=c%5;
        // System.out.println(bi);
        //if(bi.signum()==0)
        if(d==0)
        {
          s=s+bi.intValue();
            sum=sum.add(bi);
            System.out.println(s);
            System.out.println(sum);
//    sum = (sum.add(result.mod(BigInteger.valueOf(5))));
        }
         if(result.mod(BigInteger.valueOf(3)).equals(0))
         {
        sum= (sum.add(result.mod(BigInteger.valueOf(3))));
         }
        result = result.subtract(BigInteger.valueOf(1));
        //System.out.println(sum);
        }
         return sum;
    }
}
