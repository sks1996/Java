import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class hackerRank13 
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        BigInteger n=sc.nextBigInteger();
        BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
        String s=br.readLine().toLowerCase();
       // StringBuffer sb=new StringBuffer(s);
    /*    while(!n.equals(BigInteger.ZERO))
        {
           BigInteger a=sc.nextBigInteger();
            n = n.subtract(BigInteger.valueOf(1)); */
            char ch ;
            int i,u=0,f=0,c=0; 
            for(i=0;i<s.length();i++)
            {
                if(u==0)
                {
                    c++;
                  //  System.out.println(c);
                }
               
                ch=s.charAt(i);
                if(ch=='u')
                {
                    u++;
                }
                else
                    u--;
                 if(c==2)
                {
                    c=0;
                    f++;
                }
            }
            System.out.println(f);
    }    
}
