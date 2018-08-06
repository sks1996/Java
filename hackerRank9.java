//Project Euler #77: Prime summations

import java.util.*;
public class hackerRank9
{
    public static int [] f;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            ArrayList h=store(a);
            f=new int[h.size()];
           //int[] values = Ints.toArray(list)
            f=convertIntegers(h);
          /* for(int k = 0; k < f.length; k++)
           {   
            System.out.println(f[k]);
           }
            */
         
          int g=0;
          g =g+comb1(a);
        //  System.out.print(g);
          
        }          
    }
    
    
    
    //funtion to convert arraylist to array of integer
    public static int[] convertIntegers(ArrayList<Integer> integers)
{
    int[] ret = new int[integers.size()];
    Iterator<Integer> iterator = integers.iterator();
    for (int i = 0; i < ret.length; i++)
    {
        ret[i] = iterator.next().intValue();
    }
    return ret;
}
    
    
public static boolean isprime(int a)
{
    int c=0;
    for(int j=1;j<=a;j++)
    {
        if(a%j==0)
        {
            c++;
        }
    }
    if (c==2)
    {
        return true;
    }
    else return  false;
}


public static ArrayList store(int a)
{
    ArrayList<Integer> x=new ArrayList<>();
    for(int j=2;j<=a;j++)
    {
        if( isprime(j)==true )
        {
            x.add(j);
        }
    }
    return x;
}

public static int comb1(int w)
{
    int a=0,sum=0;
    for(int j=0;j<f.length;j++)
    {
     System.out.println(f[j]);
        while(a<w)
        {
            
             a+=f[j];//problem ?? // j++
              System.out.println(a);
        }
         
   // System.out.println(a);
    if(a==w)
    {
        sum+= 1;
    }
    else
    {
        sum+=0;
    }
    
    }
      System.out.println(sum);
    return sum;
  
    
}


}