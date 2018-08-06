//problem no 34
import java.math.BigInteger;
import java.util.*;

public class hackerRank17 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        BigInteger n=sc.nextBigInteger();
       // System.out.println(fact(n.intValue()));
       if(n.intValue()<10)
            {
                System.out.print(0);
            }
       while(!n.equals(BigInteger.ZERO))
        {
            if(break1(n).mod(n).equals(BigInteger.ZERO) && n.intValue()>9)
            {
                System.out.println(n);
            }
             n = n.subtract(BigInteger.valueOf(1));
             
        }
    }
    public static BigInteger fact(int a)
    {
        BigInteger sum=BigInteger.ONE;
        for(int i=1;i<=a;i++)
        {
           sum= sum.multiply(BigInteger.valueOf(i));
        }
        return sum;
    }
    public static BigInteger break1(BigInteger n)
    {
        BigInteger sum=BigInteger.ZERO;
        int f=n.intValue();
        while(f>0)
        {
        int d=f%10;
        sum=sum.add(fact(d));
     //  System.out.println(fact(d));
        f=f/10;
    }
        
    return sum;
   
    }
}