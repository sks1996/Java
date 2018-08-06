import java.util.Scanner;
import java.math.BigInteger;

class hackerRank22 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int sum=0;
        for(int i=0;i<n;i++)
        {
            BigInteger a=sc.nextBigInteger();
            BigInteger b=sc.nextBigInteger();
            BigInteger t=a;
           
            while(!t.equals(b))
            {
                
                if(prime(t)==true)
                {
                    int m=a.intValue()*t.intValue();
                    sum+=m;
                    a=t;
                }
                System.out.println(sum);
                   
            }
        }
        System.out.println(sum);
    }
    public static boolean prime(BigInteger number) {
    if (!number.isProbablePrime(5))
        return false;

    BigInteger two = new BigInteger("2");
    if (!two.equals(number) && BigInteger.ZERO.equals(number.mod(two)))
        return false;

    for (BigInteger i = new BigInteger("3"); i.multiply(i).compareTo(number) < 1; i = i.add(two)) {
        if (BigInteger.ZERO.equals(number.mod(i)))
            return false;
    }
    return true;
}
   /* public static BigInteger tutu(BigInteger a)
    {
     //   
    } */
}
