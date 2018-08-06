import java.math.BigInteger;
import java.util.*;
class hackerRank15 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger x,y;
        for(int i=0;i<n;i++)
        {
            BigInteger o=BigInteger.ZERO;
            BigInteger k=sc.nextBigInteger();
         //   System.out.println(factor(BigInteger.valueOf(28)));
            while(!k.equals(BigInteger.valueOf(10)))
                {
            x=factor(k);
            y=factor(x);
          //  m=factor(y);
                if(y.equals(k) && !x.equals(k))
                    {       
                       // System.out.println(k+" "+y);
                    o=o.add(k);
                }
                k=k.subtract(BigInteger.ONE);
            }
                System.out.println(o);
            
        }
    }
    public static BigInteger factor(BigInteger a)
    {
        long i;
        BigInteger c=BigInteger.ZERO;
        for(i=1;i<a.intValue();i++)
        {
            if(a.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO))
            {
                c=c.add(BigInteger.valueOf(i));
            }
        }
           return c;
    }
    
}