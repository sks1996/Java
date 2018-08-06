import java.math.BigInteger;
import java.util.*;

class hackerRank101 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,c;
        m=sc.nextInt();
        n=sc.nextInt();
        c=sc.nextInt();
       // int x=fact(m);
      //  int y=fact(n);
       // int z=fact(c);
       // double h=(x/(z*fact(m-c)))*(y/(z*fact(n-c)));
       // double t=h+(m-c)+(n-c)+c+1;
      // int t= fact(((m-c)+(n-c)+c-1)) ;
      BigInteger t= fact(((m-c)+(n-c)+c-1)) ;
       System.out.print(t);
    }
    public static BigInteger fact(int a)
    {
        int i;
        BigInteger f=BigInteger.ONE;
        for(i=1;i<=a;i++)
        {
            f=f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
