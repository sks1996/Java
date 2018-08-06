import java.util.*;
import java.math.BigInteger;

public class hackerRank27 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc=new Scanner(System.in);
       
       ArrayList<BigInteger> all=new ArrayList<>();
       int n=sc.nextInt();
       
       for(int i=0;i<n;i++)
       {
           BigInteger sum=BigInteger.ZERO;
           ArrayList<BigInteger> al=new ArrayList<>();
           for(int j=1;j<=3;j++)
           {
               al.add(sc.nextBigInteger());
           }
           sum=sum.add(Collections.max(al));
           al.remove(Collections.max(al));
           sum=sum.add(Collections.max(al));
            all.add(sum);   
           System.out.println(al);
       }
        System.out.println(all);
        System.out.println(Collections.max(all));
    }
}