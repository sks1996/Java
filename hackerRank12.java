import java.math.BigInteger;
import java.util.*;
class hackerRank12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        BigInteger t=sc.nextBigInteger();
        double f= 0.5*a+0.5*b;
        long M = 1000000000+7;
        long d=(long)f%M;
        
        BigInteger x=BigInteger.valueOf(d);
        x=x.multiply(t);
        
      //  x=x.divide(BigInteger.valueOf(M));
        System.out.println(x);
    }
    
}
