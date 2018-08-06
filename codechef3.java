import java.util.*;
import java.math.BigInteger;
class codechef3
{
    public static void check(BigInteger t)
    {
       BigInteger f=BigInteger.ONE;
    // BigInteger i=BigInteger.ONE;
        while (!t.equals(BigInteger.ONE))
        {
            f = f.add(t);
            t = t.subtract(BigInteger.valueOf(1));
        } 
        System.out.println(f);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            BigInteger t=sc.nextBigInteger();            
                check(t);
        }
    }
}
