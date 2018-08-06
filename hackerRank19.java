import java.math.BigInteger;
import java.util.*;

class hackerRank19 
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt(); 
        while(k>0)
        {
        BigInteger n=sc.nextBigInteger();
        n=n.subtract(BigInteger.ONE);
        //  int y=odd(n);
      //    System.out.println(y);
       int c=0;
       while(!n.equals(BigInteger.TEN))
        {   
            int x=rev(n);
           // System.out.println(x);
            BigInteger a=n.add(BigInteger.valueOf(x));
          //  System.out.println(a);
            if(odd(a)==1 )
            {
                c++;
            }
            n=n.subtract(BigInteger.ONE);
        }
       System.out.println(c-4); 
     //  k=k.subtract(BigInteger.ONE);
      k++;
        }
    }
    public static int rev(BigInteger b)
    {
        int rev=0,a=b.intValue();
        while(a > 0){
                    int temp = a % 10;
                    a = a / 10;
                    rev = rev * 10 + temp;
                    }
        return rev;
   }
   public static int odd(BigInteger a)
   {
       int c=0,t=0;
     //  int l=a.bitLength();
      // int k=a.bitCount();
      // System.out.println(k);
    while(!a.equals(BigInteger.ZERO))
       {
           int d=a.intValue()%10;
           //System.out.println(d);
           t++;
           if(d%2!=0 && d!=0)
           {
               c++;
           }
           a=a.divide(BigInteger.TEN);
         //  System.out.println(a);
       }
       //System.out.println(l);
      //System.out.println(c);
       if(c==t)
           return 1;
       else 
           return 0;
   }
}
