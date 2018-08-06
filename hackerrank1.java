
//Euler problem 56 hackerRank

import java.math.BigInteger;
import java.util.*;
public class hackerrank1 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i ,n, s=0;
        n=sc.nextInt();
            BigInteger d=power(n);       
           // System.out.println(d);
            BigInteger f=count1(d);
            System.out.println(f);
            
    
    }
    static BigInteger count1(BigInteger result)
    {   
        BigInteger sum = BigInteger.valueOf(0);
         while (!result.equals(BigInteger.ZERO))
         {
        sum = sum.add(result.mod(BigInteger.valueOf(10)));
        result = result.divide(BigInteger.valueOf(10));
       // System.out.println(sum + " "+ result);
        }
    return sum;
    }
     static BigInteger power(int n)
    {
        BigInteger f=BigInteger.valueOf(n-1).pow(n-1);
         //   f = f.pow(n-1);
         //   BigInteger big2 = BigInteger.valueOf(0);
          //  System.out.println(f);//return the factorial of the number
            return f;
/*    for(long i = 1; i<2830; i++)
    {
        //returns the sum of the power digit
         big2 = big2.add(f.mod(BigInteger.valueOf((long) Math.pow(10,i))).divide(BigInteger.valueOf((long)Math.pow(10,i-1))));
    }

             return big2;
    }        */
    }
}
