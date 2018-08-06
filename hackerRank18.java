import java.math.BigInteger;
import java.util.*;
class hackerRank18 
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc =new Scanner(System.in);
        BigInteger n=sc.nextBigInteger();
        int k=sc.nextInt();
        int sum=0;
       while(!n.equals(BigInteger.ZERO))
       {
            
            int g=pallin(n.intValue());
            // int h=131;
            String s=Integer.toString( n.intValue(),k);
            if(g==1 && pallin1(s)==1 )
            { 
                sum+=n.intValue();
            }
       // System.out.println(Integer.toBinaryString(454));
     //  String j=Integer.toBinaryString(g);
        // String s=Integer.toString( h,2);
        //System.out.println(s);
        n=n.subtract(BigInteger.ONE);
       // String s = Integer.toBinaryString(h);
       }
       System.out.println(sum);
    }
    public static int pallin(int b)
    {
        int rev=0,a=b;
        while(a > 0){
                    int temp = a % 10;
                    a = a / 10;
                    rev = rev * 10 + temp;
                    }
                       if(rev==b)
                           return 1;
                       else 
                           return 0;
 
   }
    public static int pallin1(String s)
    {
       // BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
      // System.out.println("enter the string");
      // String s1=br.readLine(s);
       String reverse=new StringBuilder(s).reverse().toString();
       if(s.equals(reverse))
           return 1;
       else
         return 0;
    }
    
    
}
