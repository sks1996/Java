import java.util.*;

class hackerRank103 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[1000];
        a=put(a);
         for(int i=1;i<1000;i++)
        {
            System.out.println(a[i]);
        }
       
    }
    public static int[] put(int a[])
    {
        a[0]=0;
        int j=0;
        for(int i=1;i<1000;i++)
        {
            j++;
         if(abc(j)>0)
                 {
                     j++;
                     a[i]=j;
                 }
         a[i]=j;
         
     /*   else
         {
             a[i]=j;
         } */
        
        }
        return a;
    }
    public static int abc(int a)
    {
        int c=0,sum=0;
        while(a>0)
        {
            int d=a%10;
            if(d==4)
            { 
            c++;
            break;
            }
            sum=sum*10+d;
            if(sum==31)
            {
                c++;
            }
            a=a/10;
        }
        return c;
    }
}