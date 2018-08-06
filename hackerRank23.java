import java.util.Scanner;
import java.math.BigInteger;

class hackerRank23 
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        BigInteger x=sc.nextBigInteger();
        BigInteger y=sc.nextBigInteger();
        BigInteger a=sc.nextBigInteger();
        BigInteger b=sc.nextBigInteger();
        BigInteger k= x.divide(a).add(y.divide(b)).divide(BigInteger.valueOf(2));
        System.out.println((double)k.intValue());
        int q=b.intValue()*k.intValue();
        System.out.println((double) (y.intValue()-q));
    }
    
}
