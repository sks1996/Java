    import java.util.Scanner;
    import java.math.BigInteger;
    public class hackerRank21 
    {
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
    //      BigInteger a[]=new BigInteger[n];
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
             BigInteger a=sc.nextBigInteger();
            int x=0;
            a=a.subtract(BigInteger.ONE);
            BigInteger j=BigInteger.ZERO;
            while(!j.equals(a))
            {
                j=j.add(BigInteger.ONE);
                int d=j.intValue();
                if(d==0)
                {
                    continue;
                }
                BigInteger w=reverse(j);
                 int k=w.intValue();
                if(k==0)
                {
                    continue;
                }
              //  System.out.println("the reverse of number "+w);
                w=j.add(w);            
              // System.out.println(w);
               // System.out.println(digit(w));
                if(odd(w)==digit(w))
                {
                    x++;
                }

            }
            System.out.println(x-5);   
        }
        }

        public static int digit(BigInteger a)
        {

            int c=0;
            while(!a.equals(BigInteger.ZERO))
                    {
                     c++;
                     a=a.divide(BigInteger.TEN);
                    }
            return c;
        }
        public static int odd(BigInteger a)
        {
            int c=0;
            while(!a.equals(BigInteger.ZERO))
                    {
                        int d=a.intValue()%10;
                        if(d%2!=0)
                        {
                            c++;
                        }
                         a=a.divide(BigInteger.TEN);
                    }
            return c;
        }

         public static BigInteger  reverse(BigInteger a)
        {

            BigInteger b=BigInteger.ZERO;
            while(!a.equals(BigInteger.ZERO))
                    {
                        int d=a.intValue()%10;
                     b=b.multiply(BigInteger.TEN).add(BigInteger.valueOf(d));
                     a=a.divide(BigInteger.TEN);
                    }
            return b;
        }
    }