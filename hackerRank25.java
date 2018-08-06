import java.math.BigInteger;
import java.util.*;

public class hackerRank25 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        BigInteger t=BigInteger.valueOf(50);
       
        BigInteger a=BigInteger.valueOf(b).pow(1000);
       // System.out.println(a); //its working
        while(!t.equals(a))
            {
            int i=sum(t);   
            BigInteger s=BigInteger.valueOf(i);
             BigInteger z=BigInteger.ONE;
            for(int j=1;j<1000;j++)
                {
                    z=z.multiply(s);
                    //z=s.pow(j);
                    if(z.equals(t))
                        {
                        System.out.print(t+" ");
                    }
                if(z.compareTo(t)>0)
                    {
                    break;
                }
            }
             t=t.add(BigInteger.ONE);
        }
    }
    public static int sum(BigInteger a)
        {
        int  t=0;
        while(a.compareTo(BigInteger.ZERO)>0)
            {
            t=t+(a.mod(BigInteger.TEN)).intValue();
            a=a.divide(BigInteger.TEN);
        }
        return t;
    }
}