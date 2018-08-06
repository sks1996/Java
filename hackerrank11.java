import java.math.BigInteger;
import java.util.*;

public class hackerrank11 
{
    public static BigInteger f;
    static Object obj;
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        BigInteger n=sc.nextBigInteger();
      // BigInteger a[]=new BigInteger[n.intValue()];
        List<BigInteger> al = new ArrayList<>();
         while (!n.equals(BigInteger.ZERO))
        {
           BigInteger a=sc.nextBigInteger();
           al.add(a);
            n = n.subtract(BigInteger.valueOf(1));
        }
          obj = Collections.max(al);
            // System.out.println(obj);
                f=(BigInteger)obj;
              int h=tut(al);
              System.out.println(h);
           
    }

    public static  int tut(List al)
    {
        int c=0;        
        ListIterator<BigInteger> itr=al.listIterator();  
    /*    System.out.println("traversing elements in forward direction...");  
       // System.out.println(f);
        while(itr.hasNext())
        {  
           // BigInteger a=(BigInteger)al.get(itr.nextIndex());
           // System.out.println(a);
            if((BigInteger)al.get(itr.nextIndex())==f)
            {
                System.out.println ( (BigInteger)al.get(itr.nextIndex()) );
                c++;
              //System.out.println(c);
            }
         itr.next();
         } 
        for (Object obj : al)   
            System.out.println("element: " + obj+ ", count: " + Collections.frequency(al, obj));
        //return c; */
        int u=Collections.frequency(al, obj);
        return u;
        }
  
	
     
}
