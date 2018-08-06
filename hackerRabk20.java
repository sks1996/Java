import java.util.*;
import java.math.*;
public class hackerRabk20 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger a=BigInteger.ONE;
        for(int i=0;1>0;i++)
        {
            
            BigInteger b=a.pow(n);
            a=a.add(BigInteger.ONE);
           // System.out.println(b);
         //  System.out.println(count(b));
            
            if(n==count(b))
            {
                System.out.println(b);
            }
            if(n<count(b))
            {
                System.exit(0);
            } 
            
        }
    }
    public static int count(BigInteger i)
    {
        int c=0;
        while(!i.equals(BigInteger.ZERO))
        {
            c++;
            i=i.divide(BigInteger.TEN);
        }
        return c;
    }
}
