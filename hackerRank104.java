import java.math.BigInteger;
import java.util.*;

class hackerRank104 
{
    public static void main(String args[])
    {
        int t=0,c=0;
        Scanner sc=new Scanner(System.in);
        BigInteger n=sc.nextBigInteger();
        //BigInteger t=n.pow(2);
        //BigInteger u[]=fact1(n.pow(2));
        ArrayList<Integer> u=fact1(n.pow(2));
       // Iterator<Integer> i = u.iterator();
        for(t=1;t<u.size();t++)
        {
            int d=u.get(t);
            if(d==n.intValue())
            {
                break;
            }
            if(n.intValue()%d!=0)
            {
                c++;
            }
        }
       /* while ( i.hasNext() && u.get(i)<n.intValue() )
        {
        if(n.intValue()%i!=0)
            {
              //  System.out.println(u[i]);
                c++;
            }
        i.next();   
        
        } */
       /* while(u[i].intValue()>0 && u[i].intValue()<n.intValue())
        {
             
            if(n.intValue()%u[i].intValue()!=0)
            {
              //  System.out.println(u[i]);
                c++;
            }
            i++;
        } */
        System.out.println(c);
    }
/*    {
        // ArrayList<Integer> al = new ArrayList<>();
        int i,j=0;
        BigInteger x[]=new BigInteger[1000000];
        for(i=1;i<=a.intValue();i++)
        {     
            if(a.intValue()%i==0)
            {
                x[j++]=BigInteger.valueOf(i);
                //x[j++]=i;
            }
        }
        return x;
    } */
    public static ArrayList fact1(BigInteger a)
    {
        ArrayList<Integer> al = new ArrayList<>();
          for(int i=1;i<a.intValue();i++)
        {     
            if(a.intValue()%i==0)
            {
                al.add(i);
                //x[j++]=i;
            }
        }
          return al;
    }
}
