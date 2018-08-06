import static java.lang.Math.pow;
import java.math.BigInteger;
import java.util.*;

public class hackerRank100 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        BigInteger n=sc.nextBigInteger();
        BigInteger a[]=new BigInteger[100];
     // BigInteger d[]=new BigInteger[10000000];
        a=dlna(a);  
        value(a,n.intValue());
    }
    
     
    public static  BigInteger[] dlna(BigInteger a[])
    {
       int  j=1,i=0,f=0;
        
        
           a[0]=BigInteger.valueOf(0);
           for(int k=1;k<a.length;k=(int) (k*j))
           {
            double x=1;
            x=Math.pow(2,i);
            x*=3;
            System.out.println(x);
            double y=x;
            for(j=1;j<=x;j++)
            {
                
                a[f]=BigInteger.valueOf((int)y);
                f++;
                y--;
            }
            i++;
            f=(int) x++;
           }
         for (i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        return a;
    }
    public static void value(BigInteger a[],int k)
    {
        System.out.print(a[k]);
    }
    
}
