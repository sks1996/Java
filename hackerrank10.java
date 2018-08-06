import java.math.BigInteger;
import java.util.*;

public class hackerrank10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(count1(fact(n)));
    }
    
     public static BigInteger fact(int t)
    {
       BigInteger f=BigInteger.ONE;
    // BigInteger i=BigInteger.ONE;
        while (t>0)
        {
            f = f.pow(t);
           t--;
        } 
        return(f);
    }
    
    
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
