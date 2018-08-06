//Project Euler #20: Factorial digit sum

import java.math.BigInteger;
import java.util.*;

public class hackerRank5 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            int a=sc.nextInt();
      //  BigInteger a=sc.nextBigInteger();
      //  System.out.println(fact(a));
        BigInteger s=BigInteger.ZERO;
        s=s.add(fact(a));
        System.out.println(count1(s));
        }
        
    }
     public static BigInteger fact(int t)
    {
       BigInteger f=BigInteger.ONE;
    // BigInteger i=BigInteger.ONE;
        while (t>0)
        {
            f = f.multiply(BigInteger.valueOf(t));
           t--;
        } 
        return(f);
    }
     /*
    public static BigInteger fact(BigInteger t)
    {
       BigInteger f=BigInteger.ONE;
    // BigInteger i=BigInteger.ONE;
        while (!t.equals(BigInteger.ONE))
        {
            f = f.multiply(t);
            t = t.subtract(BigInteger.valueOf(1));
        } 
        return(f);
    } */
    static BigInteger count1(BigInteger result )
    {   
        BigInteger sum = BigInteger.valueOf(0);
        while (!result.equals(BigInteger.ZERO))
        {
       sum = (sum.add(result.mod(BigInteger.valueOf(10))));
        result = result.divide(BigInteger.valueOf(10));
       // System.out.println(sum + " "+ result);
        }
    return sum;
    }
    
}
